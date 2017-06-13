package org.metaborg.lang.sl.interpreter.natives;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Set;

import org.metaborg.core.MetaborgException;
import org.metaborg.core.language.ILanguageDiscoveryService;
import org.metaborg.core.language.ILanguageImpl;
import org.metaborg.core.resource.IResourceService;
import org.metaborg.spoofax.core.SpoofaxModule;
import org.metaborg.spoofax.core.terms.ITermFactoryService;
import org.spoofax.interpreter.terms.IStrategoTerm;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class StreamMain {

	public static void main(InputStream stdin, OutputStream stdout) {		
		
		Injector injector = Guice.createInjector(new SpoofaxModule());

		ITermFactoryService iTermFactoryService = injector.getInstance(ITermFactoryService.class);
		IResourceService resourceService = injector.getInstance(IResourceService.class);
		ILanguageDiscoveryService languageDiscoveryService = injector.getInstance(ILanguageDiscoveryService.class);

		try (ObjectInputStream in = new ObjectInputStream(stdin);
				ObjectOutputStream out = new ObjectOutputStream(stdout)) {
			IStrategoTerm inputTerm = null;
			URL[] inputLanguageImpls = null;

			Object inObj1 = in.readObject();
			Object inObj2 = in.readObject();
			inputTerm = (IStrategoTerm) inObj1;
			inputLanguageImpls = (URL[]) inObj2;

			try {
				Set<ILanguageImpl> langs = languageDiscoveryService.scanLanguagesInDirectory(resourceService.resolve(inputLanguageImpls[0].toURI()));
				
	            ILanguageImpl langImpl = langs.iterator().next();
				
				ClassPathInterpreterLoader interpreterLoader = new ClassPathInterpreterLoader();
				
				DynSemEvaluationStrategy strategy = new DynSemEvaluationStrategy(interpreterLoader, iTermFactoryService);
				
				// wrap evaluate call to catch Exceptions that would 
				// normally be handled by repl itself
				try {
					IStrategoTerm output = strategy.evaluate(inputTerm, langImpl);
					out.writeObject(new Object[] {
							true,
							output
					});
				} catch (Exception e) {
					out.writeObject(new Object[] {
							false,
							e
					});
				}

			} catch (MetaborgException e) {
				out.writeObject(new Object[] {
						false,
						e
				});
			} catch (URISyntaxException e) {
				/* Shouldn't happen. Uri's come from langImpl */
			}

			out.flush();
			// Closing the out stream before the 'client' reads the output causes an excetpion
			// NG will bug-out and the client won't be able to read the InputStream of our stdout
			// We expect the client to write a null-object to our stdin so that we can close.
			Object shouldBeNull = in.readObject();

		} catch (IOException e) {
			e.printStackTrace();
			try {
				e.printStackTrace(new PrintStream(new File("/tmp/StreamMain_Exception.txt")));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// we can't do much now.
		} catch (ClassNotFoundException | ClassCastException e) {
			e.printStackTrace();
			/* Shouldn't happen. All classes should be known */
		}
	}
	
}
