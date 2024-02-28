package Controle;

import java.text.ParseException;
import java.util.Scanner;

public class DesafioDiaSemana {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	//Aqui pede o numero da semana e informa o "nome do dia"
	System.out.print("Digite o numo da semana:");
	
	double diasDaSemana = entrada.nextDouble();
	if( diasDaSemana == 1 ) {
		System.out.println("Domingo");
	}else if(diasDaSemana == 2) {
		System.out.println("Segunda-Feira");
	}else if(diasDaSemana == 3) {
		System.out.println("Terça-Feira");
	}else if(diasDaSemana == 4) {
		System.out.println("Quarta-Feira");
	}else if(diasDaSemana == 5) {
		System.out.println("Quinta-Feira");
	}else if(diasDaSemana == 6) {
		System.out.println("Sexta-feira");
	}else if(diasDaSemana == 7) {
		System.out.println("Sábado");
	}else {}
	
	  
// aqui pede o nome da semana dai informa o dia "numero da semana"	
	
	System.out.print("Informe o dia da semana: ");
	String dia = entrada.next();
	
	if(dia.equalsIgnoreCase("domingo")) { 
		System.out.println(1);
	}else if(dia.equalsIgnoreCase("segunda")) {
		System.out.println(2);
	}else if(dia.equalsIgnoreCase("terça")) {
		System.out.println(3);
	}else if(dia.equalsIgnoreCase("quarta")) {
		System.out.println(4);
	}else if(dia.equalsIgnoreCase("quinta")) {
	System.out.println(5);
}else if(dia.equalsIgnoreCase("sexta")) {
	System.out.println(6);
}else if(dia.equalsIgnoreCase("sábado")) {
	System.out.println(7);
}else {}
		 
		  
entrada.close();	
}
}
