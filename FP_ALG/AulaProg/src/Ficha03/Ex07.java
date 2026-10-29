package Ficha03;

public class Ex07 {
    public static void main(String[] args) {
        //Declaração de variáveis
        int numero = 1, soma = 0;

        //ciclo
        while (numero <= 100){
            soma = soma + numero; // Assume o valor que entra no ciclo e cada vez que passa no ciclo, soma o próximo numero.
            System.out.println(numero);
            numero = numero + 1;
        }

        System.out.println("Somatório: " + soma);
    }
}
