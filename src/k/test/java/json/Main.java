package k.test.java.json;

import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Expr;
import com.microsoft.z3.Status;
import k.frontend.Frontend;
import k.frontend.K2Z3;
import k.frontend.Exp;

public class Main {

	private static void header(String text) {
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("  " + text);
		System.out.println("--------------------------");
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		// Frontend.scala_main(args);
		String json, exp;

		String[] exps = {
				"a.b.c.f(x,3)", // 0
				"x < y + z", // 1
				"1 + c + d * (-1) = 42", // 2
				"q isin {f(x) | x : S . p(x)}", // 3
				"x isin S.collect(x -> x + 1).select(x -> x > 4)", // 4
				"do {val x : Int = 1 x + 1}", // 5
				"while (x > 0) do {x := x - 1}", // 6
				"1 = 0", // 7
				"x > y && x = 2*y", // 8
				"x < y && x > 2", // 9
				"2*x + y = 7 && 3*x - y = 8", // 10
				"x - y + z = 10 && (3*x + y + 2*z = 34) && ((-5)*x + 2*y - z = -14)", // 11
				"x = 7 && x < 1", // 12
				"(y := 16) && (x > 4) && y = x + 12 && x*x = y", // 13
				"y = x*x - 3*x + 4 && y - x = 1", // 14
				"forall x_1:Int . x_1 = 1", // 15
				"((x = 0) => ((x = 0) || ((x != 1) && (y = 42))))", // 16
				"forall x : Int . (forall y : Int . ((x = 0) => ((x = 0) || ((x != 1) && (y = 42)))))", // 17
				"(x := 4) && x + 1 = z", // 18
				"forall i : Int . forall j : Int . ((i = 0) => (j = 42)) && (i = 0)", // 19
				"exists i : Int . i > 10", // 20
				"exists i : Int . ((i * i < 0))", // 21
				"forall x, y:Int . x * y = 0", // 22
				"for x in set do stmt", // 23 -- does not work
				"for (x,y) in set do stmt" // 24 -- does not work
		};

		//exp = exps[23];
		exp = exps[0];

		System.out.println("the expression is:\n\n  " + exp + "\n");
				
		header("JSON 1");
				
	    // Expression to JSON
		System.out.println("calling Frontend.exp2Json(exp)\n");
		json = Frontend.exp2Json(exp);
		System.out.println(json);
		System.out.println();

		// JSON to Expression from AST
		System.out.println("calling Frontend.json2exp(json)\n");
		exp = Frontend.json2exp(json);
		System.out.println(exp);

		header("JSON 2");

		// Expression to JSON
		System.out.println("calling Frontend.exp2Json2(exp)\n");
		json = Frontend.exp2Json2(exp);
		System.out.println(json);
		System.out.println();

		// JSON to Expression from AST
		System.out.println("calling Frontend.json2exp2(json)\n");
		exp = Frontend.json2exp2(json);
		System.out.println(exp);

	}
}
