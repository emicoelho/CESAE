package Ficha05;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Implemente um programa que permita adicionar comissões mensais a um
        // array de tamanho 12 (uma posição para cada mês) e calcular o seu
        // total anual.

        //Declaração de array
        double[] comissao = new double[12]; // Array de 0 a 11
        double soma = 0;

        //Entrada (CICLO)
        for (int i = 0; i < 12; i++){
            System.out.print("Comissão mensal: ");
            comissao [i] = input.nextDouble();
        }

        //Calcular o total anual
        for (int i = 0; i < 12; i++){
            soma = soma + comissao[i];
        }

        //Mostrar a comissao total
        System.out.println("Comissão total: " + soma);


    }
}
