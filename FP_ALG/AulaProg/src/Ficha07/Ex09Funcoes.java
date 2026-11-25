package Ficha07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09Funcoes {

    /**
     * Função para descobrir quantas linhas têm o ficheiro
     * @param ficheiro
     * @return Retorna o total de linhas
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
     * Função para descobrir quantas colunas tenho no ficheiro
     * @return Retorna a quantidade de colunas
     * @throws FileNotFoundException
     */
    public static int contarColunasFicheiro(String ficheiro, String separador) throws FileNotFoundException{
        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        String cabecalho = sc.nextLine(); //Cabeçalho
        String[] cabecalhoSeparado = cabecalho.split(separador);

        return cabecalhoSeparado.length;
    }


    /**
     * Função que lê um ficheiro para uma matriz, excluindo o cabeçalho
     * @param ficheiro
     * @return Matriz (String) com o conteúdo do ficheiro
     * @throws FileNotFoundException
     */
    public static String[][] lerFicheiroMatriz(String ficheiro) throws FileNotFoundException{

        int numeroLinhas = totalLinhas(ficheiro);
        int numeroColunas = contarColunasFicheiro(ficheiro, ",");

        String[][] matrizMusicas = new String[numeroLinhas - 1][numeroColunas]; //Número de linhas menos o cabeçalho

        File file = new File(ficheiro);
        Scanner sc = new Scanner(file);

        //Avançar o cabeçalho
        sc.nextLine();

        int linhaPreencher = 0;

        while (sc.hasNextLine()){
            String linhaAtual = sc.nextLine();
            String[] linhaSeparada = linhaAtual.split(",");

            for (int i = 0; i < linhaSeparada.length; i++){ //Enquanto o contador i for menor que o tamanho do vetor linhaSeparada, continua percorrendo
                matrizMusicas[linhaPreencher][i] = linhaSeparada[i]; //linhaPreencher inicia em 0 e o contador i, que representa a coluna, também. Vai add 1 por 1 as colunas de cada linha até o tamanho.
            }

            linhaPreencher++; //Sai do ciclo for e incrementa, passando então pra linha abaixo. Volta pro for e preenche aquela linha.
        }

        return matrizMusicas;

    }


    /**
     * Função que percorre a matriz em busca do gênero escolhido pelo usuário
     * @param matriz
     * @param genero Gênero escolhido pelo usuário
     * @throws FileNotFoundException
     */
    public static void pesquisaGenero(String[][] matriz, String genero) throws FileNotFoundException{
        System.out.println("Músicas de " + genero);

        for (int linha = 0; linha < matriz.length; linha++){

            if (matriz[linha][2].equals(genero)){
                System.out.println(matriz[linha][1] + " | " + matriz[linha][0]);
            }
        }
    }


    /**
     * Função que percorre a matriz em busca das músicas do artista escolhido pelo usuário
     * @param matriz
     * @param artista Artista escolhido pelo usuário
     * @throws FileNotFoundException
     */
    public static void pesquisaArtista(String[][] matriz, String artista) throws FileNotFoundException{
        System.out.println("Músicas do artista " + artista);

        for (int linha = 0; linha < matriz.length; linha++){

            if (matriz[linha][1].equals(artista)){
                System.out.println(matriz[linha][0]);
            }
        }
    }


    /**
     * Função que pega na coluna duração, divide ela em partes, converte tudo para segundos e então compara as durações
     * @param matriz
     * @return Retorna o nome da música com maior duração
     */
    public static String musicaMaisLonga(String[][] matriz){
        int maiorDuracao = 0;
        String nomeMusica = "";

        for (int i = 0; i < matriz.length; i++){

            String[] partes = matriz[i][3].split(":"); //Divide a string = partes[0] = "6"  partes[1] = "06"

            //Converter as partes para números
            int minutos = Integer.parseInt(partes[0]);
            int segundos = Integer.parseInt(partes[1]);

            //Converter o tempo total para segundos
            int duracaoTotal = minutos * 60 + segundos;

            //Comparar
            if (duracaoTotal > maiorDuracao){
                maiorDuracao = duracaoTotal;
                nomeMusica = matriz[i][0];
            }
        }

        return nomeMusica;
    }
}
