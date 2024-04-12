package com.yourcompany.taxibooking;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        TaxiBookingSystem bookingSystem = new TaxiBookingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Taxi Booking System!");
            System.out.println("Choose an option:");
            System.out.println("1. Book a Taxi");
            System.out.println("2. View Taxi Details");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter your name:");
                    String customerName = scanner.nextLine();

                    System.out.println("Enter pickup location (A, B, C, D, E, F):");
                    String pickupLocationName = scanner.nextLine().toUpperCase();
                    Point pickupLocation = new Point(pickupLocationName);

                    System.out.println("Enter drop-off location (A, B, C, D, E, F):");
                    String dropLocationName = scanner.nextLine().toUpperCase();
                    Point dropLocation = new Point(dropLocationName);

                    bookingSystem.bookTaxi(customerName, pickupLocation, dropLocation);
                    break;

                case 2:
                    bookingSystem.viewTaxiDetails();
                    break;

                case 3:
                    System.out.println("Exiting Taxi Booking System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
