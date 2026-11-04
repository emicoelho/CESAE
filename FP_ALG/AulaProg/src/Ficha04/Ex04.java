package Ficha04;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //4. Implemente um programa que peça ao utilizador dois valores
        // e um carácter representando uma das quatro operações aritméticas
        // (+, -, *, /). Apresente o resultado de aplicar a operação
        // correspondente aos valores. No final, deverá perguntar ao utilizador
        // se deseja repetir, permitindo-lhe efetuar novos cálculos. Exemplo:
        // Deseja //continuar? (introduza s/n).

        //Declaração de variáveis
        int num1, num2, operacao, next=0, resultado, continuar;

        //Ciclo
        do{
            //Entrada
            System.out.print("Número 1: ");
            num1 = input.nextInt();

            System.out.print("Número 2: ");
            num2 = input.nextInt();

            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: *");
            System.out.println("4: /");
            operacao = input.nextInt();

            //Cálculo baseado na escolha
            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println(resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println(resultado);
                    } else {
                        System.out.println("Divisão por zero.");
                    }
                    break;
            }

            //Opção de continuar ou não.
            System.out.println("Deseja continuar? ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            continuar = input.nextInt();

        }while (continuar == 1); //Se digitou 1 no continuar, entao no
                                // ciclo novamente. Senão finaliza o menu.
    }





    }
