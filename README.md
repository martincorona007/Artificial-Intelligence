# Artificial-Intelligence

## How to compile ##

## SLR ##
1. javac -cp lib/jade.jar  src/examples/slr/SLR.java src/examples/slr/SLRAgent.java src/examples/slr/SLRGui.java -d classes/
2. java -cp lib/jade.jar:classes/ jade.Boot -gui boki:examples.slr.SLRAgent

## MLR ##
1. javac -cp lib/jade.jar  src/examples/mlr/MLR.java src/examples/mlr/MLRAgent.java src/examples/mlr/MLRGui.java -d classes/
2. java -cp lib/jade.jar:classes/ jade.Boot -gui boki:examples.mlr.MLRAgent
