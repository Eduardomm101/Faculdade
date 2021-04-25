package Faculdade;

public class potenciacao3 {

	public static void main(String[] args) {
		
		int base = 3;
		int expoente = 5;
		int potencia = 1;
		
		
		
		for (int i = 1; i <= expoente; i++) 
		{
			potencia *= base;
			System.out.println(potencia);
		}
	}

}
