package com.yourcompany.taxibooking;

public class Booking {
    private String customerName;
    private Taxi taxi;
    private Point pickupLocation;
    private Point dropLocation;

    public Booking(String customerName, Taxi taxi, Point pickupLocation, Point dropLocation) {
        this.customerName = customerName;
        this.taxi = taxi;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public Point getPickupLocation() {
        return pickupLocation;
    }

    public Point getDropLocation() {
        return dropLocation;
    }
}
