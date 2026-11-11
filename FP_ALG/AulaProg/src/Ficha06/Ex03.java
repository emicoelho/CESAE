package Ficha06;

public class Ex03 {

    //Implemente uma função que determina se um número (passado por argumento) é par ou
    // ímpar, a função deve retornar true se par ou false se ímpar.
    public static boolean par(int num){

        if (num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    // Implemente uma função que determina se um número (passado por argumento) é positivo ou negativo,
    //a função deve retornar true se zero ou positivo, ou false se negativo.
    public static boolean positivo(int num){

        if (num >= 0){
            return true;
        }else {
            return false;
        }
    }

    // Implemente uma função que determina se um número (passado por argumento) é ou não
    // primo, a função deve retornar true se primo ou false se não primo.
    public static boolean primo(int num){


        return true;
    }
}
