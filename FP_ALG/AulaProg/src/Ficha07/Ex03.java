package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex03 {

    // Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o
    // num outro ficheiro.

    //Input/Output Exception
    public static void usingScanner() throws IOException {

        File origem = new File("Ficheiros/file01.txt");
        File destino = new File("Ficheiros/file03.txt");

        Scanner sc = new Scanner(origem); //Abre o ficheiro de origem para leitura
        FileWriter fw = new FileWriter(destino); //Abre o ficheiro de destino para escrita

        while (sc.hasNextLine()){ //Verifica se ainda existem linhas para ler
            String linha = sc.nextLine(); //Lê uma linha do ficheiro

            fw.write(linha); //Escreve essa linha no novo ficheiro
            fw.write(System.lineSeparator()); //Representa uma quebra de linha
        }

        sc.close();
        fw.close();
    }

    //Chamar a função
    public static void main(String[] args) throws IOException {
        usingScanner();
        System.out.println("Ficheiro copiado com sucesso!");

    }
}
