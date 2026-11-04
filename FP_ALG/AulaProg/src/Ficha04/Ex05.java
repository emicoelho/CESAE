package Ficha04;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //5. Implemente um programa que leia a opção do menu desejada
        // (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
        //Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto
        // com a opção escolhida. Caso a escolha esteja fora das opções
        // válidas, deverá informar o utilizador. De seguida, deverá
        // apresentar novamente o menu para poder selecionar novas opções
        // até que a opção 4 seja escolhida.

        //Declaração de variáveis
        int opcao;


        do {
            //Entrada
            System.out.println("1: Criar");
            System.out.println("2: Atualizar");
            System.out.println("3: Eliminar");
            System.out.println("4: Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            //Print baseado na escola
                if (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) {
                    switch (opcao) {
                        case 1:
                            System.out.println("CRIAR");
                            break;
                        case 2:
                            System.out.println("ATUALIZAR");
                            break;
                        case 3:
                            System.out.println("ELIMINAR");
                            break;
                        case 4:
                            System.out.println("SAIR");
                    }
                }else{
                    System.out.println("Opção inválida.");
                }
        }while(opcao != 4);
    }
}
