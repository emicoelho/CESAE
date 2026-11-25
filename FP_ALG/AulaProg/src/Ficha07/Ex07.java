package Ficha07;

import java.io.FileNotFoundException;

import static Ficha07.functions.totalLinhas;
import static Ficha07.functions.totalPalavras;

public class Ex07 {
    public static void main(String[] args) throws FileNotFoundException {
        //Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas
        //e o número de palavras presentes nesse ficheiro.

        System.out.println("Quantidade de linhas: " + totalLinhas("Ficheiros/exercicio_07.txt"));
        System.out.println("Quantidade de palavras: " + totalPalavras("Ficheiros/exercicio_07.txt"));
    }
}
