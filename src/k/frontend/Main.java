package k.frontend;

public class Main {
	public static void main(String[] args){
		Frontend.scala_main(args);
		String json, exp;
	
		// TEST Expressions
        String[] exps = {
        		"a.b.c.f", // 0
        		"x < y + z", // 1
        		"1 + c + d * (~1)", // 2
        		"q isin {f(x) | x : S . p(x)}", // 3
        		"x isin S.collect(x -> x + 1).select(x -> x > 4)", // 4
            "do {val x : Int = 1; x + 1;}", // 5
            "while (x > 0) do {x := x - 1;}" // 6
        };
        
        // Expression to JSON
		json = Frontend.exp2Json(exps[5]);
		System.out.println(json);

		System.out.println();
		
		// JSON to Expression from AST
		exp = Frontend.json2exp(json);
		System.out.println(exp);
	}
}
