#! /bin/bash

set -e

mvn exec:exec -Dcountwarmups=0 -Dcountrepeats=1 -Dgraaldatafile=graal.csv -Djdkdatafile=jdk.csv -Dinputfile=$1
