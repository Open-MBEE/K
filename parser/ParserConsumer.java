import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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
	
	// create the parse tree from the model parser
	ParseTree tree = parser.model(); // begin parsing at init rule
	
	// Create a generic parse tree walker that can trigger callbacks
	//ParseTreeWalker walker = new ParseTreeWalker();
	
	// Walk the tree created during the parse, trigger callbacks
	//walker.walk(new TestListener(), tree);
	
	KVisitor kvisitor = new KVisitor();
	kvisitor.visit(tree);
	
	// print associations map
	kvisitor.printAssociationsMap();
	
	// print a \n after translation
	System.out.println(); 

    }

}
