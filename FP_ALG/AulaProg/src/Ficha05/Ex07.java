package Ficha05;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Implemente um programa que armazene num array 10 valores pedidos ao
        // utilizador, e retorne o maior valor par inserido. Caso não exista,
        // deverá informar o utilizador.

        //Declaração array
        int[] numero = new int[10];

        //Entrada
        for (int i = 0; i < numero.length; i++){
            System.out.print("Número: ");
            numero[i] = input.nextInt();
        }

        //Declaração após inserção
        int aux = numero[0];

        //Descobrir o maior
        for (int i = 0; i < numero.length; i++){
            if (aux < numero[i]) {
                if(numero[i]%2 == 0) {
                    aux = numero[i];
                }
            }
        }

        System.out.println(aux);
    }
}
