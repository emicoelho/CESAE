package Ficha06;
import java.util.Scanner;

import static Ficha06.Ex03.*;

public class Ex04 {
    static void main() {
        Scanner input = new Scanner(System.in);

        //Declaração da variável
        int numero;

        //Entrada
        System.out.println("Digite um número: ");
        numero = input.nextInt();

        //Chamada da função
        boolean resultado = par(numero);

        System.out.println(resultado);

    }
}
