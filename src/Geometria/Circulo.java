package Geometria;

import java.util.Scanner;

public class Circulo {
    private static double PI = 3.14;
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    public double circunferencia(){
        System.out.println("Formula circunferencia circulo:");
        System.out.println("Circunferencia circulo = 2*π*r");
        System.out.println("");
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        System.out.println("Circunferencia = "+2+"*"+PI+"*"+raio);
        System.out.println("Circunferencia = "+2+"*"+PI*raio);
        System.out.println("Circunferencia = "+2*PI*raio);
        raio = 2*PI*raio;
        return raio;
    }

    public double area(){
        System.out.println("Formula area circulo:");
        System.out.println("Area circulo = π*r^2");
        System.out.println("");
        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();
        System.out.println("Area = "+PI+"*"+raio+"^2");
        System.out.println("Area = "+PI+"*"+Math.pow(raio,2));
        System.out.println("Area = "+PI*Math.pow(raio,2));
        raio = PI*Math.pow(raio,2);
        return raio;

    }

    public void menu(){
        int opcao = 0;
        while(opcao!=3) {
            System.out.println("|------------------------|");
            System.out.println("|       Menu             |");
            System.out.println("|------------------------|");
            System.out.println("| 01:Perimetro           |");
            System.out.println("| 02:Area                |");
            System.out.println("| 03:Sair                |");
            System.out.println("| 04:Menu Pricipal       |");
            System.out.println("|------------------------|");
            System.out.println("Opçao escolhida: ");

            opcao = sc.nextInt();
            if (opcao == 1) {
                circunferencia();
            } else if (opcao == 2) {
                area();
            }else if (opcao == 4) {
                menu.menu();
            }
        }
    }
}

