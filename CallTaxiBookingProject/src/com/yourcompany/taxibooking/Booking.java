package com.yourcompany.taxibooking;

public class Booking {
    private String customerName;
    private Point pickupLocation;
    private Point dropLocation;

    public Booking(String customerName, Point pickupLocation, Point dropLocation) {
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Point getPickupLocation() {
        return pickupLocation;
    }

    public Point getDropLocation() {
        return dropLocation;
    }
}
