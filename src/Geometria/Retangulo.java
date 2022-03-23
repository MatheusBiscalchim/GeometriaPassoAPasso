package Geometria;

import java.util.Scanner;

public class Retangulo {
    Scanner sc = new Scanner(System.in);

    public double perimetro(){
        System.out.println("Formula perimetro retanulo:");
        System.out.println("Perimetro retangulo = base+base+lado+lado");
        System.out.println("");
        System.out.println("Digite o lado do retangulo: ");
        double lado = sc.nextDouble();
        System.out.println("Digite a base do retangulo: ");
        double base = sc.nextDouble();
        double meioPerimetro = base+base;
        double meiPerimetro = lado+lado;
        System.out.println("Perimetro = "+meioPerimetro+" + "+meiPerimetro);
        double perimetro = meioPerimetro+meiPerimetro;
        System.out.println("Perimetro = "+(meioPerimetro+meiPerimetro));
        return perimetro;
    }

    public double area(){
        System.out.println("\nFormula area retangulo:");
        System.out.println("Area retangulo = base*lado");
        System.out.println("");
        System.out.println("Digite o lado do retangulo");
        double lado = sc.nextDouble();
        System.out.println("Digite a base do retangulo");
        double base = sc.nextDouble();
        System.out.println("Area = "+base+"*"+lado);
        double area = base*lado;
        System.out.println("Area = "+area);
        return area;

    }
    public double diagonal(){
        System.out.println("\nFormula diagonal retangulo: ");
        System.out.println("Diagonal retangulo = √b^2+l^2");
        System.out.println("");
        System.out.println("Digite o lado do retangulo");
        double lado = sc.nextDouble();
        System.out.println("Digite a base do retangulo");
        double base = sc.nextDouble();
        System.out.println("Diagonal = "+"√"+base+"^2"+"+"+lado+"^2");
        System.out.println("Diagonal = "+"√"+Math.pow(base,2)+"+"+Math.pow(lado,2));
        double diagonal = Math.sqrt(Math.pow(base,2)+Math.pow(lado,2));
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
