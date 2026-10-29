package Ficha02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int horas, minutos, aux = 0;

        //Entrada do usuário
        System.out.println("Introduza horas: ");
        horas = input.nextInt();

        System.out.println("Introduza minutos: ");
        minutos = input.nextInt();

        //Condicionais
        if (horas >= 24 || horas < 1){
            System.out.println("Horas inválidas.");
        } else if (minutos < 0 || minutos > 60){
            System.out.println("Minutos inválidos");
        }else if(horas <= 12) {
            System.out.println(horas + ":" + minutos + "AM");
        } else{
            aux = horas % 12;
            System.out.println(aux + ":" + minutos);
        }
    }
}





