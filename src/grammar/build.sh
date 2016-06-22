#!/bin/bash
java -jar antlr-4.4-complete.jar -package k.frontend -no-listener -visitor Model.g4
mv *.java ../k/frontend/
mv *.tokens ../k/frontend/
