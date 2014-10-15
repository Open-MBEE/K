java -jar ./antlr-4.4-complete.jar -no-listener -visitor ../grammar/Model.g4
mv ../grammar/*.java .
mv ../grammar/*.tokens .
javac -cp ./antlr-4.4-complete.jar:. Model*.java
