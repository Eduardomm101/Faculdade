package Faculdade;

import java.util.Scanner;

//Fa�a um algoritmo para calcular a m�dia aritm�tica entre tr�s notas de um aluno.
//Este mesmo algoritmo deve mostrar a situa��o desse aluno, que pode ser aprovado ou reprovado.
//M�dia de aprova��o � 7

//Altere o algor�timo anterior para que seja lido do teclado, al�m das notas, o sexo do aludo (M ou F).


public class M�dia 
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
			System.out.println("Parab�ns, voc� foi aprovada! \n"
					+ "Sua m�dia �: " + media);
			
			if (media < 70) 
			{
				System.out.println("Voc� foi reprovada. \n"
						+ "Sua m�dia �: " + media ); 
			}
		}
    	else if (media >= 70)
    	{
    		System.out.println("Parab�ns, voc� foi aprovado! \n" 
					+ "Sua m�dia �: " + media);
			
			if (media < 70) 
			{
				System.out.println("Voc� foi reprovado. \n"
						+ "Sua m�dia �: " + media ); 
			}
		}
    }
}