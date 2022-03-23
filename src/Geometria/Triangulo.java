package Geometria;

import java.util.Scanner;

public class Triangulo {
    Scanner sc = new Scanner(System.in);

    public double perimetro(){
        System.out.println("Formula perimetro triangulo:");
        System.out.println("Perimetro triangulo = lado+lado+lado");
        System.out.println("");
        System.out.println("Digite o lado do triangulo: ");
        double lado = sc.nextDouble();
        System.out.println("Perimetro = "+lado+" + "+lado+"+"+lado);
        double lado2 = lado+lado;
        System.out.println("Perimetro = "+lado+"+"+lado2);
        lado = lado+lado+lado;
        System.out.println("Perimtro = "+lado);
        return lado;
    }

    public double area(){
        System.out.println("\nFormula area triangulo:");
        System.out.println("Area triangulo = base*altura/2");
        System.out.println("");
        System.out.println("Digite a base do triangulo");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do triangulo");
        double altura = sc.nextDouble();
        System.out.println("Area = "+base+"*"+altura+"/"+2);
        double bXa = base*altura;
        System.out.println("Area = "+bXa+"/"+2);
        bXa = base*altura/2;
        System.out.println("Area = "+bXa);
        return bXa;

    }
    public double altura(){
        System.out.println("\nFormula altura triangulo: ");
        System.out.println("Altura triangulo = √l^2-(b^2/4)");
        System.out.println("");
        System.out.println("Digite o lado do triangulo: ");
        double lado = sc.nextDouble();
        System.out.println("Digite a base do triangulo: ");
        double base = sc.nextDouble();
        System.out.println("Altura = "+"√"+lado+"^2"+"-("+base+"^2/4)");
        System.out.println("Altura = "+"√"+Math.pow(lado,2)+"-("+base+"^2/4)");
        System.out.println("Altura = "+"√"+Math.pow(lado,2)+"-"+Math.pow(base,2)/4);
        double altura = Math.sqrt(Math.pow(lado,2)-(Math.pow(base,2)/4));
        System.out.println("Altura = "+altura);
        System.out.println(" ");
        return altura;

    }

    public void menu(){
        int opcao = 0;
        while(opcao!=4) {
            System.out.println("|------------------------|");
            System.out.println("|       Menu             |");
            System.out.println("|------------------------|");
            System.out.println("| 01:Perimetro           |");
            System.out.println("| 02:Area                |");
            System.out.println("| 03:Altura              |");
            System.out.println("| 04:Sair                |");
            System.out.println("|------------------------|");
            System.out.println("Opçao escolhida: ");

            opcao = sc.nextInt();
            if (opcao == 1) {
                perimetro();
            } else if (opcao == 2) {
                area();
            } else if (opcao == 3) {
                altura();
            }
        }
    }
}

