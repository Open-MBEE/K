package k.frontend;

import java.nio.file.Files;
import java.nio.file.Paths;

import k.frontend.ModelParser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {

    public static void main(String[] args) throws Exception{

		byte[] encoded = Files.readAllBytes(Paths.get(args[0]));
		String fileContents = new String(encoded, "UTF-8");
		  
		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(fileContents);
		
		// create a lexer that feeds off of input CharStream
		ModelLexer lexer = new ModelLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		// create a parser that feeds off the tokens buffer
		ModelParser parser = new ModelParser(tokens);
		
		// create the parse tree from the model parser
		ParseTree tree = parser.model(); // begin parsing at init rule
		
		// Scala visitor
		KScalaVisitor ksv = new KScalaVisitor();
		Model m = (Model) ksv.visit(tree);
		System.out.println(m.toString());
		
    }

}
