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
            System.out.printf("%nEmplyoee #%d: %n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            while (hasId(employees, id)) {
                System.out.print("Id already exists! Enter another Id: ");
                id = sc.nextInt();
                sc.nextLine();
            }

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee employeeFound = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);

        if (employeeFound == null) {
            System.out.println("This Id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double increasePercentage = sc.nextDouble();

            employeeFound.increaseSalary(increasePercentage);
        }

        System.out.println();

        System.out.println("List of employees: ");

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}