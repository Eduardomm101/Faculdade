package Faculdade;

public class potenciacao2 {

	public static void main(String[] args) {
	
		int base = 3;
		int expoente = 5;
		int potencia = 1;
		
		int contador = 1;
		
		contador = 1;
		do {
			
			potencia = potencia * base;
			
			contador++;
			
		}while (contador <= expoente);
		
		System.out.println(potencia);
	}

}
