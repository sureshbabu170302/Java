package com.yourcompany.taxibooking;

public class Taxi {
    private int id;
    private String driverName;
    private boolean available;
    private Point currentLocation;

    public Taxi(int id, String driverName) {
        this.id = id;
        this.driverName = driverName;
        this.available = true;
        this.currentLocation = new Point("A"); // Initially stationed at point A
    }

    public int getId() {
        return id;
    }

    public String getDriverName() {
        return driverName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }
}
