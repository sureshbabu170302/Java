package com.yourcompany.taxibooking;

import java.util.ArrayList;
import java.util.List;

public class TaxiBookingSystem {
    private List<Taxi> taxis;

    public TaxiBookingSystem() {
        taxis = new ArrayList<>();
        taxis.add(new Taxi(1, "John"));
        taxis.add(new Taxi(2, "Emma"));
        taxis.add(new Taxi(3, "Mike"));
        taxis.add(new Taxi(4, "Sophia"));
    }

    public void bookTaxi(String customerName, Point pickupLocation, Point dropLocation) {
        // Find the first available taxi
        Taxi availableTaxi = findAvailableTaxi();
        if (availableTaxi != null) {
            System.out.println("Booking successful!");
            System.out.println("Assigned Taxi - Driver Name: " + availableTaxi.getDriverName());
            System.out.println("Pickup Location: " + pickupLocation.getName());
            System.out.println("Drop-off Location: " + dropLocation.getName());

            // Calculate distance between pickup and drop locations
            int distance = pickupLocation.calculateDistance(dropLocation);
            System.out.println("Distance: " + distance + " km");

            // Update taxi's current location to drop-off location
            availableTaxi.setCurrentLocation(dropLocation);
            availableTaxi.setAvailable(false); // Taxi is no longer available
        } else {
            System.out.println("Sorry, no taxis are currently available.");
        }
    }

    public void viewTaxiDetails() {
        System.out.println("Details of all taxis:");
        for (Taxi taxi : taxis) {
            System.out.println("Taxi ID: " + taxi.getId());
            System.out.println("Driver Name: " + taxi.getDriverName());
            System.out.println("Available: " + (taxi.isAvailable() ? "Yes" : "No"));
            System.out.println("Current Location: " + taxi.getCurrentLocation().getName());
            System.out.println(); // Print a blank line for readability
        }
    }

    private Taxi findAvailableTaxi() {
        for (Taxi taxi : taxis) {
            if (taxi.isAvailable()) {
                return taxi;
            }
        }
        return null;
    }
}
