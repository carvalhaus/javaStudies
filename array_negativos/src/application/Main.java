package application;/*
* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
* */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vect = new int[n];

        if(n <= 10){
            for (int i = 0; i < vect.length; i++) {
                System.out.print("Digite um numero: ");
                vect[i] = sc.nextInt();
            }

            System.out.println("NÚMEROS NEGATIVOS: ");

            for (int i = 0; i < vect.length; i++) {
                if(vect[i] < 0){
                    System.out.println(vect[i]);
                }
            }
        } else {
            System.out.println("Insira um número menor do que 10");
        }


        sc.close();
    }
}