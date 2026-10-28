package Ficha02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaracao de variaveis
        int n1, n2, n3;

        //Entrada
        System.out.print("Digite um numero: ");
        n1 = input.nextInt();

        System.out.print("Digite outro numero: ");
        n2 = input.nextInt();

        System.out.print("Digite mais um numero: ");
        n3 = input.nextInt();

        //Condicionais
        if (n1 < n2 && n1 < n3){
            System.out.println(n1 + " numero menor.");
        } else if (n2 < n1 && n2 < n3){
            System.out.println(n2 + " numero menor");
        } else {
            System.out.println(n3 + " numero menor");
        }

    }
}
