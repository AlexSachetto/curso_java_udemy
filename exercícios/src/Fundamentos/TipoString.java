package Fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase(); // tudo maisculo.
		s = "Bom dia"; // AQui eu subistitui o valor do mesmo modo do que o de cima ^ 
		System.out.println(s.concat("!!!")); // Aqui voçê manda um valor pra final da String
	System.out.println(s + "!!!"); // Aqui também mas sem o ponto. "concat"
	System.out.println(s.startsWith("Bom")); // Vai testar sé a frasse começa com "Bom"
	System.out.println(s.toLowerCase().startsWith("bom")); // Aqui a mesma coisa só que vai sempre deixar na letra maiscula por causa "s.toLowerCase()"
	System.out.println( s.endsWith("dia")); // Aqui retorna se essa palavra termina com "dia" verdade ou falsa.
	System.out.println(s.length());
	System.out.println(s.equals("bom dia"));// Aqui vai ver se está igual á String.
 	System.out.println(s.equalsIgnoreCase("bom dia")); // Aqui o "equalsIgnoreCase" = vai ignorar se é maisculo ou minuscolo.
 	
 	var nome = "Pedro";
 	var sobrenome = "Santos";
 	var idade = 33;
	var salario = 12345.987;
	
	System.out.println("Nome:" + nome + "\nSobrenome: "
			+ sobrenome + "\nIdade: " + idade 
			+ "\nSalario: " + salario + "\n\n" ); // Jeito mais deficil de fazer.
	
	System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", // .2f. = o numero antes do f mostra quantas cassas decimais e pra ter e nunca esquecer no "." no final 
             nome, sobrenome,idade, salario); // %D = Substitui valores inteiros
	
	String frase = String.format("String frase = String.formatO senhor %s %s tem %d anos e ganha R$%.2f.", // .2f. = o numero antes do f mostra quantas cassas decimais e pra ter e nunca esquecer no "." no final
            nome, sobrenome,idade, salario); //  Aqui consegue ter a mesma coisa do prinf "Mas dentro de uma String" 
	// "\n\n" = vai dar espaço de linha.
	// %s = usa se pra cada String tipo " nome = Pedro" o numero de Strings que voçê vai ter usa se a mesma quantia "%s"
	//%d = usa se pra cada numero inteiro.
	//%f = usa se pra cada valor de salarios
	System.out.println(frase);
	
	System.out.println("Frase qualquer".contains("qual")); //.contains("qual")); = "verifica se existe essa palvra na String.
	System.out.println("Frase qualquer".indexOf("qual")); // .indexOf("qual")); = "mostra em que possição está
	System.out.println("Frase qualquer".substring(6)); //.substring(6)); = " vai mandar começar na possição que está o " '6'.
	
	}

}

//startsWith = verdadeiro ou falso
// (s.length()) = retorna um falor inteiro