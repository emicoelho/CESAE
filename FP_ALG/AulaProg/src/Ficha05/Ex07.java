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
        int aux = -1; //Truque pra iniciar por um par qualquer.

        //Descobrir o maior
        for (int i = 0; i < numero.length; i++){
            if(numero[i] % 2 == 0) {

                if (aux == -1) { //Aux ainda é o -1
                    aux = numero[i];
                } else if (numero[i] > aux) {
                    aux = numero[i];
                }
            }
        }

        if (aux == -1){
            System.out.println("Não há pares.");
        }else {
            System.out.println("Maior par: " + aux);
        }
    }
}
