package Rent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rooms will be rented? ");
        int a = sc.nextInt();
        sc.nextLine();
        Rent[] aluguel = new Rent[10];
        for (int i = 0; i < a; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();
            aluguel[room]= new Rent(name,email,room);
            System.out.println(" ");
            sc.nextLine();
        }
        for(int i=0;i<10;i++) {
            if(aluguel[i]!=null)
            System.out.println(aluguel[i]);
        }
    }
}