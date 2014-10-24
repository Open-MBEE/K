java -jar ../antlr-4.4-complete.jar -package k.frontend -no-listener -visitor ../grammar/Model.g4
mv ../grammar/*.java .
mv ../grammar/*.tokens .
mv Model* ../k/frontend/
