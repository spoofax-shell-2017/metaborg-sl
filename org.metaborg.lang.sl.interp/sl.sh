#! /bin/bash

set -e

BASE_DIR=`pwd`

GRAAL_FLAGS='
  -ea
  -G:TruffleCompilationThreshold=10
  -G:+TraceTruffleCompilation
  -G:+TraceTrufflePerformanceWarnings
  -G:+TraceTrufflePerformanceWarnings
  '
  # -G:+FailedLoopExplosionIsFatal
  # -G:+TruffleCompilationExceptionsAreFatal

GRAAL_SUITE='/Users/vladvergu/tud/slde/software/truffle/graal-root/graal-compiler'

CLASSPATH="$1"

cp data.csv.model $3

# COUNTER=0
# while [  $COUNTER -lt 2 ]; do
  mx --primary-suite-path $GRAAL_SUITE \
    --vm server vm $GRAAL_FLAGS -Xss32m \
    -Xbootclasspath/a:target/classes:$CLASSPATH \
    org.metaborg.lang.sl.interpreter.generated.BenchmarkRunner "$2" "$3"
  # let COUNTER=COUNTER+1
# done

cp data.csv.model $4
# COUNTER=0
# while [  $COUNTER -lt 10 ]; do
 java -server -Xss32m \
   -Xbootclasspath/a:target/classes:$CLASSPATH \
   org.metaborg.lang.sl.interpreter.generated.BenchmarkRunner "$2" "$4"
 # let COUNTER=COUNTER+1
# done
