package Ficha02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Declarar variáveis
        double salario, imposto;

        System.out.print("Salário: ");
        salario = input.nextDouble();

        if (salario <= 15000) {
            imposto = salario * 0.2;
            System.out.println("Paga taxa de 20%: " + imposto);
        } else {
            imposto = salario * 0.3;
            System.out.println("Paga taxa de 30%:" + imposto);
        }
        }
    }

