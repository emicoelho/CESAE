package Ficha07;

import java.io.*;
import java.util.Scanner;

public class functions {

    /**
     * Função que cria um ficheiro novo
     * @param ficheiro
     * @throws FileNotFoundException Se o ficheiro existir apaga e escreve de novo, senão, cria um novo
     */
    public static void criarFicheiro(String ficheiro) throws IOException {

        File file = new File(ficheiro);
        file.createNewFile();

    }


    /**
     * Função que escreve dentro de um ficheiro
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


    /**
     * Função que lê e printa o conteúdo de um ficheiro
     * @param ficheiro
     * @throws FileNotFoundException
     */
    public static void lerFicheiro(String ficheiro) throws FileNotFoundException{

        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }


    /**
     * Função que abre um ficheiro e copia o conteúdo para outro
     * @param ficheiroOriginal
     * @param ficheiroCopia
     * @throws FileNotFoundException
     */
    public static void copiarFicheiro(String ficheiroOriginal, String ficheiroCopia) throws FileNotFoundException {

        File origem = new File(ficheiroOriginal);
        Scanner sc = new Scanner(origem); //Abre o ficheiro de origem para leitura

        File copia = new File(ficheiroCopia);
        PrintWriter fw = new PrintWriter(copia); //Abre o ficheiro de destino para escrita

        while (sc.hasNextLine()){ //Verifica se ainda existem linhas para ler
            String linha = sc.nextLine(); //Lê uma linha do ficheiro

            fw.write(linha); //Escreve essa linha no novo ficheiro
        }

        sc.close();
        fw.close();
    }


    /**
     * Função que soma os valores da linha do ficheiro
     * @param ficheiro
     * @return Retorna o valor total da soma
     * @throws FileNotFoundException
     */
    public static int somarLinhaFicheiro(String ficheiro) throws FileNotFoundException {

        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        int total = 0;

        while (sc.hasNextLine()){
            int numeroAtual = sc.nextInt();
            total += numeroAtual;
        }

        return total;

    }


    /**
     * Função que lê um ficheiro e retorna a pessoa com maior idade.
     * @param ficheiro
     * @throws FileNotFoundException
     */
    public static void maiorIdade(String ficheiro) throws FileNotFoundException {
        int idadeMaisAlta = 0;
        String nomeMaisVelho = "";

        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){

            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");

            if (Integer.parseInt(linhaSeparada[1]) > idadeMaisAlta){
                idadeMaisAlta = Integer.parseInt(linhaSeparada[1]);
                nomeMaisVelho = linhaSeparada[0];
            }
        }

        System.out.println("A pessoa mais velha é " + nomeMaisVelho + " com " + idadeMaisAlta + " anos.");
    }


    /**
     * Função que faz a contagem de quantidade de linhas de um ficheiro.
     * @param ficheiro
     * @return total de linhas
     * @throws FileNotFoundException
     */
    public static int totalLinhas(String ficheiro) throws FileNotFoundException {

        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        int totalLinhas = 0;

        while (sc.hasNextLine()){
            sc.nextLine();
            totalLinhas ++;
        }

        return totalLinhas;
    }


    /**
     * Função que faz a contagem da quantidade de palavras de um ficheiro.
     * @param ficheiro
     * @return total de palavras.
     * @throws FileNotFoundException
     */
    public static int totalPalavras (String ficheiro) throws FileNotFoundException{
        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        int totalPalavras = 0;

        while (sc.hasNext()){
            sc.next();
            totalPalavras ++;
        }

        return totalPalavras;
    }


    /**
     * Função que calcula o total de vendas dos produtos contidos no ficheiro
     * @param ficheiro
     * @return Retorna o valor total
     * @throws FileNotFoundException
     */
    public static double calcularTotalVendas(String ficheiro) throws FileNotFoundException{
        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine(); // Pula o cabeçalho

        double total = 0;

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaSeparada = linha.split(",");

            total += Double.parseDouble(linhaSeparada[2]) * Double.parseDouble(linhaSeparada[3]);
        }

        return total;

    }



}
