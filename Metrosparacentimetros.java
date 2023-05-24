package Exercicio002;

import java.util.Scanner;

public class Metrosparacentimetros {
    public static void main(String[] args) {
        double metros;
        Scanner sc = new Scanner (System.in); //entrada
        System.out.println("quantos metros");
        metros= sc.nextDouble();
        double centimetros; //processamento
        centimetros=metros*100;
        System.out.println("quantos centimetros" + centimetros); //saida
    }
}
