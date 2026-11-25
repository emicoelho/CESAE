package Ficha07;

import java.io.FileNotFoundException;
import java.util.Scanner;
import static Ficha07.Ex09Funcoes.*;

public class Ex09 {
    //Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género,
    //duração) para uma matriz.
    //a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
    //b. Pesquisar por músicas de um determinado género.
    //c. Pesquisar músicas de um determinado artista.
    //d. Pesquisar música com maior duração.
    //e. Pesquisar músicas com duração acima de um valor especificado.
    //f. Número de músicas no ficheiro

    public static void menu(String[][] matriz) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n-+-+-+-+-+-+ MENU DE PESQUISA MUSICAL -+-+-+-+-+-+");
            System.out.println("\n1. Pesquisar por gênero");
            System.out.println("2. Pesquisar por artista");
            System.out.println("3. Pesquisar música com maior duração" );
            System.out.println("4. Pesquisar música com duração maior que" );
            System.out.println("5. Quantidade de músicas no ficheiro" );
            System.out.println("0. Sair");

            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\n-+-+-+-+- PESQUISA POR GÊNERO -+-+-+-+-");
                    System.out.println("Gênero: ");
                    input.nextLine(); //Limpa o buffer
                    String genero = input.nextLine();

                    pesquisaGenero(matriz, genero);
                    break;

                case 2:
                    System.out.println("\n-+-+-+-+- PESQUISA POR ARTISTA -+-+-+-+-");
                    System.out.println("Artista: ");
                    input.nextLine();
                    String artista = input.nextLine();

                    pesquisaArtista(matriz, artista);
                    break;

                case 3:
                    System.out.println("\n-+-+-+-+- PESQUISA POR MÚSICA DE MAIOR DURAÇÃO -+-+-+-+-");

                    break;

                case 4:
                    System.out.println("\n-+-+-+-+- PESQUISA POR MÚSICA COM MAIOR DURAÇÃO QUE -+-+-+-+-");

                    break;

                case 5:
                    System.out.println("\n-+-+-+-+- QUANTIDADE DE MÚSICAS NO FICHEIRO -+-+-+-+-");
                    System.out.println(matriz.length);
                    break;
            }
        }while (opcao != 0);
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[][] ficheiroMatriz = lerFicheiroMatriz("Ficheiros/exercicio_09.csv");
        menu(ficheiroMatriz);
    }
}
