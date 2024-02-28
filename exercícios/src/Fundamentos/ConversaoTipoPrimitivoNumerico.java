package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
 public static void main(String[] args) {
	
double a = 1; //implicita
System.out.println(a);

float b = (float) 1.454545454; //explícita (cast)
System.out.println(b);

int c = 127;
byte d = (byte) c; // explícita (cast)
System.out.println(d);

double e = 1.99;
int f = (int) e; // explícita (cast) 
// O java ignora completamente se for um numero quebrado ele vair ler o tipo que é e o que precissa transformar, nem que perca alguns numeros, ou pastas
System.out.println(f);
 
 //Não use muito se não precissar
 
 }


}
