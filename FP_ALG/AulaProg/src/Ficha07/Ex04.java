package Ficha07;

import java.io.FileNotFoundException;

import static Ficha07.functions.lerFicheiro;

public class Ex04 {
    public static void main(String[] args) throws FileNotFoundException {
        //Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o
        //conteúdo na consola.

       lerFicheiro("Ficheiros/exercicio_04.csv");

    }

}
