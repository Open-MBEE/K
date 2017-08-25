#! /bin/bash

java -classpath ".:antlr-4.7-complete.jar" org.antlr.v4.runtime.misc.TestRig Model model $1 -gui
