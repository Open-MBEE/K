@echo off
java -jar ..\antlr-4.4-complete.jar -no-listener -visitor ..\grammar\Model.g4
move ..\grammar\\*.java .
move ..\grammar\\*.tokens .
rem move Model* ..\k\frontend\
