package Ficha03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int numero=0, cont1=0, cont2=0, cont3=0, cont4=0;

        //Ciclo
        while(numero >= 0){
            //Entrada
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 25) {
                cont1++;
            }
            if (numero >=26 && numero <=50){
                cont2++;
            }
            if (numero >= 51 && numero <= 75){
                cont3++;
            }
            if (numero >= 76 && numero <= 100){
                cont4++;
            }
        }
        System.out.println("00 - 25; " +cont1);
        System.out.println("26 - 50: " +cont2);
        System.out.println("51 - 75: " +cont3);
        System.out.println("76 - 100: " +cont4);

    }
}
