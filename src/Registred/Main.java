package Registred;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Registred> employee = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Registred emp = new Registred(id, name, salary);
            employee.add(emp);


        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = position(employee, idsalary);
        if (pos == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage:");
            double percent = sc.nextDouble();
            employee.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Registred emp : employee) {
            System.out.println(emp);
        }

    }

    public static Integer position(List<Registred> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
