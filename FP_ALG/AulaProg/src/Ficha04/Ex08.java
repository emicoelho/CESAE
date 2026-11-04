package Ficha04;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //8. Implemente uma função que determina se um número (passado por argumento) é triangular, a função deve
        //retornar true se triangular ou false se não triangular (Um número triangular é um número que pode ser
        //representado pela soma de números inteiros consecutivos. Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5).

        //Declaração de variáveis
        int numero, cont=1, soma=0;

        //Entrada
        System.out.println("Número: ");
        numero = input.nextInt();

        do {
            numero = numero - cont;
            System.out.println("N: "+numero);

            cont++;
        }while(cont <= numero);


    }
}
