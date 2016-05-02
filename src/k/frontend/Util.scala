package k.frontend

object Tabulator {
  def format(table: Seq[Seq[Any]]) = table match {
    case Seq() => ""
    case _ =>
      val sizes = for (row <- table) yield (for (cell <- row) yield if (cell == null) 0 else cell.toString.length)
      val colSizes = for (col <- sizes.transpose) yield col.max
      val rows = for (row <- table) yield formatRow(row, colSizes)
      formatRows(rowSeparator(colSizes), rows)
  }

  def formatRows(rowSeparator: String, rows: Seq[String]): String = (
    rowSeparator ::
    rows.head ::
    rowSeparator ::
    //rows.tail.toList.map { x => (x + "\n") ++ rowSeparator } ::: // for row sep
    rows.tail.toList :::
    rowSeparator ::
    List()).mkString("\n")

  def formatRow(row: Seq[Any], colSizes: Seq[Int]) = {
    val cells = (for ((item, size) <- row.zip(colSizes)) yield if (size == 0) "" else ("%-" + size + "s").format(item))
    cells.mkString("\t|", "|", "|")
  }

  def rowSeparator(colSizes: Seq[Int]) = colSizes map { "-" * _ } mkString ("\t+", "+", "+")
}

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
          errorExit("Util", "Unknown expression in wp: " + e)
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

    val input = "x : Int y : Int fun test pre(x = 0) post(y = 42) post(y > 10) {x:= 4 if x = 0 then y := 2 else y := 42}"
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
            //println("Checking " + checkWithQuantifiers)
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
    //    K2Z3.PrintModel()
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
      println("Possible instance:")
      //      K2Z3.PrintModel()
    }
    result
  }

  def errorExit(prefix: String, message: String): Nothing = {
    log(prefix, message)
    System.exit(-1).asInstanceOf[Nothing]
  }

  def errorThrow(prefix: String, message: String, e: Exception) = {
    log(prefix, message)
    throw e
  }

  def silentErrorExit(prefix: String, message: String): Nothing = System.exit(-1).asInstanceOf[Nothing]

  def silentErrorThrow(prefix: String, message: String, e: Exception) = throw e

  def log(prefix: String, msg: String) = println(s"[$prefix] $msg")

  def getInnerTypeFromCollectionType(ty: Type): Type = {
    ty match {
      case IdentType(id, t) if isCollection(ty) =>
        require(t.length == 1)
        t.last
      case _ => errorExit("Util", "Cannot get inner type from non collection: " + ty)
    }
  }

  def areTypesEqual(t1: Type, t2: Type, compatibility: Boolean): Boolean = {
    (t1, t2) match {
      case (ParenType(pt1), ParenType(pt2))         => return areTypesEqual(pt1, pt2, compatibility)
      case (ParenType(pt1), pt2 @ _)                => return areTypesEqual(pt1, pt2, compatibility)
      case (pt1 @ _, ParenType(pt2))                => return areTypesEqual(pt1, pt2, compatibility)
      case (CartesianType(ct1), CartesianType(ct2)) => return (ct1 zip ct2).forall { t => areTypesEqual(t._1, t._2, compatibility) }
      case (IdentType(it1, it2), IdentType(it3, it4)) =>
        return it1.equals(it3) // TODO 
      case (CollectType(ct1), CollectType(ct2)) =>
        return (ct1 zip ct2).forall { t => areTypesEqual(t._1, t._2, compatibility) }
      case (AnyType, _)                         => return true
      case (_, AnyType)                         => return true
      case (RealType, IntType) if compatibility => return true
      case (IntType, RealType) if compatibility => return true
      case _                                    => return t1.equals(t2)
    }
    return false
  }

  private val collectionNames = Set("Set", "Bag", "Seq", "OSet")

  def isCollection(typeName: String): Boolean =
    collectionNames contains typeName

  def isCollection(it: IdentType): Boolean = collectionNames(it.ident.toString)

  def isCollection(ty: Type): Boolean = {
    ty match {
      case IdentType(id, ct) =>
        isCollection(ty.asInstanceOf[IdentType])
      case _ => false
    }
  }

  def getCollectionKind(ty: Type): CollectionKind = {
    ty match {
      case IdentType(id, ct) =>
        id.toString match {
          case "Set"  => SetKind
          case "Bag"  => BagKind
          case "Seq"  => SeqKind
          case "OSet" => OSetKind
        }
      case _ => errorExit("Util", "Non-collection type passed to getCollectionKind: " + ty)

    }
  }

  def getCollectionKind(o: String): CollectionKind = {
    o match {
      case "Set"  => SetKind
      case "Seq"  => SeqKind
      case "Bag"  => BagKind
      case "OSet" => OSetKind
      case _ => errorExit("Util", "Non-collection type passed to getCollectionKind(2): " + o)
    }
  }

  def typeTypeCollection(t1: Type, t2: Type): (Boolean, Type) = {
    (t1, t2) match {
      case (IdentType(id, ct1), IdentType(id2, ct2)) if isCollection(t1.asInstanceOf[IdentType]) && isCollection(t2.asInstanceOf[IdentType]) =>
        return (areTypesEqual(t1, t2, false), t1)
      case (IdentType(id, ct1), _) if isCollection(t1.asInstanceOf[IdentType]) =>
        require(ct1.length == 1, s"Collection type mismatch.")
        return (areTypesEqual(ct1(0), t2, false), t1)
      case (_, IdentType(id, ct2)) if isCollection(t2.asInstanceOf[IdentType]) =>
        require(ct2.length == 1, s"Collection type mismatch.")
        return (areTypesEqual(t1, ct2(0), false), t2)
      case _ => return (false, null)
    }
  }

  def removeCollection(t: Type): Type = {
    t match {
      case IdentType(id, ty) if isCollection(t.asInstanceOf[IdentType]) => ty(0)
      case _ => t
    }
  }

  def topologicalSort[A](edges: Traversable[(A, A)]): Iterable[A] = {
    def tsort(toPreds: Map[A, Set[A]], done: Iterable[A]): Iterable[A] = {
      val (noPreds, hasPreds) = toPreds.partition { _._2.isEmpty }
      if (noPreds.isEmpty) {
        if (hasPreds.isEmpty) done else sys.error(hasPreds.toString)
      } else {
        val found = noPreds.map { _._1 }
        tsort(hasPreds.mapValues { _ -- found }, done ++ found)
      }
    }

    val toPred = edges.foldLeft(Map[A, Set[A]]()) { (acc, e) =>
      acc + (e._1 -> acc.getOrElse(e._1, Set())) + (e._2 -> (acc.getOrElse(e._2, Set()) + e._1))
    }

    tsort(toPred, Seq())
  }
}