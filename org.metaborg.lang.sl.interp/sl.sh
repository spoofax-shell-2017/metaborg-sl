#! /bin/bash

set -e

BASE_DIR=`pwd`

GRAAL_FLAGS='
  -ea
  -G:TruffleCompilationThreshold=10
  '
#  -G:+TraceTruffleCompilation
#  -G:+TraceTrufflePerformanceWarnings
#  -G:+FailedLoopExplosionIsFatal
#  -G:+TruffleCompilationExceptionsAreFatal

GRAAL_SUITE='/Users/vladvergu/tud/slde/software/truffle/graal-root/graal-compiler'

CLASSPATH="$1"

DATESTAMP=`date +%Y%m%d_%H%M%S`
DATAFILE="data_$DATESTAMP.csv"
cp data.csv.model $DATAFILE
COUNTER=0
while [  $COUNTER -lt 10 ]; do
  mx --primary-suite-path $GRAAL_SUITE \
    --vm server vm $GRAAL_FLAGS \
    -Xbootclasspath/a:target/classes:$CLASSPATH \
    org.metaborg.lang.sl.interp.Main "${*:2}" $DATAFILE
  let COUNTER=COUNTER+1
done

DATESTAMP=`date +%Y%m%d_%H%M%S`
DATAFILE="data_$DATESTAMP.csv"
cp data.csv.model $DATAFILE
COUNTER=0
while [  $COUNTER -lt 10 ]; do
  java -server \
    -Xbootclasspath/a:target/classes:$CLASSPATH \
    org.metaborg.lang.sl.interp.Main "${*:2}" $DATAFILE
  let COUNTER=COUNTER+1
done
