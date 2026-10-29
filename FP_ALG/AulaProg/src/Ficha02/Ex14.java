package Ficha02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variaveis
        int a, b, c;

        //Entrada dos números
        System.out.println("Número 1: ");
        a = input.nextInt();

        System.out.println("Número 2: ");
        b = input.nextInt();

        System.out.println("Número 3: ");
        c = input.nextInt();

        //Condicionais
        if (a < b && a < c && b < c){
            System.out.println(a + " " + b + " " + c);
        }

        if (a < c && a < b && b > c){
            System.out.println(a + " " + c + " " + b);
        }

        if (b < a && b < c && c > a){
            System.out.println(b + " " + a + " " + c);
        }

        if (b < c && b < a && a > b){
            System.out.println(b + " " + c + " " + a);
        }

        if (c < a && c < b && b > a){
            System.out.println(c + " " + a + " " + b);
        }

        if (c < b && c < a && a > b){
            System.out.println(c + " " + b + " " + a);
        }
    }
}

