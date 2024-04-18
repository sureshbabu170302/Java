package TaxiBooking;

public class Taxi {
    private int Id;
    private String driverName;
    private boolean available;
    private Point currentLocation;

    public Taxi(int id,String driverName){
        this.Id =id;
        this.driverName=driverName;
        this.available=true;
        this.currentLocation = new Point("A");
    }

    public int getId() { 
        return Id;
    }

    public String  getDriverName(){
        return driverName;
    }

    public boolean  getAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available=available;
    }

    public Point getCurrentLocation(){
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }
}
