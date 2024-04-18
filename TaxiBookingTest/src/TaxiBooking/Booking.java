package TaxiBooking;

public class Booking {
    private String customerName;
    private String pickUpLocation;
    private String dropOffLocation;

    public Booking(String customerName, String pickUpLocation, String  dropOffLocation) {
        this.customerName = customerName;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
    }
    
    public String getCustomerName() { 
        return customerName;
    }

    public String getPickUpLocation() {  
        return  pickUpLocation;
    }

    public String getDropOffLocation(){
        return  dropOffLocation;
    }
}
