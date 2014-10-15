package k.frontend;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;


public class TestListener extends ModelBaseListener implements ModelListener{

    @Override 
	public void enterEveryRule(@NotNull ParserRuleContext ctx) { 
	System.out.println("EnterRule: " + ctx.getText());
	System.out.println("*************************");
	
    }
    
    @Override 
	public void enterModel(@NotNull ModelParser.ModelContext ctx) { 
    }

    @Override
	public void enterTypeDeclaration(@NotNull ModelParser.TypeDeclarationContext ctx){
		// simple example of printing out a type 
		System.out.println("Type: " + ctx.getText());
		for(int i = 0; i < ctx.type().children.size(); i++){
		    System.out.println("\t" + ctx.type().children.get(i).getText());
		}
    }
    
    @Override
	public void enterClassDeclaration(@NotNull ModelParser.ClassDeclarationContext ctx) { 



            for(int i = 0; i < ctx.children.size(); i++){

            }
	// simple example of printing out a type 
	//System.out.println("Class: " + ctx.getText());
	
	//for(int i = 0; i < ctx.children.size(); i++){
	//System.out.println("\t^^^" + ctx.children.get(i).getText() + "^^^");
	//}
	
	//System.out.println( ctx.getText());
	
    }
}
