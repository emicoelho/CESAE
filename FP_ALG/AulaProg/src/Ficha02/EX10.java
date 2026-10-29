package Ficha02;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaracao de variaveis
        double num1, num2, operacao;
        int escolha;

        //Entada dos números pelo usuário
        System.out.print("Digite um número: ");
        num1 = input.nextDouble();

        System.out.print("Digite outro número: ");
        num2 = input.nextDouble();

        //Escolha da operação aritmética
        System.out.println("Qual operação aritmética deseja? ");
        System.out.println("1- Soma  2- Subtração  3- Divisão  4- Multiplicação");
        escolha = input.nextInt();

        //Condicional com switch
        switch (escolha){
            case 1:
                operacao = num1 + num2;
                System.out.println("A soma dos valores é: " + operacao);
                break;
            case 2:
                operacao = num1 - num2;
                System.out.println("A subtração dos valores é: " + operacao);
                break;
            case 3:
                if (num2 != 0){
                    operacao = num1 / num2;
                    System.out.println("A divisão dos valores é: " + operacao);

                } else {
                        System.out.println("Não existe divisão por zero.");
                }
            break;
                case 4:
                    operacao = num1 * num2;
                    System.out.println("A multiplicacão dos valores é: " + operacao);
                break;

        }


        
    }
}
