package k.frontend

import k.frontend.ModelBaseVisitor
import k.frontend.ModelParser

class Member (i:String, t:String){
  var _identifier : String = i
  var _type : String = t
}

class ClassAssociation (n:String, a:Boolean){
  var _name : String = n
  var _association : Boolean = a
}

// the type parameter for the ModelBaseVisitork.parser.what we need to return
class KScalaVisitor extends ModelBaseVisitor[Unit] {

  var classesAndAssociations = Set[ClassAssociation]();
  var classAssociationMembers = Map[ClassAssociation, Set[(String,String)]]()
  var currentClassAssociation : ClassAssociation = null
  
  def getMainType (t:ModelParser.TypeContext) : ModelParser.TypeContext = {
    if(t.`type`().size() > 0){
      getMainType ((t.`type`()).get(0))
    }
    else{
      t
    }
  } 
  
  def getMultiplicityString (t:ModelParser.TypeContext) : String = {
    if(t.expressionOrStar() != null){
      var e =  t.expressionOrStar();
      var res = "";
      for (i <- 0 to e.size() - 1){
    	  res += e.get(i).getText();
      }
      res
    }
    else ""
  }

  def printAssociations : Unit = {
    println("graph Structure {");
    
    println(classesAndAssociations.foldLeft("")((acc,v) =>
      if(v._association){
        acc + v._name + " [shape=diamond];\n"
      }
      else{
        acc + v._name + " [shape=box];\n"
      }));
    
    println(classAssociationMembers.foldLeft 
        ("") ((acc,kv) => acc + 
            (kv._2.foldLeft ("") ((acc1, v) => acc1 + kv._1._name + " -- " + v._1 + " [label = \"" + v._2 + "\"]\n")) + "\n"));
    
    println("}");
  }
  
  override def visitClassDeclaration (ctx : ModelParser.ClassDeclarationContext) : Unit = {
    var classAssociationName = ctx.Identifier().getText();
    
    val newClassAssociation = 
		if(ctx.classToken().getText().equals("assoc")){
			currentClassAssociation = new ClassAssociation(classAssociationName, true);
			var memberDeclarations = ctx.memberDeclaration().toArray;
			for(i <- 0 to memberDeclarations.size - 1){ 
			  this.visit(ctx.memberDeclaration().get(i))
			}
			currentClassAssociation
		}
		else{
		  new ClassAssociation(classAssociationName, false)
		}
	currentClassAssociation = null;
	classesAndAssociations += newClassAssociation;
  }

  override def visitMemberDeclaration (ctx : ModelParser.MemberDeclarationContext) : Unit = {
    var variables = ctx.variableDeclaration();
    if(variables != null){
      var mainType = getMainType (variables.typing().`type`());
	  var multiplicityString = getMultiplicityString (variables.typing().`type`());  
      if(currentClassAssociation != null){
	      if(classAssociationMembers.contains(currentClassAssociation)){
	        var associationMembers = classAssociationMembers(currentClassAssociation);	        
	        associationMembers += ((mainType.getText(), multiplicityString));
	        classAssociationMembers += (currentClassAssociation -> associationMembers);
	      }
	      else{
	        classAssociationMembers += (currentClassAssociation -> Set[(String,String)]((mainType.getText(), multiplicityString)));
	      }
      }
    }
  }
}

//class KScalaBaseListener extends ModelBaseListener{
//  override def enterEveryRule (ctx : ParserRuleContext) : Unit = {
//	println("hello rule!");
//	println(ctx.getText());
//  }
//}

//object ScalaParserConsumer {
//def main (args : Array[String]){
//println("Starting main...");
//}
//}
