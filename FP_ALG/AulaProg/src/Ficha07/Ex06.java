package Ficha07;

import java.io.FileNotFoundException;

import static Ficha07.functions.maiorIdade;

public class Ex06 {
    public static void main(String[] args) throws FileNotFoundException {
        // Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por
        // vírgulas e imprima o nome da pessoa mais velha na consola.

        maiorIdade("Ficheiros/exercicio_06.txt");
    }
}
