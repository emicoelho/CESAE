package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Ex02Teste {

    // Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem

    public static void usingPrintWriter() throws FileNotFoundException {
        String fileContent = "Hello! Adoro programar em Java.";

        File file = new File("Ficheiros/file02.txt"); //Fiz o teste para descobrir se só assim criava um ficheiro do nada.
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("É a minha UFCD favorita");

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        usingPrintWriter();
        System.out.println("Ficheiro criado com sucesso!");
    }
}
