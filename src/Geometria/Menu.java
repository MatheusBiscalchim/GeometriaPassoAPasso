package Geometria;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public void menu(){
    int opcao = 0;
    while(opcao!=5)
    {
        System.out.println("|------------------------|");
        System.out.println("|       Menu             |");
        System.out.println("|------------------------|");
        System.out.println("| 01:Circulo             |");
        System.out.println("| 02:Quadrado            |");
        System.out.println("| 03:Retangulo           |");
        System.out.println("| 04:Triangulo           |");
        System.out.println("| 05:Sair                |");
        System.out.println("|------------------------|");
        System.out.println("Opçao escolhida: ");

        opcao = sc.nextInt();
        if (opcao == 1) {
            Circulo circulo = new Circulo();
            circulo.menu();
        } else if (opcao == 2) {
            Quadrado quadrado = new Quadrado();
            quadrado.menu();
        } else if (opcao == 3) {
            Retangulo retangulo = new Retangulo();
            retangulo.menu();
        }else if(opcao == 4){
            Triangulo triangulo = new Triangulo();
            triangulo.menu();
        }
    }
    }
}
