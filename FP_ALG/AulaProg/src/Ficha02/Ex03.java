package Ficha02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        double salario, imposto;

        //Entrada do usuário
        System.out.print("Salario: ");
        salario = input.nextDouble();

        //Condicionais
        if (salario <= 15000){
            imposto = salario * 0.2;
            System.out.println("Paga taxa de 20%: " + imposto);
        }else if (salario <= 20000){
            imposto = salario * 0.3;
            System.out.println("Paga taxa de 30%: " + imposto);
        }else if (salario <= 25000) {
            imposto = salario * 0.35;
            System.out.println("Paga taxa de 35%: " + imposto);
        } else {
            imposto = salario * 0.4;
            System.out.println("Paga taxa de 40%; " + imposto);
        }
    }
}
