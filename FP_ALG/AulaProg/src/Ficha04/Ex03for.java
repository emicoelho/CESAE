package Ficha04;
import java.util.Scanner;

public class Ex03for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //3. Implemente um programa que solicite um número ao utilizador,
        //seguidamente, apresente todos os seus divisores.

        //Declaração de variáveis
        int numero;

        //Entrada
        System.out.println("Número: ");
        numero = input.nextInt();

        //Ciclo
        for (int divisao = 1; divisao <= numero; divisao++){
            if (numero % divisao == 0){
                System.out.println(divisao);
            }
        }
    }
}
