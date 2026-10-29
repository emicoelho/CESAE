package Ficha03;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int numero, cont = 1, cont2 = 1;

        //Entrada
        System.out.println("Insira um número: ");
        numero = input.nextInt();

        //Ciclo
        numero=numero-6;

        while (cont <= 5){
            numero = numero + 1;
            System.out.println(numero);
            cont = cont + 1;
        }

        numero = numero + 1;

        while(cont2 <= 5){
            numero = numero + 1;
            System.out.println(numero);
            cont2 = cont2 + 1;
        }

    }
}
