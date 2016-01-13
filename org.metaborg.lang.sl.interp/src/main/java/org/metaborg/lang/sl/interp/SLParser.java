package org.metaborg.lang.sl.interp;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;

import org.apache.commons.io.IOUtils;
import org.metaborg.lang.sl.desugar.desugar;
import org.metaborg.lang.sl.desugar.desugar_all_0_0;
import org.metaborg.meta.interpreter.framework.InterpreterException;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.jsglr.client.ParseTable;
import org.spoofax.jsglr.client.SGLR;
import org.spoofax.jsglr.client.SGLRParseResult;
import org.spoofax.jsglr.client.imploder.TermTreeFactory;
import org.spoofax.jsglr.client.imploder.TreeBuilder;
import org.spoofax.terms.TermFactory;
import org.spoofax.terms.attachments.ParentTermFactory;
import org.spoofax.terms.io.binary.TermReader;

import com.oracle.truffle.api.source.Source;

public class SLParser {

	private Path parsetablePath;
	private SGLR parser;

	public SLParser(Path parsetablePath) {
		this.parsetablePath = parsetablePath;
	}

	public IStrategoTerm parse(Source src, String startSymbol) {
		if (parser == null) {
			createParser();
		}

		try {

			SGLRParseResult parseResult = parser.parse(
					IOUtils.toString(src.getInputStream()), src.getName(),
					startSymbol);
			IStrategoTerm programterm = (IStrategoTerm) parseResult.output;
			return desugar_all_0_0.instance.invoke(desugar.init(), programterm);
		} catch (Exception e) {
			throw new InterpreterException("Parse failure", e);
		}
	}

	private void createParser() {
		TreeBuilder treebuilder = new TreeBuilder(new TermTreeFactory(
				new ParentTermFactory(new TermFactory())));

		parser = new SGLR(treebuilder, loadPT());
		parser.setUseStructureRecovery(false);
	}

	private ParseTable loadPT() {
		TermFactory factory = new TermFactory();
		try (InputStream stream = new FileInputStream(new File(
				parsetablePath.toUri()));) {
			TermReader termReader = new TermReader(factory);
			IStrategoTerm parseTableTerm = termReader.parseFromStream(stream);
			return new ParseTable(parseTableTerm, factory);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
