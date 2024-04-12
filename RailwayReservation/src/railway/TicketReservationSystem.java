package railway;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketReservationSystem {
    private static final int TOTAL_CONFIRMED_TICKETS = 63;
    private static final int TOTAL_RAC_TICKETS = 18;
    private static final int TOTAL_WAITING_LIST_TICKETS = 10;

    private List<Passenger> bookedPassengers = new ArrayList<>();
    private List<Passenger> racPassengers = new ArrayList<>();
    private List<Passenger> waitingListPassengers = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    // Method to book a ticket interactively
    public void bookTicketInteractive() {
        System.out.println("Enter passenger details for booking:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Gender (M/F): ");
        char gender = scanner.nextLine().charAt(0);
        System.out.print("Berth Preference (Upper/Middle/Lower/Side): ");
        String berthPreference = scanner.nextLine();

        // Check if preferred berth type is available
        if (!isPreferredBerthAvailable(berthPreference)) {
            System.out.println("Preferred berth type is not available.");
            return;
        }

        Passenger passenger = new Passenger(name, age, gender, berthPreference);
        bookTicket(passenger);
    }

    // Method to book a ticket based on passenger details
    private void bookTicket(Passenger passenger) {
        if (waitingListPassengers.size() >= TOTAL_WAITING_LIST_TICKETS) {
            System.out.println("No tickets available.");
            return;
        }

        if (passenger.getAge() < 5) {
            // Do not allocate tickets for children below age 5 but store details
            waitingListPassengers.add(passenger);
            System.out.println("Ticket added to waiting list.");
            return;
        }

        if (passenger.getAge() > 60 || passenger.getGender() == 'F') {
            // Allocate lower berth for senior citizens and ladies
            if (bookedPassengers.size() < TOTAL_CONFIRMED_TICKETS) {
                passenger.setBerthType("Lower");
                bookedPassengers.add(passenger);
                System.out.println("Ticket booked successfully.");
            } else if (racPassengers.size() < TOTAL_RAC_TICKETS) {
                passenger.setBerthType("RAC");
                racPassengers.add(passenger);
                System.out.println("Ticket booked in RAC.");
            } else {
                waitingListPassengers.add(passenger);
                System.out.println("Ticket added to waiting list.");
            }
        } else {
            // Allocate berth based on availability and preference
            if (bookedPassengers.size() < TOTAL_CONFIRMED_TICKETS) {
                passenger.setBerthType(assignBerthType(passenger.getBerthPreference()));
                bookedPassengers.add(passenger);
                System.out.println("Ticket booked successfully.");
            } else if (racPassengers.size() < TOTAL_RAC_TICKETS) {
                passenger.setBerthType("RAC");
                racPassengers.add(passenger);
                System.out.println("Ticket booked in RAC.");
            } else {
                waitingListPassengers.add(passenger);
                System.out.println("Ticket added to waiting list.");
            }
        }
        // Inside bookTicket() method in TicketReservationSystem class
        passenger.setBerthType(assignBerthType(passenger.getBerthPreference()));
        bookedPassengers.add(passenger);
        System.out.println("Ticket booked successfully with berth type: " + passenger.getBerthType());

    }

    // Method to assign berth type based on preference
    private String assignBerthType(String preference) {
        switch (preference.toLowerCase()) {
            case "upper":
                return "Upper";
            case "middle":
                return "Middle";
            case "lower":
                return "Lower";
            case "side":
                return "Side";
            default:
                return "Unspecified";
        }
    }

    // Method to check if preferred berth type is available
    private boolean isPreferredBerthAvailable(String berthPreference) {
        int availableBerths = getTotalAvailableBerths();

        switch (berthPreference.toLowerCase()) {
            case "upper":
                return availableBerths >= 1; // At least 1 upper berth available
            case "middle":
                return availableBerths >= 1; // At least 1 middle berth available
            case "lower":
                return availableBerths >= 1; // At least 1 lower berth available
            case "side":
                return availableBerths >= 1; // At least 1 side berth available
            default:
                return false; // Invalid preference
        }
    }

    // Method to calculate total available berths
    private int getTotalAvailableBerths() {
        int totalBooked = bookedPassengers.size();
        int totalRac = racPassengers.size();
        int totalWaitingList = waitingListPassengers.size();

        return TOTAL_CONFIRMED_TICKETS + TOTAL_RAC_TICKETS + TOTAL_WAITING_LIST_TICKETS
                - totalBooked - totalRac - totalWaitingList;
    }

    // Method to cancel a ticket interactively
    public void cancelTicketInteractive() {
        System.out.println("Enter passenger details for cancellation:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        Passenger passengerToRemove = null;
        for (Passenger passenger : bookedPassengers) {
            if (passenger.getName().equalsIgnoreCase(name)) {
                passengerToRemove = passenger;
                break;
            }
        }

        if (passengerToRemove != null) {
            cancelTicket(passengerToRemove);
            System.out.println("Ticket cancelled successfully.");
        } else {
            System.out.println("Passenger not found in booked tickets.");
        }
    }

    // Method to cancel a ticket
    private void cancelTicket(Passenger passenger) {
        if (bookedPassengers.remove(passenger)) {
            // Move a ticket from RAC to confirmed
            if (!racPassengers.isEmpty()) {
                bookedPassengers.add(racPassengers.remove(0));
            }
            // Move a waiting-list ticket to RAC
            if (!waitingListPassengers.isEmpty()) {
                racPassengers.add(waitingListPassengers.remove(0));
            }
        }
    }

    // Method to print booked tickets
    public void printBookedTickets() {
        System.out.println("Booked Tickets:");
        for (Passenger passenger : bookedPassengers) {
            System.out.println(passenger);
        }
        System.out.println("Total Booked Tickets: " + bookedPassengers.size());
    }

    // Method to print available tickets
    public void printAvailableTickets() {
        int availableTickets = getTotalAvailableBerths();
        System.out.println("Available Tickets: " + availableTickets);
    }

    // Method to print total available berths
    public void printTotalAvailableBerths() {
        int availableBerths = getTotalAvailableBerths();
        System.out.println("Total Available Berths: " + availableBerths);
    }

    // Main method for console interaction
    public static void main(String[] args) {
        TicketReservationSystem reservationSystem = new TicketReservationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nRailway Ticket Reservation System");
            System.out.println("1. Book a Ticket");
            System.out.println("2. Cancel a Ticket");
            System.out.println("3. Print Booked Tickets");
            System.out.println("4. Print Available Tickets");
            System.out.println("5. Print Total Available Berths");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    reservationSystem.bookTicketInteractive();
                    break;
                case 2:
                    reservationSystem.cancelTicketInteractive();
                    break;
                case 3:
                    reservationSystem.printBookedTickets();
                    break;
                case 4:
                    reservationSystem.printAvailableTickets();
                    break;
                case 5:
                    reservationSystem.printTotalAvailableBerths();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
