package application;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Room[] rooms = new Room[10];

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int roomsToRent = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < roomsToRent; i++) {
            System.out.printf("Rent #%d: %n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            rooms[roomNumber] = new Room(name, email);

            System.out.println();
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {

            if(rooms[i] != null){
                System.out.printf("%d: %s%n", i, rooms[i]);
            }
        }

        sc.close();
    }
}