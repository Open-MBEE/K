import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.parse.*;
import org.antlr.v4.misc.*;
import org.antlr.v4.*;
import java.io.*;
import java.nio.file.*;

public class ParserConsumer {

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
	
	ParseTree tree = parser.model(); // begin parsing at init rule
	
	// Create a generic parse tree walker that can trigger callbacks
	ParseTreeWalker walker = new ParseTreeWalker();
	// Walk the tree created during the parse, trigger callbacks
	walker.walk(new TestListener(), tree);
	
	System.out.println(); // print a \n after translation

    }

}
