package TaxiBooking;

public class Point {
    private String name;

    public Point(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int calculateDistance(Point otherPoint)
    {
        int distance = Math.abs(getPointIndex(this.name) - getPointIndex(otherPoint.getName())) * 15;
        return distance;
    }

    public int getPointIndex(String pointName){
        switch (pointName) {
            case "A":
                return 0; // Distance from A to A is always 0
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;   
            default:
                throw  new IllegalArgumentException("Invalid destination point");
        }
    }
}
