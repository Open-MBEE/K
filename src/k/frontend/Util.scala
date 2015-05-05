package k.frontend

object Misc {

  def substitute(post: Exp, lhs: String, rhs: Exp): Exp = {
    post match {
      case ParenExp(p) => ParenExp(substitute(p, lhs, rhs))
      case IdentExp(i) => if (i == lhs) rhs else post
      case BinExp(e1, op, e2) =>
        BinExp(substitute(e1, lhs, rhs), op, substitute(e2, lhs, rhs))
      case BlockExp(body) =>
        body.foldLeft(post)((accu, decl) =>
          decl match {
            case ExpressionDecl(e) => wp(List(e), accu)
            case _                 => accu
          })
      case UnaryExp(op, exp) => UnaryExp(op, substitute(exp, lhs, rhs))
      case _                 => post
    }
  }

  def wp(exps: List[Exp], pred: Exp): Exp = {
    exps.reverse.foldLeft(pred)((p, e) =>
      e match {
        case BinExp(e1, ASSIGN, e2) =>
          e1 match {
            case IdentExp(i) =>
              substitute(p, i, e2)
            case _ =>
              p
          }
        case IfExp(cond, trueBranch, falseBranch) =>
          falseBranch match {
            case Some(fb) =>
              BinExp(
                BinExp(wp(List(trueBranch), p), AND, cond),
                OR,
                BinExp(wp(List(fb), p), AND, UnaryExp(NOT, cond)))
            case None =>
              BinExp(
                BinExp(wp(List(trueBranch), p), AND, cond),
                OR,
                BinExp(p, AND, UnaryExp(NOT, cond)))
          }
        case _ =>
          error("Unknown expression in wp: " + e)
      })
  }

  def functionBodyWp(b: List[MemberDecl], pred: Exp): Exp = {
    b.foldLeft(pred)((r, d) =>
      d match {
        case ConstraintDecl(name, exp) => BinExp(r, AND, exp)
        case ExpressionDecl(exp)       => wp(List(exp), r)
        case _                         => r
      })
  }

  def wpTest2() {
    println("+++++++++++++++++++++++++++++++")

    val input = "x : Int y : Int fun test pre(x = 0) post(y = 42) post(y > 100) {x:= 4 if x = 0 then y := 42 else y := 42}"
    //val input = "x : Int y : Int z : Int t : Int fun test post (z >= x && z >= y)  { t := x - y if  t > 0 then z := x else z := y }"
    val model = Frontend.getModelFromString(input)

    val globals =
      model.decls.foldLeft(List[(String, Type)]())((r, d) =>
        d match {
          case PropertyDecl(_, name, t, _, _, _) => (name, t) :: r
          case _                                 => r
        })

    for (md <- model.decls) {
      md match {
        case FunDecl(ident, typeParams, params, t, spec, body) =>
          println("Processing function " + ident)
          val posts = spec.filter { s => !s.pre }
          val pre = spec.filter { s => s.pre }
          val preConjugated = pre.foldLeft(BooleanLiteral(true).asInstanceOf[Exp])((r, p) => BinExp(r, AND, p.exp))
          for (post <- posts) {
            println("Checking postcondition " + post)
            val wpPost = functionBodyWp(body.reverse, post.exp)
            val check = BinExp(preConjugated, IMPL, wpPost)
            val rangeBindings =
              globals.foldLeft(List[RngBinding]()) { (r, g) =>
                val rngBinding = RngBinding(List(IdentPattern(g._1)), TypeCollection(g._2))
                rngBinding :: r
              }
            val checkWithQuantifiers = QuantifiedExp(Forall, rangeBindings, check)
            println("Checking " + checkWithQuantifiers)
            K2Z3.SolveExp(checkWithQuantifiers)
          }

        case _ => ()
      }
    }

    // for all post conditions
    // construct pre_0 && pre_1 && ... && pre_n => WP(function, post)
    println("--------------------------------")
  }

  def wpTest() {
    K2Z3.reset()
    val e = Frontend.exp2KExpList("x := 4 if x = 0 then y := 42 else y := 2") // statement
    val p = Frontend.exp2KExp("y = 42") // postcondition
    val result = wp(e, p)
    println(s"WP of $e w.r.t. $p is $result")
    val preCondition = Frontend.exp2KExp("x = 0") // precondition
    val finalCheck = QuantifiedExp(Forall,
      List(
        RngBinding(
          List(IdentPattern("x"), IdentPattern("y")),
          TypeCollection(IntType))),
      BinExp(preCondition, IMPL, result))
    K2Z3.SolveExp(finalCheck)
    K2Z3.PrintModel()
  }

  def checkEntityConsistency(e: EntityDecl): Boolean = {
    K2Z3.reset()
    val result = if (K2Z3.SolveExp(e.members.filter {
      m => m.isInstanceOf[ConstraintDecl]
    }.map { x => x.asInstanceOf[ConstraintDecl] }.
      foldLeft(BooleanLiteral(true).asInstanceOf[Exp])((r, c) => BinExp(c.exp, AND, r))) == null)
      false
    else
      true

    if (result == false) {
      println(s"Class ${e.ident} is NOT satisfiable!")
    } else {
      println(s"Class ${e.ident} IS satisfiable!")
      K2Z3.PrintModel()
    }
    result
  }

  def error(message: String): Nothing = {
    println(message)
    System.exit(-1).asInstanceOf[Nothing]
  }

}