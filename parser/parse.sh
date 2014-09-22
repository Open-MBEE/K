#!/bin/bash
java -cp ./antlr-4.4-complete.jar:. org.antlr.v4.runtime.misc.TestRig Model model $@
