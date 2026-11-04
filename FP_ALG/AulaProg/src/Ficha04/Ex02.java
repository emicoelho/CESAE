package Ficha04;

public class Ex02 {
    public static void main(String[] args) {

        //2. Implemente um programa que imprima os números ímpares de 11 a
        // 51 (inclusive) usando o ciclo for, no final, apresente o somatório
        // de todos estes números.

        int somatorio=0;

        for (int i= 11; i <= 51; i+=2){
            System.out.println(i);

            somatorio += i;

        }

        System.out.println("Somatorio: " + somatorio);
    }

}
