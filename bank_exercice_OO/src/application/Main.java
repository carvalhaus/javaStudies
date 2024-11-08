package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char hasDeposit = sc.next().charAt(0);

        if (hasDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();
            account = new BankAccount(accountNumber, holder, amount);
        } else {
            account = new BankAccount(accountNumber, holder);
        }

        System.out.println("Account data:");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        account.depositAmount(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        account.withdrawAmount(sc.nextDouble());

        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}