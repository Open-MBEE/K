@echo off

IF "%1" == "" (
  GOTO HELP
)

java -classpath .;antlr-4.4-complete.jar org.antlr.v4.runtime.misc.TestRig Model model %1 -gui
GOTO EXIT

:HELP
echo Please provide a file to run on.

:EXIT  