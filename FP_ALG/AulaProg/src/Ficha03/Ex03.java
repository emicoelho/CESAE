package Ficha03;

public class Ex03 {
    public static void main(String[] args) {

        //Declaracao de variável
        int numero = 351; //Tem que iniciar no primeiro valor, senão não entra no ciclo.

        while (numero >= 351 && numero <= 750){
            System.out.println(numero);
            numero = numero + 2;
        }
    }
}
