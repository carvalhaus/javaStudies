package application;

/*
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*  */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
            System.out.printf("%.2f ", vect[i]);
        }

        System.out.printf("%nSOMA = %.2f%n", sum);

        System.out.printf("MEDIA = %.2f", sum / vect.length);

        sc.close();
    }
}