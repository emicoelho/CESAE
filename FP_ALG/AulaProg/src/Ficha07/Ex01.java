package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

    //Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola.

    public static void usingScanner() throws FileNotFoundException{

        File file = new File("Ficheiros/file01.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException{
        usingScanner();
    }
}
