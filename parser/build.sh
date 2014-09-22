java -jar ./antlr-4.4-complete.jar ../grammar/Model.g4
mv ../grammar/*.java .
mv ../grammar/*.tokens .
javac -cp ./antlr-4.4-complete.jar:. Model*.java
