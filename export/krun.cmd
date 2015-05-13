@echo off

if "%1"=="" goto help

java -cp -Xbootclasspath/p: -classpath k.jar;scala-library.jar;antlr-4.4-complete.jar;com.microsoft.z3.jar k.frontend.Main -f %1
goto exit

:help
echo.
echo Please provide a file to run on.
echo.

:exit


