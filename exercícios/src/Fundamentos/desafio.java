package Fundamentos;

import java.util.Scanner;

public class desafio {
public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
 System.out.println("Iforme o seu primeiro salario: "); 
 String valor1 = entrada.next().replace(",",".");
 
 System.out.println("Iforme o seu segundo salario: ");
 String valor2 = entrada.next().replace(",",".");
 
 System.out.println("Iforme o seu terceiro salario: ");
 String valor3 = entrada.next().replace(",",".");

 
 double salario1 = Double.parseDouble(valor1);
 double salario2 = Double.parseDouble(valor2);
 double salario3 = Double.parseDouble(valor3);
 
 double juçao = salario1 + salario2 + salario3;
 
 
 double soma = (juçao); 

 double média = (+ soma / 3);
 
 System.out.println(" Soma é : " + soma);
 System.out.println("Media é: " + média);
 
 entrada.close();
}
}


