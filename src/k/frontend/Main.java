package k.frontend;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Expr;
import com.microsoft.z3.Status;
import k.frontend.IMPL;

public class Main {

	private static void header(String text) {
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("  " + text);
		System.out.println("--------------------------");
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		Frontend.scala_main(args);
		String json1, json2, exp;

		// TEST Expressions
		String[] exps = {
				"a.b.c.f", // 0
				"x < y + z", // 1
				"1 + c + d * (-1) = 42", // 2
				"q isin Set{f(x) | x : S . p(x)}", // 3
				"x isin S.collect(x -> x + 1).select(x -> x > 4)", // 4
				"{val x : Int = 1 x + 1}", // 5
				"while (x > 0) do {x := x - 1}", // 6
				"1 = 0", // 7
				"x > y && x = 2*y", // 8
				"x < y && x > 2", // 9
				"2*x + y = 7 && 3*x - y = 8", // 10
				"x - y + z = 10 && (3*x + y + 2*z = 34) && ((-5)*x + 2*y - z = -14)", // 11
				"x = 7 && x < 1", // 12
				"(y := 16) && (x > 4) && y = x + 12 && x*x = y", // 13
				"y = x*x - 3*x + 4 && y - x = 1", // 14
				"forall x_1:Int . (x_1 = 1)", // 15
				"((x = 0) => ((x = 0) || ((x != 1) && (y = 42))))", // 16
				"forall x : Int . (forall y : Int . ((x = 0) => ((x = 0) || ((x != 1) && (y = 42)))))", // 16
				"(x := 4) && x + 1 = z", // 17
				"forall i : Int . forall j : Int . ((i = 0) => (j = 42)) && (i = 0)", // 18
				"exists i : Int . i > 10", // 19
				"exists i : Int . ((i * i < 0))", // 20
				"forall x, y:Int . x * y = 0", // 21
				"Tuple(1,false) # 2 = false", // 22
				"A(1,true).y = true" // 23
		// "x.f(4) > 5", // 22
		// "f(4).x > 5"//, // 23
		};
		/*
		 * // Expression to JSON for (int i = 0; i < exps.length; i++) {
		 * System.out.println("\n---[" + i + "]-------------------------");
		 * System.out.println(exps[i]); json1 = Frontend.exp2Json(exps[i]);
		 * json2 = Frontend.exp2Json2(exps[i]); System.out.println("JSON1: " +
		 * json1); System.out.println("JSON2: " + json2);
		 * System.out.println("RJSON1: " + Frontend.json2exp(json1));
		 * System.out.println("RJSON2: " + Frontend.json2exp2(json2)); }
		 */
		// String expressionString = exps[1];
		// System.out.println("Checking expression: " + expressionString);
		// BoolExpr be = (BoolExpr) K2Z3.Expr2Z3(Frontend
		// .exp2KExp(expressionString));
		// com.microsoft.z3.Model model = K2Z3.SolveExp(be);
		// System.out.println("******************")

		header("SOLVING EXPRESSIONS");

		for (int i = 7; i < exps.length; i++) {
			K2Z3.reset();
			String solvingExpression = exps[i];
			Exp kexp = Frontend.exp2KExp(solvingExpression);
			System.out.println("Solving expression: " + kexp);
			K2Z3.SolveExp(kexp);
			K2Z3.PrintModel();
			System.out.println("******************");
		}

		// Misc.wpTest();

		// Misc.wpTest2();

	}
}
