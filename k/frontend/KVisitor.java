package k.frontend;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KVisitor extends ModelBaseVisitor<Void>{
	
	public static Map<String, Set<String>> associations = new HashMap<String, Set<String>>();
	public static Set<String> classes = new HashSet<String>();
	
	String currentClassAssoc = "TOP";
	
	public static void printAssociationsMap(){
		// add the top level model class
		classes.add("TOP");
		
		System.out.println("digraph associations1 {");
		Set<String> initializedClasses = new HashSet<String>();
	    Iterator<Map.Entry<String,Set<String>>> it = associations.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<String,Set<String>> pairs = (Map.Entry<String,Set<String>>)it.next();
	        String associationName = (String) pairs.getKey();
	        Set<String> associationVariables = (Set<String>) pairs.getValue();
	        Iterator<String> it2 = associationVariables.iterator();
	        
	        // skip top level 
	        if(associationName.equals("TOP")) continue;
	        
	        // initialize
	        if(!initializedClasses.contains(associationName)){
	        	System.out.println("\t" + associationName + "[shape=box];");
	        	initializedClasses.add(associationName);
	        }
	        
	        while(it2.hasNext()){       	
	        	String var = (String)it2.next();
		        if(!initializedClasses.contains(var)){
		        	System.out.println("\t" + var + "[shape=box];");
		        	initializedClasses.add(var);
		        }

	        	System.out.println("\t" + associationName + " -> " + var);
	        	it2.remove();
	        }
	        it.remove(); 
	    }
	    System.out.println("}");
	}
	
	public Void visitClassDeclaration(ModelParser.ClassDeclarationContext ctx){

		String name = ctx.Identifier().getText();

		if(ctx.classToken().getText().equals("assoc")){
			currentClassAssoc = name;
			for(int i = 0; i < ctx.memberDeclaration().size(); i++){
				this.visit(ctx.memberDeclaration(i));
			}
			currentClassAssoc = "TOP";
		}
		else{	
			classes.add(name);
		}

		return null;
	}
	
	public Void visitMemberDeclaration(ModelParser.MemberDeclarationContext ctx){
		ModelParser.VariableDeclarationContext vars = ctx.variableDeclaration();
		if(vars != null){
			if(associations.containsKey(currentClassAssoc)){
				Set<String> mapVars = associations.get(currentClassAssoc);
				mapVars.add(vars.typing().type().getText());
				associations.put(currentClassAssoc, mapVars);
			}
			else{
				Set<String> mapVars = new HashSet<String>();
				mapVars.add(vars.typing().type().getText());
				associations.put(currentClassAssoc, mapVars);
			}
			
			for(int i = 0; i < vars.children.size(); i++){
				this.visit(vars.children.get(i));
		    }
		}
		return null;
	}
	
	public Void visitVariableDeclartion(ModelParser.VariableDeclarationContext ctx){
		
		System.out.println(ctx.getText());
		
		return null;
	}
	
	// visit types that are being declared
	public Void visitTypeDeclaration(ModelParser.TypeDeclarationContext ctx){
		
		
		
		return null;
	}
}

