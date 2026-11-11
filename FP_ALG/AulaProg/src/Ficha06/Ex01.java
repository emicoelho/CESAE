package Ficha06;
import java.util.Scanner;

public class Ex01 {
    //Implemente uma função void fazerBarulho( ) que receba um animal (String)
    //como argumento. De seguida, de acordo com o animal deve fazer o barulho
    // característico (Ex.: Cão – “Au au au” | Gato – “Miau” | Peixe - “Glub
    //Glub” | Vaca – “Muuuu” | Porco – “Oinc oinc”)


    //Função
    public static String fazerBarulho(String animal){
        String barulho;

        if (animal.equals("cão")){
            barulho = "au au au";
        }else if (animal.equals("gato")){
            barulho = "miau";
        } else if (animal.equals("peixe")) {
            barulho = "glub glub";
        } else if (animal.equals("vaca")) {
            barulho = "muuu";
        } else if (animal.equals("porco")) {
            barulho = "oinc oinc";
        }else {
            barulho = "Animal desconhecido";
        }

        return barulho;
    }

    static void main() {
        Scanner input = new Scanner(System.in);

        String animal;

        System.out.print("Animal: ");
        animal = input.next();

        String resultado = fazerBarulho(animal); //Chamada da função

        System.out.println(resultado);


    }

}
