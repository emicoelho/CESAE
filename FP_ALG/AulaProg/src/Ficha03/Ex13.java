package Ficha03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int numero, limite;

        //Entrada
        System.out.print("Digite o início: ");
        numero = input.nextInt();

        System.out.print("Digite o fim: ");
        limite = input.nextInt();

        while (numero <= limite) {
            if (numero % 5 == 0){
                System.out.println(numero);
            }

            numero++;
        }

    }
}





