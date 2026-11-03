package Ficha03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int n1, n2;

        //Entrada
        System.out.println("Insira um número: ");
        n1 = input.nextInt();

        System.out.println("Insira outro número: ");
        n2 = input.nextInt();

        //Ciclo

        while(n1 <= n2){
            System.out.println(n1);
            n1 = n1 + 1;
        }
    }
}
