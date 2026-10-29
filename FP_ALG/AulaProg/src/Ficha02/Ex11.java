package Ficha02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        double saldo, montante, saldo_final;
        String opcao;

        //Entrada do usuário
        System.out.println("Saldo da conta bancária: ");
        saldo = input.nextDouble();

        System.out.println("- ou +: ");
        opcao = input.next();

        System.out.println("Montante: ");
        montante = input.nextDouble();

        //Validacao condicional
        if (saldo > 0) { //Se o saldo for positivo
            if (opcao.equals("-")) {
                saldo_final = saldo - montante;

                if (saldo_final >= 0) {
                    System.out.println("Saldo atual: " + saldo_final);
                } else {
                    System.out.println("Operação inválida. Valor de saldo insuficiente para débito. ");
                    System.out.println("Saldo atual: " + saldo);
                }
            } else if (opcao.equals("+")) {
                saldo_final = saldo + montante;
                System.out.println("Saldo atual: " + saldo_final);
            } else {
                System.out.println("Operacao invalida.");
            }
        }else{
            System.out.println("Você não possui saldo suficiente. ");
        }
    }
}
