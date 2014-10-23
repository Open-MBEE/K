package k.frontend;

public class Main {
	public static void main(String[] args){
		Frontend.scala_main(args);
		String json, exp;
	
		// TEST Expressions
        String[] exps = {
        		"a.b.c.f",
        		"x < y + z",
        		"1 + c + d * (~1)",
        		"q isin {f(x) | x : S . p(x)}",
        		"x isin S.collect(x -> x + 1).select(x -> x > 4)"
        };
        
        // Expression to JSON
		json = Frontend.exp2Json(exps[4]);
		System.out.println(json);

		System.out.println();
		
		// JSON to Expression from AST
		exp = Frontend.json2exp(json);
		System.out.println(exp);
	}
}
