package Ficha02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int opcao;

        //Entrada do usuário
        System.out.println("MENU");
        System.out.println("1- Criar");
        System.out.println("2- Atualizar");
        System.out.println("3- Eliminar");
        System.out.println("4- Sair");
        opcao = input.nextInt();

        //Condicionais
        if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
            System.out.println("Opção inválida.");
        }else {
            switch (opcao) {
                case 1:
                    System.out.println("Opção selecionada: 1- Criar");
                    break;
                case 2:
                    System.out.println("Opção selecionada: 2- Atualizar");
                    break;
                case 3:
                    System.out.println("Opção selecionada: 3- Eliminar");
                    break;
                case 4:
                    break;
            }
        }
    }
}
