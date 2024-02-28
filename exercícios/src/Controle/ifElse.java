package Controle;

import javax.swing.JOptionPane;

public class ifElse {
public static void main(String[] args) {
	String valor = JOptionPane.showInputDialog(
			"Informe o número");

 int numero = Integer.parseInt(valor);
  //Usando so o IF!!!
 if(numero % 2 == 0) {
	  System.out.println("Numero par!!!");
  }
  
  if(numero % 2 == 1) { 
	  System.out.println("Numero inpar");
  }
     
  //Usando IF e ELSE!!!
  if(numero % 2 == 0) { 
	  System.out.println("O numero e par!");
  }else {
	  System.out.println("O numero e inpar");
  }
 
	
	
	
	
	
}
}
