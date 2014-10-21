package k.frontend;

public class Main {
	public static void main(String[] args){
		Frontend.scala_main(args);
		
		// create json string
		String json = Frontend.exp2Json("1 + 2 * (4 /4)");
		System.out.println(json);
		
		// create exp from json
		String exp = Frontend.json2exp(json);
		System.out.println(exp);

	}
}
