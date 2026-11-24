package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class functions {

    /**
     * Função que cria um ficheiro novo
     * @param ficheiro
     * @throws FileNotFoundException
     */
    public static void criarFicheiro(String ficheiro) throws IOException {

        File file = new File(ficheiro);
        file.createNewFile();

    }

    /**
     *
     * @param ficheiro Ficheiro onde será escrito o texto
     * @param texto Texto que será inserido no ficheiro
     * @throws FileNotFoundException
     */
    public static void escreverFicheiro(String ficheiro, String texto) throws FileNotFoundException{

        File file = new File(ficheiro);
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println(texto);

        printWriter.close();
    }


    public static void lerFicheiro(String ficheiro) throws FileNotFoundException{

        File file = new File("Ficheiros/file01.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
