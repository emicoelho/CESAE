package Ficha06;

import java.util.Scanner;

import static Ficha06.Ex05.*;

public class Ex06 {

    public static void menu(){
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int opcao, tamanho;

        System.out.println("Qual o tamanho do vetor: ");
        tamanho = lerInteiroPositivo();

        int[] vetorUtilizador = lerVetorInteiros(tamanho);

        do {

            System.out.println("\n-+-+-+-+-+-+ PROGRAMA ANALISAR VETORES -+-+-+-+-+-+");
            System.out.println("Vetor: ");
            imprimirVetorInteiros(vetorUtilizador);

            System.out.println("\n1. Maior elemento");
            System.out.println("2. Menor elemento");
            System.out.println("3. Crescente" );
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Maior elemento: " + maiorElemento(vetorUtilizador));
                    break;

                case 2:
                    System.out.println("Menor elemento: " + menorElemento(vetorUtilizador));
                    break;

                case 3:
                    if (vetorCrescente(vetorUtilizador)){
                        System.out.println("Crescente");
                    }else {
                        System.out.println("Não crescente");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcão não reconhecida: " + opcao);
            }

        }while (opcao != 0);

    }

    public static void main(String[] args) {
        menu();
    }

}
