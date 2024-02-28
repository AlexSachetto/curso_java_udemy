package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
public static void main(String[] args) {
	 // se usa o Whilhe quando voce  tem uma quantidade indeterminada  de repetições
	Scanner entrada = new Scanner(System.in);
	
	String escrevaNoConsole = "";
	
	while(!escrevaNoConsole.equalsIgnoreCase("sair")) {
		System.out.println("escreva aqui");
	escrevaNoConsole = entrada.nextLine();
	}
	
	entrada.close();
}
}
