package Exercicio002;

import java.util.Scanner;

public class Calculeemostre {
    public static void main(String[] args) {
        double salario;
        Scanner sc = new Scanner (System.in); //entrada
        System.out.println("quanto voce recebe por hora");
        salario= sc.nextDouble();
        double horas;
        System.out.println("quanto horas voce trabalha no mes");
        horas= sc.nextDouble();
        double salariomes;
        salariomes=salario*horas;
        System.out.println("voce recebe " + salariomes);

    }
}
