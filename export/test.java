
package kFrontendTest;

import k.frontend.*;

public class test {

	public static void main(String[] args) {

		String[] exps = {
				"a.b.c.f", // 0
				"x < y + z", // 1
				"1 + c + d * (-1) = 42", // 2
				"x + 1", // 3
				"x isin S.collect(x -> x + 1).select(x -> x > 4)", // 4
				"{val x : Int = 1 x + 1}", // 5
				"STOP", //"while (x > 0) do { x := x - 1 }", // 6
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
				"forall x : Int . (forall y : Int . ((x = 0) => ((x = 0) || ((x != 1) && (y = 42)))))", // 17
				"(x := 4) && x + 1 = z", // 18
				"forall i : Int . forall j : Int . ((i = 0) => (j = 42)) && (i = 0)", // 19
				"exists i : Int . (i > 10)", // 20
				"(exists i : Int . ((i * i < 0)))", // 21
				"exists i : Int . (i > 10)" // 22
		};

		for (int x = 0; x <= 22; x++) {
			String exp = exps[x];

			System.out.println("\n--- " + x + " ---------------------\n");
			System.out.println("expr:\n" + exp);
			String json = Frontend.exp2Json2(exp);
			System.out.println("\njson:\n" + json);
			String expBack = Frontend.json2exp2(json);
			System.out.println("\nand back:\n " + expBack);
		}
	}
}

