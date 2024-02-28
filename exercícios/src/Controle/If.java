package Controle;

import java.util.Scanner;

public class If 
{ public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe uma média: ");
	double media = entrada.nextDouble();
	
	if(media <= 10 && media >= 7.2) {
		System.out.println("Aprovado!"); // aqui voce tem uma sentença de codigo associada ao "if";
	System.out.println("Parabéns! ");
	}
	
	if(media < 7 && media >= 4.5 )
	System.out.println("Recuperação ");
	
	boolean criteiroReprovadoAtingido = media < 4.5 && media >= 0;
	 
	if(criteiroReprovadoAtingido) {
	System.out.println("Reprovado");
	}
	
	entrada.close();
}

}
// dentro do "if" é obrigatorio retornar Verdadeiro ou Falso