package Faculdade;

import java.util.Scanner;

public class Cargo_Funcionario {
    public static void main(String args[]) {

        int cod;
        float salario;

        @SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);


        System.out.print(
                         "Selecione seu cargo:\n\n1 - Escriturário\n2 - Secretário\n3 - Caixa\n4 - Gerente\n" +
                         "5 - Diretor\n\nOpção desejada: "
                        );

        cod = Integer.parseInt(teclado.next());

        System.out.print("Qual seu salário: ");
        salario = Float.parseFloat(teclado.next());

        ///// Usando estrutura condicional composta \\\\\

        System.out.print("\n\n\t----- Usando estrutura condicional composta -----\n");
        if (cod == 1) {
            System.out.println("\n---Opção desejada foi Escriturário--\n");
            System.out.print(
                            "Considerando seu cargo e o sálario de: R$" + salario +
                            " você terá um aumento de 50%, que será equivalente a: R$" + (salario * 50 / 100) +
                            ".\n\nTotalizando o seu salário em: R$" + ((salario * 50 / 100) + salario)
                            );
        } else if (cod == 2) {
            System.out.println("\n---Opção desejada foi Secretário---\n");
            System.out.print(
                            "Considerando seu cargo e o sálario de: R$" + salario +
                            " você terá um aumento de 35%, que será equivalente a: R$" + (salario * 35 / 100) +
                            ".\n\nTotalizando o seu salário em: R$" + ((salario * 35 / 100) + salario)
                            );
        } else if (cod == 3) {
            System.out.println("\n---Opção desejada foi Caixa---\n");
            System.out.print(
                            "Considerando seu cargo e o sálario de: R$" + salario +
                            " você terá um aumento de 20%, que será equivalente a: R$" + (salario * 20 / 100) +
                            ".\n\nTotalizando o seu salário em: R$" + ((salario * 20 / 100) + salario)
                            );
        } else if (cod == 4) {
            System.out.println("\n---Opção desejada foi Gerente---\n");
            System.out.print(
                            "Considerando seu cargo e o sálario de: R$" + salario +
                            " você terá um aumento de 10%, que será equivalente a: R$" + (salario * 10 / 100) +
                            ".\n\nTotalizando o seu salário em: R$" + ((salario * 10 / 100) + salario)
                            );
        } else if (cod == 5) {
            System.out.println("\n---Opção desejada foi Diretor---\n");
            System.out.print(
                            "Considerando seu cargo e o sálario de: R$" + salario +
                            " você não terá um aumento." +
                            "\n\nEstabelendo-se assim como o mesmo salário de: R$" + salario
                            );
        } else {
            System.out.println("\nFavor escolher uma das opções citadas anteriormente!");
        }

        ///// Usando estrutura condicional caso \\\\\

        System.out.print("\n\n\n\t----- Usando estrutura condicional caso -----\n");

        switch (cod) {
            case 1:
                System.out.println("\n---Opção desejada foi Escriturário--\n");
                System.out.print(
                                "Considerando seu cargo e o sálario de: R$" + salario +
                                " você terá um aumento de 50%, que será equivalente a: R$" + (salario * 50 / 100) +
                                ".\n\nTotalizando o seu salário em: R$" + ((salario * 50 / 100) + salario)
                                );
                break;
            case 2:
                System.out.println("\n---Opção desejada foi Secretário---\n");
                System.out.print(
                                "Considerando seu cargo e o sálario de: R$" + salario +
                                " você terá um aumento de 35%, que será equivalente a: R$" + (salario * 35 / 100) +
                                ".\n\nTotalizando o seu salário em: R$" + ((salario * 35 / 100) + salario)
                                );
                break;
            case 3:
                System.out.println("\n---Opção desejada foi Caixa---\n");
                System.out.print(
                                "Considerando seu cargo e o sálario de: R$" + salario +
                                " você terá um aumento de 20%, que será equivalente a: R$" + (salario * 20 / 100) +
                                ".\n\nTotalizando o seu salário em: R$" + ((salario * 20 / 100) + salario)
                                );
                break;
            case 4:
                System.out.println("\n---Opção desejada foi Gerente---\n");
                System.out.print(
                                "Considerando seu cargo e o sálario de: R$" + salario +
                                " você terá um aumento de 10%, que será equivalente a: R$" + (salario * 10 / 100) +
                                ".\n\nTotalizando o seu salário em: R$" + ((salario * 10 / 100) + salario)
                                );
                break;
            case 5:
                System.out.println("\n---Opção desejada foi Diretor---\n");
                System.out.print(
                                "Considerando seu cargo e o sálario de: R$" + salario +
                                " você não terá um aumento." +
                                "\n\nEstabelendo-se assim como o mesmo salário de: R$" + salario
                                );
                break;
            default:
                System.out.println("\nFavor escolher uma das opções citadas anteriormente!");
        }
    }
}
