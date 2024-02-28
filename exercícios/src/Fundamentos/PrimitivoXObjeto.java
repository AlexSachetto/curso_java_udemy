package Fundamentos;

import java.util.Scanner;

public class PrimitivoXObjeto {
	
	
	public static void main(String[] args) {
		
		
		Scanner hotel = new Scanner(System.in);
		
		System.out.print("Nome do morador: ");
		String nome = hotel.nextLine();
		
		System.out.print("Numero do condominio: ");
		int numero = hotel.nextInt();
		
		System.out.print("Numero do apartemeno: ");
		int apartamento = hotel.nextInt();
		
		
		
		
		
		System.out.printf("Nome do morador: %s %s  numero do condominio: %d %s numero do apartemnto: %d",
				nome, " ",  numero, " ", apartamento);
	}
	

}
