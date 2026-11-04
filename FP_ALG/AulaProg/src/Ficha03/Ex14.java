package Ficha03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int quant, cont=1, numeroAnterior, numeroAtual;
        boolean crescente = true;

        //Entrada
        System.out.print("Quantos números deseja inserir: ");
        quant = input.nextInt();

        System.out.print("Introduza um número: ");
        numeroAnterior = input.nextInt();

        //Ciclo
        while (cont < quant){
            System.out.print("Introduza um número: ");
            numeroAtual = input.nextInt();

            if (numeroAtual <= numeroAnterior){
                crescente = false;
            }

            numeroAnterior = numeroAtual;

            cont++;
        }

        if (crescente){
            System.out.println("Crescente");
        }else {
            System.out.println("Não crescente");
        }



    }
}
