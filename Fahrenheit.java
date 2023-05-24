package Exercicio002;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        double temperatura;
        Scanner sc = new Scanner (System.in); //entrada
        System.out.println("qual a temperatura em graus fahrenheit");
        temperatura= sc.nextDouble();
        double celsius;
        celsius = ((temperatura - 32)/9)*5;
        System.out.println(" temperatura " + celsius);


    }
}
