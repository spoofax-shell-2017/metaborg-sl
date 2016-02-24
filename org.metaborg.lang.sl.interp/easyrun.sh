#! /bin/bash

set -e

mvn exec:exec -Dcountwarmups=0 -Dcountrepeats=10 -Dgraaldatafile=graal.csv -Djdkdatafile=jdk.csv -Dinputfile=$1
