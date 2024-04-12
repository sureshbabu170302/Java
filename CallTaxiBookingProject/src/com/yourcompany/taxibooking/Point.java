package com.yourcompany.taxibooking;

public class Point {
    private String name;

    public Point(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int calculateDistance(Point otherPoint) {
        // Calculate distance based on the predefined rule (each point is 15 km apart)
        int distance = Math.abs(getPointIndex(this.name) - getPointIndex(otherPoint.getName())) * 15;
        return distance;
    }

    private int getPointIndex(String pointName) {
        // Assign indices to points (A=0, B=1, C=2, D=3, E=4, F=5)
        switch (pointName) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            default:
                throw new IllegalArgumentException("Invalid point name");
        }
    }
}
