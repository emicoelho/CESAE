package Ficha02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaracao de variaveis
        double n1, n2, n3, media;

        //Entrada do usuario
        System.out.print("Digite a primeira nota: ");
        n1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = input.nextDouble();

        //Calculo
        media = (n1 * 0.25) + (n2 * 0.35) + (n3 * 0.4);

        //Condicionais
        if (media > 9.5){
            System.out.println("Sua media foi " + media + ". Voce esta aprovado.");
        } else{
            System.out.println("Sua media foi " + media + ". Voce esta reprovado.");
        }

    }
}
