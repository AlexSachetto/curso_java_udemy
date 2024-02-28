package fundamento.operadors;

 

public class DesafioLogicos {public static void main(String[] args) {
	
	//Voce prometeu pra sua familia se
	//conseguir trabalho na terça e na quinta vai comprar uma tv de 50pl
	//Se conseguir so um dia de serviço voce vai comprar uma tv 32pl
	// e tomar sorvete.
	// Se nao conseguir nenhum dia nao vai ter sorvete nem tv.
	 
 boolean condição1 = false;
 boolean condição2 = true;
 boolean condição3 = false;
 boolean condição4 = false;

 boolean comproutv = condição1 || condição2 ;	
 boolean comprouTv = condição1 && condição2;
 boolean naocomproutv = condição3 && condição4;
  
 // primeiro
 System.out.println("Comprou TV 50PL\"? " + comprouTv);
 System.out.println("Tomou um sorvete com a família\"? " + comprouTv);
 System.out.println("Seu nivel de açucar aumentou\"? " + comprouTv); 
 System.out.println("Sairam felizes no final\"? " + comprouTv + "\n");
 
  		 // segundo

     System.out.println("Comprou TV 30PL\"? " + comproutv);
	 System.out.println("Tomou um sorvete com a família\"? " + comproutv);
	 System.out.println("Seu nivel de açucar aumentou\"? " + comproutv); 
	 System.out.println("Sairam felizes no final\"? " + comproutv + "\n");
	 
	  //terceiro
	 
	 System.out.println("Comprou TV 30PL\"? " + naocomproutv);
	 System.out.println("Tomou um sorvete com a família\"? " + naocomproutv);
	 System.out.println("Seu nivel de açucar aumentou\"? " + naocomproutv); 
	 System.out.println("Sairam felizes no final\"? " + naocomproutv);
		 
 
 
	
	 
	
	 
	
	
	
	
	
	
	
	
	
	
}

}
