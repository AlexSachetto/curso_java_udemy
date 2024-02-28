package Controle;

import java.util.Scanner;

public class IfElseIf {public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a nota: ");
	
	double nota = entrada.nextDouble();
	
	if(nota > 10 || nota < 0) { 
	System.out.println("Nota inválida! ");
		}else if(nota >= 8.1) {
			System.out.println("Parabens!!! ");
			System.out.println("Conceito AA++ ");
	}else if(nota >= 6.1) {
		System.out.println("Conceito BB+- ");
		}else if(nota >= 4.1){
			System.out.println("Conceito CC--! ");
		} else { 
			System.out.println("Conceito reprovado E--");
		}
	System.out.println("Final! ");
	
	entrada.close();
}

}
