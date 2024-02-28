package fundamento.operadors;

public class Relacionais {
public static void main(String[] args) {
	
	int a = 97;
	int b = 'a';
	
	System.out.println(a == b);
	System.out.println(30 != 7);	
	System.out.println(3 > 4);
	System.out.println(3 >= 3);
	System.out.println(3 < 7);
	System.out.println(30 <= 7);
	
	double nota = 9.0;
	boolean bomComportamento = true;
	boolean passouPorMédia = nota >= 8.0;
	boolean temDesconto = bomComportamento && passouPorMédia;
	
	System.out.println("\n" + temDesconto );

	
}
}
