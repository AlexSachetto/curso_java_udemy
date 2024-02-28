package Fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações do funcionamneto
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // Sempre colocar o "L" pra o java conseguir ler.
		
		//Tipos numéricos reais
		float salario = 11_445.44f; // Colocar o "F" para o java intender que é float.
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; // ou true
		
		//Tipo de caractere
		char status = 'A'; // ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
	   System.out.println("Férias!" + estaDeFerias);
	   System.out.println("Status: " + status); 
	   
	   
	   
	String s = "Bom dia X";
	s = s.replace("X", "Senhora");
	s = s.toUpperCase();
	   
	 System.out.println(s);
	 
 	
	}
}

 