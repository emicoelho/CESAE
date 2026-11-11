package Ficha06;
import java.util.Scanner;

public class Ex02 {
    //Escreva uma função que leia um valor inteiro positivo (deve solicitar
    //números até que seja inteiro e positivo) e crie uma função que imprima numa
    //linha um número de asteriscos igual ao valor inserido pelo utilizador.

    //Função ler inteiro positivo
    public static int lerValor(){ //Não precisa de parametro porque a função faz a leitura
        Scanner input = new Scanner(System.in);
        int numero;

        //Entrada
        System.out.print("Digite um número: ");
        numero = input.nextInt();

        while(numero <= 0){
            System.out.print("Digite um número: ");
            numero = input.nextInt();

        }

        return numero;
    }

    //Função que imprime asteriscos
    public static int linhaAsteriscos(int numero){
        for (int i=0; i < numero; i++){
            System.out.print("*");
        }

        return numero;
    }


    //Main
    static void main() {
        Scanner input = new Scanner(System.in);
        int numero = lerValor();

        int asterisco = linhaAsteriscos(numero);
    }
}
