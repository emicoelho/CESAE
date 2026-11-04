package Ficha04;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //6. Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar
        //acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for descoberto, deverá informar
        //se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
        //valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.

        //Declaração de variáveis
        int valor, tentativa, cont=0;

        //Entrada
        System.out.println("Escolha um número entre 0 em 100: ");
        valor = input.nextInt();

        //Limpar numero do jogador 1 (gambiarra)
        for (int i = 0; i < 100; i++){
            System.out.println();
        }

        if (valor >= 0 && valor <= 100){
            do {
                System.out.println("Qual o número? ");
                tentativa = input.nextInt();

                if (tentativa != valor){
                    if (tentativa > valor){
                        System.out.println("Superior");
                    }else{
                        System.out.println("Inferior");
                    }

                    cont++;
                }else {
                    System.out.println("ACERTOU!!");
                    System.out.println("Número de tentativas: " + cont);
                }
            }while(tentativa != valor);
        }else{
            System.out.println("Número inválido");
        }

    }
}
