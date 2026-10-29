package Ficha02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int valor, nota;

        //Entrada de dados
        System.out.println("Valor em euros: ");
        valor = input.nextInt();

        //Número de notas possíveis
        if (valor % 5 ==0){
            nota = valor / 200;
            System.out.println(nota);
            valor = valor & 200;

            nota = valor /100;
            System.out.println(nota);
            valor = valor / 100;

            nota = valor/50;
            System.out.println(nota);
            valor = valor % 50;

            nota = valor/20;
            System.out.println(nota);
            valor = valor % 20;

            nota = valor/10;
            System.out.println(nota);
            valor = valor % 10;

            nota = valor/5;
            System.out.println(nota);
        }

    }

}
