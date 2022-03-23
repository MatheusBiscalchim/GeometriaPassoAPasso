package Geometria;

import java.lang.Math;
import java.util.Scanner;

public class Quadrado {

    Scanner sc = new Scanner(System.in);

    public double perimetro(){
        System.out.println("Formula perimetro quadrado:");
        System.out.println("Perimetro quadrado = lado+lado+lado+lado");
        System.out.println("");
        System.out.println("Digite o lado do quadrado: ");
        double lado = sc.nextDouble();
        double meioPerimetro = lado+lado;
        System.out.println("Perimetro = "+meioPerimetro+" + "+meioPerimetro);
        double perimetro = meioPerimetro+meioPerimetro;
        System.out.println("Perimetro = "+(meioPerimetro+meioPerimetro));
        return perimetro;
    }

    public double area(){
        System.out.println("\nFormula area quadrado:");
        System.out.println("Area quadrado = lado*lado");
        System.out.println("");
        double lado = sc.nextDouble();
        System.out.println("Area = "+lado+"*"+lado);
        System.out.println("Digite o lado do quadrado: ");
        double area = lado*lado;
        System.out.println("Area = "+area);
        return area;

    }
    public double diagonal(){
        System.out.println("\nFormula diagonal quadrado: ");
        System.out.println("Diagonal quadrado = l*√2");
        System.out.println("");
        double lado = sc.nextDouble();
        System.out.println("Diagonal = "+lado+"*√2");
        System.out.println("Digite o lado do quadrado: ");
        double diagonal = lado*Math.sqrt(2);
        System.out.println("Diagonal = "+diagonal);
        return diagonal;

    }
    public void menu(){
        int opcao = 0;
        while(opcao!=4) {
            System.out.println("|------------------------|");
            System.out.println("|       Menu             |");
            System.out.println("|------------------------|");
            System.out.println("| 01:Perimetro           |");
            System.out.println("| 02:Area                |");
            System.out.println("| 03:Diagonal            |");
            System.out.println("| 04:Sair                |");
            System.out.println("|------------------------|");
            System.out.println("Opçao escolhida: ");

            opcao = sc.nextInt();
            if (opcao == 1) {
                perimetro();
            } else if (opcao == 2) {
                area();
            } else if (opcao == 3) {
                diagonal();
            }
        }
    }
}
