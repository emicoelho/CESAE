package Ficha03;

public class explicacaoIncremento {
    public static void main(String[] args) {

        int numero = 3, posIncremento, preIncremento;

        numero++; // Adiciona + 1 ao número (numero = numero +1)
        System.out.println(numero);

        posIncremento = numero++; // O posIncremento vai assumir o valor do número, pois o incremento só é calculado no final
        System.out.println(posIncremento);

        preIncremento = ++numero; // O preIncremento vai assumir o numero +1.
        System.out.println(preIncremento);

        //Pode ser utilizado em todos os operadores matemáticos.

    }
}
