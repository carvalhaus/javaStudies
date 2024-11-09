package application;

/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Person[] persons = new Person[n];

        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            System.out.print("Altura: ");
            double height = sc.nextDouble();

            persons[i] = new Person(name, age, height);
        }

        double sumHeight = 0.0;
        int sumAge = 0;

        for (int i = 0; i < persons.length; i++) {
            sumHeight += persons[i].getHeight();

            if(persons[i].getAge() < 16){
                sumAge++;
            }
        }

        double avgHeight = sumHeight / persons.length;

        System.out.printf("Altura media: %.2f%n", avgHeight);

        double percentageLowerThan16 = ((double) sumAge / persons.length) * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentageLowerThan16);

        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getAge() < 16){
                System.out.println(persons[i].getName());
            }
        }

        sc.close();
    }
}