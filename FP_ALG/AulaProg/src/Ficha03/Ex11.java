package Ficha03;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        int limite, salto, cont=0;

        //Entrada
        System.out.println("Digite um valor limite: ");
        limite = input.nextInt();

        System.out.println("Digite um valor de salto: ");
        salto = input.nextInt();

        while (cont <= limite){
            System.out.println(cont);
             cont = cont + salto;
        }
    }
}
