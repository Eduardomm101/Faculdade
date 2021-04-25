package Faculdade;

public class lacosRepeticao2 {

	public static void main(String[] args) {

		String resultado = "";
		
		int contador = 1;
		
		do {
			
			resultado = resultado + contador + "Sextou!!!!\n";
			System.out.println(resultado);
		
			contador = contador + 1;
			
		} while ( contador <= 10);
		
	}

}
