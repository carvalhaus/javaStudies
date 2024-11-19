package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Emplyoee #%d: %n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.println();

        System.out.println("List of employees: ");

        for (Employee employee : employees){
            System.out.println(employee);
        }

        sc.close();
    }
}