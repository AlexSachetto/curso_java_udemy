package fundamento.operadors;

public class Ternario {
public static void main(String[] args) {
	
	double media = 5.5;
	String resultadoFinal = media >= 7.0 ?
	"aprovado." : "em recuperação.";
	System.out.println("O aluno esta " + resultadoFinal);
	
	double nota = 9.9;
	boolean bomComportamento = true;
	boolean pasouPormedia = nota >= 7;
	boolean temDesconto = bomComportamento && pasouPormedia;
	String resultado = temDesconto ? "Sim." : "Não. ";
	
	System.out.println(resultado);
	 
	
}
}
