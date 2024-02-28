package fundamento.Desafios;

import java.util.Scanner;

public class DeafioAltura {
public static void main(String[] args) {
	
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Informe seu pesso: ");
	double pesso = entrada.nextDouble();
	
	System.out.println("Informe sua altura: ");
	double altura = entrada.nextDouble();
	
	double imc1 = pesso / altura ;
	double imc2 = imc1 / altura ;
	System.out.println("Sua media é: ");
	System.out.println(imc2);
	
	entrada.close();
	
	
}
}
