package k.frontend

import java.util.HashMap
import com.microsoft.z3.ArithExpr
import com.microsoft.z3.BoolExpr
import com.microsoft.z3.Context
import com.microsoft.z3.IntExpr
import com.microsoft.z3.Solver
import com.microsoft.z3.Status
import com.microsoft.z3.Z3Exception
import collection.JavaConversions._
import com.microsoft.z3.Expr

object K2Z3 {

  var cfg: Map[String, String] = Map("model" -> "true");
  var ctx: Context = new Context(cfg);
  var idents : Set[Expr] = Set()
  var model : com.microsoft.z3.Model = null

  def reset(){
    model = null
    idents = Set()
    ctx = new Context(cfg)
  }
  
  def PrintModel() {
    if(model == null){
      println("UNSATISFIABLE! No assignments could be found to satisfy the given expression.")
    }
    else{
      for(i <- idents){
        println(i.toString() + " = " + model.Evaluate(i, false))
      }
    }
  }
  
  def Check(f: BoolExpr, sat: Status): com.microsoft.z3.Model = {
    var s: Solver = ctx.MkSolver();
    s.Assert(f);
    if (s.Check() != sat)
      throw new Exception();
    if (sat == Status.SATISFIABLE){
      model = s.Model()
    }
    else{
      model = null
    }
    model
  }
  
  def SolveExp(e:Exp) : com.microsoft.z3.Model = {
    var o = Expr2Z3(e).asInstanceOf[BoolExpr]
    var solver : Solver = ctx.MkSolver();
    solver.Assert(o)
    if (Status.SATISFIABLE == solver.Check()){
        model = solver.Model();
    }
    else{
    	model = null
    }
    model
  }
  
  def Expr2Z3(e: Exp): com.microsoft.z3.Expr = {
    e match {
      case ParenExp(e) => 
        Expr2Z3(e)
      case BinExp(e1, o, e2) =>
        o match {
          case LT =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkLt(v1, v2)
          case LTE =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkLe(v1, v2)
          case GT =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkGt(v1, v2)
          case GTE =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkGe(v1, v2)
          case AND =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.MkAnd(Array(v1, v2))
          case OR =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.MkOr(Array(v1, v2))
          case IMPL =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.MkImplies(v1, v2)
          case IFF =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.MkIff(v1, v2)
          case EQ =>
            var v1: Expr = Expr2Z3(e1).asInstanceOf[Expr]
            var v2: Expr = Expr2Z3(e2).asInstanceOf[Expr]
            ctx.MkEq(v1, v2)
          case NEQ =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.MkNot(ctx.MkEq(v1, v2))
          case MUL =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkMul(Array(v1, v2))
          case DIV =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkDiv(v1, v2)
          case REM =>
            var v1: IntExpr = Expr2Z3(e1).asInstanceOf[IntExpr]
            var v2: IntExpr = Expr2Z3(e2).asInstanceOf[IntExpr]
            ctx.MkRem(v1, v2)
          case ADD =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkAdd(Array(v1, v2))
          case SUB =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.MkSub(Array(v1, v2))
          case ASSIGN =>
            var v1: Expr = Expr2Z3(e1).asInstanceOf[Expr]
            var v2: Expr = Expr2Z3(e2).asInstanceOf[Expr]
            ctx.MkEq(v1, v2)
        }
      case UnaryExp(o, e) =>
        o match {
          case NOT =>
            var v : BoolExpr = Expr2Z3(e).asInstanceOf[BoolExpr]
            ctx.MkNot(v)
          case NEG =>
            var v : ArithExpr = Expr2Z3(e).asInstanceOf[ArithExpr]
            ctx.MkMul((Array(ctx.MkInt(-1),v)))
        }
      case IdentExp(i) =>
        var ie = ctx.MkIntConst(i)
        idents = idents + ie
        ie
      case IntegerLiteral(i) =>
        ctx.MkInt(i)
      case BooleanLiteral(b) =>
        ctx.MkBool(b)
      case RealLiteral(r) =>
        ctx.MkReal(r.toString)
      case _ =>
        println("Currently all other expressions are not supported in K2Z3.")
        println("Please rewrite your expression and try again.")
        println(e.getClass().toString())
        System.exit(-1).asInstanceOf[Nothing]
    }

  }
}