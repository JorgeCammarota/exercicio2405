package Exercicio002;

import java.util.Scanner;

public class Mediaaritmetica {
    public static void main(String[] args) {


   double  nota1;
   double nota2;
   double nota3;
   double nota4;
        Scanner sc = new Scanner (System.in);

        System.out.println("digite a nota 1");
        nota1= sc.nextDouble();
        System.out.println("digite a nota 2");
        nota2= sc.nextDouble();
        System.out.println("digite a nota 3");
        nota3= sc.nextDouble();
        System.out.println("digite a nota 4");
        nota4= sc.nextDouble();
   double media; //criar uma variavel
   media=(nota1+nota2+nota3+nota4)/4;
   System.out.println("sua media" + media);

        }
    }
