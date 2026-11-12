package Ficha06;
import java.util.Scanner;

import static Ficha06.Ex03.*;

public class Ex04 {

    public static void menu(){
        Scanner input = new Scanner(System.in);

        int numero, opcao;

        numero = lerNumero();

        do {
            System.out.println("\n-+-+-+-+-+-+ ANÁLISE DE UM NÚMERO -+-+-+-+-+-+");

            System.out.println("\n1. Par ou ímpar");
            System.out.println("2. Positivo ou negativo");
            System.out.println("3. Primo?");
            System.out.println("4. Perfeito?");
            System.out.println("5. Triangular?");
            System.out.println("6. Trocar número");
            System.out.println("0. Sair");

            opcao = lerOpcao();

            switch (opcao){
                case 1:
                    if (par(numero)){
                        System.out.println("O número é par. ");
                    }else {
                        System.out.println("O número é ímpar. ");
                    }
                    break;
                case 2:
                    if (positivo(numero)){
                        System.out.println("O número é positivo. ");
                    }else {
                        System.out.println("O número é negativo.");
                    }
                    break;
                case 3:
                    if (primo(numero)){
                        System.out.println("O número é primo.");
                    }else {
                        System.out.println("O número não é primo.");
                    }
                    break;
                case 4:
                    if (perfeito(numero)){
                        System.out.println("O número é perfeito.");
                    }else {
                        System.out.println("O número é imperfeito. ");
                    }
                    break;
                case 5:
                    if (triangular(numero)){
                        System.out.println("O número é triangular. ");
                    }else {
                        System.out.println("O número não é triangular. ");
                    }
                    break;
                case 6:
                    numero = lerNumero();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcão não reconhecida: " + opcao);
            }
        } while (opcao != 0);
    }

    public static void main(String[] args) {
        menu();
    }
}
