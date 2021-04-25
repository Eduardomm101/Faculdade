package Faculdade;

import java.util.Scanner;

//Faça um algoritmo para calcular a média aritmética entre três notas de um aluno.
//Este mesmo algoritmo deve mostrar a situação desse aluno, que pode ser aprovado ou reprovado.
//Média de aprovação é 7

//Altere o algorítimo anterior para que seja lido do teclado, além das notas, o sexo do aludo (M ou F).


public class Média 
{
    public static void main(String[] args) 
    {
        
    	int n1;
    	int n2;
    	int n3;
    	int n4;
    	
    	double media;
    	
    	char sexo;
    	
    	try (//Entradas
		Scanner teclado = new Scanner(System.in)) {
			System.out.println("Digite a nota 1: ");
			n1 = teclado.nextInt();
			
			System.out.println("Digite a nota 2: ");
			n2 = teclado.nextInt();
			
			System.out.println("Digite a nota 3: ");
			n3 = teclado.nextInt();
			
			System.out.println("Digite a nota 4: ");
			n4 = teclado.nextInt();
			
			System.out.println("Indique o sexo:  ");
			sexo = teclado.next().charAt(0);
		}
    	
    	media = (n1 + n2 + n3 + n4) / 4;
    	
    	if (sexo == 'F' && media >= 70) 
    	{
			System.out.println("Parabéns, você foi aprovada! \n"
					+ "Sua média é: " + media);
			
			if (media < 70) 
			{
				System.out.println("Você foi reprovada. \n"
						+ "Sua média é: " + media ); 
			}
		}
    	else if (media >= 70)
    	{
    		System.out.println("Parabéns, você foi aprovado! \n" 
					+ "Sua média é: " + media);
			
			if (media < 70) 
			{
				System.out.println("Você foi reprovado. \n"
						+ "Sua média é: " + media ); 
			}
		}
    }
}