#! /bin/bash

set -e

BASE_DIR=`pwd`

GRAAL_FLAGS='
  -ea
  -G:TruffleCompilationThreshold=2
  -G:TruffleMaximumRecursiveInlining=10
  '
#   -G:+TraceTruffleCompilation
#   -G:+TraceTruffleCompilationCallTree
#   -G:+TraceTruffleInlining
#   -G:+TraceTruffleSplitting
#   -G:+TraceTrufflePerformanceWarnings
#   -G:+FailedLoopExplosionIsFatal
#   -G:+TruffleCompilationExceptionsAreFatal
# '

GRAAL_SUITE='/Users/vladvergu/tud/slde/software/truffle/graal-root/graal-compiler'

CLASSPATH="$1"

cp data.csv.model $3

  mx --primary-suite-path $GRAAL_SUITE \
    --vm server vm $GRAAL_FLAGS -Xss32m \
    -Xbootclasspath/a:target/classes:$CLASSPATH \
    org.metaborg.lang.sl.interpreter.generated.BenchmarkRunner "$2" "$3" "$5" "$6"

cp data.csv.model $4
# java -server -Xss32m \
#   -Xbootclasspath/a:target/classes:$CLASSPATH \
#   org.metaborg.lang.sl.interpreter.generated.BenchmarkRunner "$2" "$4" "$5" "$6"
