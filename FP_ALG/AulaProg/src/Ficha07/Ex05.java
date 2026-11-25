package Ficha07;

import java.io.FileNotFoundException;

import static Ficha07.functions.somarLinhaFicheiro;

public class Ex05 {
    public static void main(String[] args) throws FileNotFoundException {

        //Escreva um programa que leia um ficheiro de texto contendo números inteiros separados
        //por espaço e calcule a soma desses números.

        System.out.println("Soma do ficheiro 1: " + somarLinhaFicheiro("Ficheiros/exercicio_05_31.txt"));
        System.out.println("Soma do ficheiro 1: " + somarLinhaFicheiro("Ficheiros/exercicio_05_1999.txt"));

    }
}
