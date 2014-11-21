@echo off
java -jar ..\antlr-4.4-complete.jar -package k.frontend -no-listener -visitor ..\grammar\Model.g4
move ..\grammar\\*.java .
move ..\grammar\\*.tokens .
move Model* ..\k\frontend\
