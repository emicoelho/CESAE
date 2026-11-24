package Ficha07;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ex04 {
    //Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o
    //conteúdo na consola.

    //Criar um ficheiro CSV e escrever conteúdo ao mesmo tempo
    public static void criarCSV() throws IOException{

        //Cria o ficheiro e permite escrever conteúdo nele.
        FileWriter fw = new FileWriter("Ficheiros/alunos.csv");

        //Escreve o conteúdo dentro do ficheiro
        fw.write("Nome;Idade;Curso");
        fw.write(System.lineSeparator());

        fw.write("Ana;25;Java");
        fw.write(System.lineSeparator());
    }




    public static void lerCSV() throws FileNotFoundException {

    }
}
