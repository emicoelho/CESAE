package Ficha06;

import java.util.Scanner;

public class Ex03 {

    /**
     * Função que lê e atribui um número inserido pelo usuário
     * @return Retorna o número lido
     */
    public static int lerNumero(){
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        return numero;
    }

    /**
     * Função que lê a opção que o usuário deseja utilizar
     * @return Retorna a opção lida
     */
    public static int lerOpcao(){
        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.print("Opcão: ");
        opcao = input.nextInt();

        return opcao;
    }

    /**
     * Função para determinar se um número é par ou ímpar
     * @param num Número a ser analisado
     * @return retorna true se for par | false se for ímpar
     */
    public static boolean par(int num){

        if (num % 2 == 0){
            return true;
        }
            return false;
        }

    /**
     * Função para determinar se um número é positivo ou negativo
     * @param num Número a ser analisado
     * @return retorna true se for positivo | false se for negativo
     */
    public static boolean positivo(int num){

        if (num >= 0){
            return true;
        }

        return false;
    }

    /**
     * Função que determina se um número é ou não primo
     * @param num Número a ser analisado
     * @return retorna true se primo | false se não
     */
    public static boolean primo(int num){
        if (num < 2){
            return false;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

    /**
     * Função que determina se um número é ou não perfeito
     * @param num Número a ser analisado
     * @return retorna true se for perfeito | false se não
     */
    public static boolean perfeito(int num) {
        int soma = 0;

        for (int i = 1; i < num; i++) {
            if(num%i==0) {
                soma += i;
            }
        }

        if (soma == num) {
            return true;
        }

        return false;
    }

    /**
     * Função que determina se um número é triangular
     * @param num Número a ser analisado
     * @return retorna true se for triangular | false se não for
     */
    public static boolean triangular(int num) {
        int triangulares = 0;

        for (int i = 1; triangulares < num; i++){
            triangulares += i;

            if (triangulares == num){
                return true;
            }

        }

        return false;
    }

}

