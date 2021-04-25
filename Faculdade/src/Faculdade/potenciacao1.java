package Faculdade;

public class potenciacao1 {

	public static void main(String[] args) {

		int base = 3;
		int expoente = 5;
		int potencia = 1;
		
		int contador = 1;
		
		contador = 1;
		while (contador <= expoente) {
			
			potencia = potencia * base;
			
			contador++;
		}
		
		System.out.println(potencia);
		
	}

}
