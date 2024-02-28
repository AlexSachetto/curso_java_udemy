package fundamento.operadors;

import java.util.Scanner;

public class DesafioCalculadora {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	System.out.print("Informe um numero: ");
double numero1 = entrada.nextDouble();

System.out.print("Informe o segundo numero: ");
double numero2 = entrada.nextDouble(); // para escrever os numeros no console

System.out.print("Informe o operador: ");
String operador = entrada.next(); // pode usar para transformar string em numero

double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
resultado = "/".equals(operador) ? numero1 / numero2 : resultado;
resultado = "%".equals(operador) ? numero1 % numero2 : resultado;
  System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, resultado);
  entrada.close();
}
}