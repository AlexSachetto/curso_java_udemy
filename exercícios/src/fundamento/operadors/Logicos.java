package fundamento.operadors;

class Logicos {public static void main(String[] args) {
	
	
	
	 boolean condição1 = true;
	 boolean condição2 = 3 > 7;
	 
	System.out.println(condição1 && condição2 );
	System.out.println(condição1 ^ condição2 );
	System.out.println(condição1 || condição2 );
	System.out.println(!!condição1);
	System.out.println(!condição2);

	System.out.println("Tabela verdade (E)");

	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);

	System.out.println("Tabela verdade (OU) Exclusivo");
	
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	 

	System.out.println("Tabela verdade (ou)");
	
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	
	System.out.println("Tabela verdade (not)");
	
	System.out.println(!true);
	System.out.println(!false);





}
}										
