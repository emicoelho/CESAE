package Ficha03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variável
        int numero, cont = 0;
        String msg;

        //Entrada
        System.out.println("Introduza um número: ");
        numero = input.nextInt();

        //Limpar o buffer, ou seja, "usa" o enter do dado anterior
        input.nextLine();

        System.out.println("Introduza uma msg: ");
        msg = input.nextLine();

        //Ciclo
        while (cont < numero){
            System.out.println(msg);
            cont = cont + 1;
        }
    }
}
