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
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.{ HashMap => MMap }

object K2Z3 {

  val debug: Boolean = false
  var cfg: Map[String, String] = Map("model" -> "true",
    "auto-config" -> "false")
  var ctx: Context = new Context(cfg)
  var idents: MMap[String, (Expr, com.microsoft.z3.StringSymbol)] = MMap()
  var model: com.microsoft.z3.Model = null

  def reset() {
    model = null
    idents = new MMap()
    ctx = new Context(cfg)
    ctx.mkIntSort()
  }

  def PrintModel() {
    if (model == null) {
      println("UNSATISFIABLE! No assignments could be found to satisfy the given expression.")
    } else {
      for ((i, (e, s)) <- idents) {
        println(e.toString() + " = " + model.evaluate(e, true))
      }

    }
  }

  def SolveExp(e: Exp): com.microsoft.z3.Model = {
    reset()
    SolveExp(Expr2Z3(e).asInstanceOf[BoolExpr])
  }

  def SolveExp(e: BoolExpr): com.microsoft.z3.Model = {
    var solver: Solver = ctx.mkSolver()
    solver.add(e)
    val params = ctx.mkParams()
    //params.add("mbqi", false)
    solver.setParameters(params)
    if (debug) println("solving " + solver)
    val status = solver.check()
    if (Status.SATISFIABLE == status) {
      println("SAT")
      model = solver.getModel
    } else if (status == Status.UNSATISFIABLE) {
      println("UNSAT")
    } else {
      println("UNKNOWN")
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
            ctx.mkLt(v1, v2)
          case LTE =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.mkLe(v1, v2)
          case GT =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.mkGt(v1, v2)
          case GTE =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.mkGe(v1, v2)
          case AND =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.mkAnd(v1, v2)
          case OR =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.mkOr(v1, v2)
          case IMPL =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.mkImplies(v1, v2)
          case IFF =>
            var v1: BoolExpr = Expr2Z3(e1).asInstanceOf[BoolExpr]
            var v2: BoolExpr = Expr2Z3(e2).asInstanceOf[BoolExpr]
            ctx.mkIff(v1, v2)
          case EQ =>
            var v1: Expr = Expr2Z3(e1).asInstanceOf[Expr]
            var v2: Expr = Expr2Z3(e2).asInstanceOf[Expr]
            ctx.mkEq(v1, v2)
          case NEQ =>
            var v1 = Expr2Z3(e1)
            var v2 = Expr2Z3(e2)
            ctx.mkNot(ctx.mkEq(v1, v2))
          case MUL =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.mkMul(v1, v2)
          case DIV =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.mkDiv(v1, v2)
          case REM =>
            var v1: IntExpr = Expr2Z3(e1).asInstanceOf[IntExpr]
            var v2: IntExpr = Expr2Z3(e2).asInstanceOf[IntExpr]
            ctx.mkRem(v1, v2)
          case ADD =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.mkAdd(v1, v2)
          case SUB =>
            var v1: ArithExpr = Expr2Z3(e1).asInstanceOf[ArithExpr]
            var v2: ArithExpr = Expr2Z3(e2).asInstanceOf[ArithExpr]
            ctx.mkSub(v1, v2)
          case ASSIGN =>
            var v1: Expr = Expr2Z3(e1).asInstanceOf[Expr]
            var v2: Expr = Expr2Z3(e2).asInstanceOf[Expr]
            ctx.mkEq(v1, v2)
        }
      case UnaryExp(o, e) =>
        o match {
          case NOT =>
            var v: BoolExpr = Expr2Z3(e).asInstanceOf[BoolExpr]
            ctx.mkNot(v)
          case NEG =>
            var v: ArithExpr = Expr2Z3(e).asInstanceOf[ArithExpr]
            ctx.mkMul(ctx.mkInt(-1), v)
        }
      case IdentExp(i) =>
        idents.get(i) match {
          case None =>
            var s = ctx.mkSymbol(i)
            var ie = ctx.mkIntConst(s)
            idents.put(i, (ie, s))
            ie
          case Some(x) =>
            x._1
        }
      case IntegerLiteral(i) =>
        ctx.mkInt(i)
      case BooleanLiteral(b) =>
        ctx.mkBool(b)
      case RealLiteral(r) =>
        ctx.mkReal(r.toString)
      case QuantifiedExp(quantifier, bindings, expression) =>

        var qtypes = new ListBuffer[com.microsoft.z3.Sort]()
        var names = new ListBuffer[com.microsoft.z3.Symbol]()
        var patterns = new ListBuffer[com.microsoft.z3.Pattern]()
        var ies = new ListBuffer[Expr]()
        for (b <- bindings) {
          for (p <- b.patterns) {
            p match {
              case IdentPattern(x) =>
                idents.get(x) match {
                  case None =>
                    val xSym = ctx.mkSymbol(x)
                    var ie = ctx.mkConst(xSym, ctx.getIntSort)
                    idents.put(x, (ie, xSym))
                    names.add(xSym)
                    ies.add(ie)
                    b.collection match {
                      case TypeCollection(ty) =>
                        ty match {
                          case BoolType => qtypes.add(ctx.getBoolSort())
                          case IntType =>
                            qtypes.add(ctx.getIntSort())
                            val pattern = ctx.mkPattern(ie)
                            patterns.add(ctx.mkPattern(ie))

                          case RealType => qtypes.add(ctx.getRealSort())
                          case _ =>
                            Misc.error("Only bool, int, and real primitive types are supported for quantified expressions in Z3." + expression)
                        }
                      case _ =>
                        Misc.error("Only type collections are supported for quantified expressions in Z3." +
                          "\nPlease check expression " + expression)
                    }
                  case Some(x) => ()
                }

              case _ =>
                Misc.error("Only literal and ident patterns are supported for quantified expressions in Z3." +
                  "Please check expression " + expression)
            }
          }
        }

        var body: Expr = Expr2Z3(expression)

        // There are two ways to construct quantified expressions in Z3
        // one is by using named constants
        // the other is by de-Brujin indexed variables.
        // We have to be careful, because there are no checks for actually 
        // checking if you are mixing the two and doing it incorrectly
        // The following uses de-Brujin indexed variables for forall
        // and named constants for exists. 
        // This probably can be cleaned up, but it is the only way I got
        // it to work.
        quantifier match {
          case Forall =>
            ctx.mkForall(ies.toArray, body, 0, null,
              null, null, null)
          case Exists =>
            ctx.mkExists(qtypes.toArray, names.toArray,
              body, 1, null, null, null, null)
          //ctx.mkExists(ies.toArray, body, 0, null, null, null, null)
        }
    }
  }

}