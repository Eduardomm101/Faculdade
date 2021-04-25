package Faculdade;


public class Porcentagem_Salarial {

	public static void main(String[] args) {

		 double salario = 1000.00;
		 double aumento = 0.015;
		 double porcentagem;
		 
		 System.out.println("Seu Salário Inicial é de: " + salario);
		 
		 for (int ano = 2016; ano <= 2021; ano++)
		 {
			 salario += (salario * aumento);
			 porcentagem = aumento * 100;
			 aumento = aumento * 2; 
			 
			 System.out.println("Seu salário passou a ser " + salario + " no ano de " + ano + 
					 " com um aumento de " + porcentagem + "%");;
		 }
		
	}

}
