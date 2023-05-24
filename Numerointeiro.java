package Exercicio002;

import java.util.Scanner;

public class Numerointeiro {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner (System.in); //entrada
        System.out.println("digite numero");
        numero= sc.nextInt();

        int antecessor;

        int sucessor;
        antecessor=numero-1;
        sucessor=numero+1;
        System.out.println("seu numero anterior e " + antecessor);
        System.out.println("seu numero anterior e " + sucessor);
    }
}
