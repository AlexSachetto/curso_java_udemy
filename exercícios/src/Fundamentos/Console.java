package Fundamentos;

import java.util.Scanner;

public class Console {
public static void main(String[] args) {
	
	// Jogando dados no console
	
	 System.out.print("Bom"); // "print" diferente do "println" ele manda pro console na mesma linha nao manda para de baixo
	System.out.print(" dia");
	
	System.out.println("Bom\n");
	System.out.println("dia");
	
	System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
	//%n da quebra de paragrafo
	System.out.printf("Salário: %.1f%n", 1234.5678);
    //%.1f vai dar um numero arendondado.
	
	Scanner entrada = new Scanner(System.in);// Vai funcionar para escrever no console e incrementar o codigo
	 
	System.out.print("Digite o seu nome: ");
	String nome = entrada.nextLine(); // A variavel "entrada" é / .nextLine = é usada so pra 'String'
	 
	
	System.out.print("Digite o seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	

	System.out.print("Digite o sua idade: ");
	int  idade = entrada.nextInt(); // .nextInt = é para numeros exclusivo dele.
	
	
	System.out.printf("%s %s tem %d anos.%n",
	           nome, sobrenome, idade);
entrada.close(); // Precissa fechar o "Scanner" porque se não ele fica ocupando espaço fica funcionando.

	
	entrada.close();
}
}
