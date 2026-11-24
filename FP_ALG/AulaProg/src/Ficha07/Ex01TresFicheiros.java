package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01TresFicheiros {

    public static void usingScanner(String caminho) throws FileNotFoundException {

        File file = new File(caminho);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    public static void main(String[] args) throws FileNotFoundException{
        usingScanner("Ficheiros/exercicio_01.txt");
        System.out.println();

        usingScanner("Ficheiros/exercicio_01_Alternativa01.txt");
        System.out.println();

        usingScanner("Ficheiros/exercicio_01_Alternativa02.txt");
        System.out.println();
    }
}
