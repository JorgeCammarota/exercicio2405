package Exercicio002;

import java.util.Scanner;

public class Inss
{
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


        double inss;
        inss=0.08*salariomes;

        double sindicato;
        sindicato=0.05*salariomes;

        double impostoderenda;
        impostoderenda=0.11*salariomes;

        double salarioliquido;
        salarioliquido=salariomes-inss-sindicato-impostoderenda;

        System.out.println(" salario bruto " + salariomes);
        System.out.println(" inss " + inss);
        System.out.println(" sindicato " + sindicato);
        System.out.println(" impostoderenda " + impostoderenda);
        System.out.println(" salarioliquido " + salarioliquido);

    }
}
