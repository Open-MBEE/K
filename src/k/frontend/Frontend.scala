package k.frontend

import org.antlr.runtime.tree.ParseTree
import k.frontend
import java.nio
import java.nio.file.Paths
import java.nio.file.Files
import java.nio.file.Path
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.json.JSONArray
import org.json.JSONObject
import k.frontend.ModelParser.ModelContext

object Frontend {
  type OptionMap = Map[Symbol, Any]

  def parseArgs(map: OptionMap, list: List[String]): OptionMap = {
    def isSwitch(s: String) = (s(0) == '-')
    list match {
      case Nil => map
      case "-f" :: value :: tail =>
        parseArgs(map ++ Map('modelFile -> value), tail)
      case "-v" :: tail => parseArgs(map ++ Map('verbose -> true), tail)
      case "-stats" :: tail => parseArgs(map ++ Map('stats -> true), tail)
      case "-expressionToJson" :: value :: tail =>
        parseArgs(map ++ Map('expression -> (value + ";"))
          ++ Map('expressionToJson -> true), tail)
      case option :: tail =>
        println("Unknown option " + option)
        System.exit(1).asInstanceOf[Nothing]
    }
  }

  def main(args: Array[String]) {
    val options = parseArgs(Map(), args.toList)

    val model: Model =
      options.get('modelFile) match {
        case Some(f: String) => getModelFromFile(f)
        case None =>
          println("Model file not provided.")
          System.exit(-1).asInstanceOf[Nothing]
      }

    if (model == null) {
      println("Model could not be created from input file!")
      System.exit(-1)
    }

    options.get('stats) match {
      case Some(_) => printStats(model)
      case None => ()
    }

    options.get('verbose) match {
      case Some(_) => printModel(model)
      case None => ()
    }

    options.get('expression) match {
      case Some(expressionString: String) => {
        println(exp2Json(expressionString))
      }
      case None => ()
    }

  }

  def getVisitor(contents: String): (KScalaVisitor, ModelContext) = {

    var input: ANTLRInputStream = new ANTLRInputStream(contents);
    var lexer: ModelLexer = new ModelLexer(input);
    var tokens: CommonTokenStream = new CommonTokenStream(lexer);
    var parser: ModelParser = new ModelParser(tokens);
    var tree = parser.model();
    var ksv: KScalaVisitor = new KScalaVisitor();
    (ksv, tree)
  }

  def getModelFromFile(f: String): Model = {
    var path: Path = Paths.get(f)
    var bytes: Array[Byte] = Files.readAllBytes(path)
    var fileContents: String = new String(bytes, "UTF-8");
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(fileContents)
    var m: Model = ksv.visit(tree).asInstanceOf[Model];
    m
  }

  def printModel(m: Model) {
    println(m)
  }

  def exp2Json(expressionString: String): String = {
    val (ksv: KScalaVisitor, tree: ModelContext) = getVisitor(expressionString)
    var m: Model = ksv.visit(tree).asInstanceOf[Model];

    require(m.decls.count(_ => true) == 1)
    require(
      m.decls.count(
        _ match {
          case ExpressionDecl(_) => true
          case _ => false
        }) == 1)

    var exp: Exp = m.decls(0).asInstanceOf[ExpressionDecl].exp
    val array = new JSONArray()
    val operand = new JSONArray()
    val root = new JSONObject()
    var elements = exp.toJson
    var specialization = new JSONObject()
    specialization = new JSONObject()
    specialization.put("specialization", elements)
    array.put(specialization)
    var res: JSONObject = root.put("elements", array)
    res.toString(4)
  }

  def printStats(m: Model) {
    println("Imports: " + m.imports.size)
    println("Classes: " + m.decls.count(
      _ match {
        case ClassDecl(Class, _, _, _, _, _) => true
        case _ => false
      }))
    println("Associations: " + m.decls.count(
      _ match {
        case ClassDecl(Assoc, _, _, _, _, _) => true
        case _ => false
      }))
    println("Constraints: " + m.decls.count(
      _ match {
        case ConstraintDecl(_, _) => true
        case _ => false
      }))
    println("Variables: " + m.decls.count(
      _ match {
        case VarDecl(_, _) => true
        case _ => false
      }))
    println("Values: " + m.decls.count(
      _ match {
        case ValDecl(_, _) => true
        case _ => false
      }))
    println("Functions: " + m.decls.count(
      _ match {
        case FunDecl(_, _, _, _) => true
        case _ => false
      }))
    println("Types: " + m.decls.count(
      _ match {
        case TypeDecl(_, _, _) => true
        case _ => false
      }))
    println("Expressions: " + m.decls.count(
      _ match {
        case ExpressionDecl(_) => true
        case _ => false
      }))
  }

  def analyze(m: Model) {

  }
}