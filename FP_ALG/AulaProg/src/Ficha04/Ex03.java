package Ficha04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //3. Implemente um programa que solicite um número ao utilizador,
        //seguidamente, apresente todos os seus divisores.

        //Declaração de variáveis
        int numero, divisor=1;

        //Entrada
        System.out.println("Número: ");
        numero = input.nextInt();

        //ciclo
        do {
            if (numero % divisor == 0) { //Se o resto da divisão de número pelo divisor resultar 0: print, senão continua e adiciona + 1 ao divisor, até que o divisor seja = ao número.
                System.out.println(divisor);
            }
            divisor++; //Adiciona + 1 no divisor
        }while(divisor <= numero ); // volta pro DO enquanto o divisor nã for = número.

    }
}
