package Rent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rent {
    private final int[] vetor = new int[10];
    private String name;
    private String email;
    private int room;
    Scanner sc = new Scanner(System.in);

    public Rent(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public int[] getVetor() {
        return vetor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return room+":"+
                 name + "," +
                email;
    }
}
