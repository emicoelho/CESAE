package Ficha07;

import java.io.FileNotFoundException;

import static Ficha07.functions.calcularTotalVendas;
public class Ex08 {
    public static void main(String[] args) throws FileNotFoundException {
        //Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de
        //produto, produto, quantidade vendida, valor unitario) e calcule o valor total das vendas.

        System.out.println("Valor total das vendas: " + calcularTotalVendas("Ficheiros/exercicio_08.csv"));
    }
}
