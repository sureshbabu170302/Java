package TaxiBooking;

import java.util.ArrayList;
import java.util.List;

public class TaxiBookingSystem {
    List <Taxi> taxis;

    public TaxiBookingSystem(){
        taxis = new ArrayList<>();
        taxis.add(new Taxi(1,"Suresh"));
        taxis.add(new Taxi(2,"Muthu"));
        taxis.add(new Taxi(3,"Sasi"));
        taxis.add(new Taxi(4,"Madhavan"));
    }

    public void BookTaxi(String customerName, String pickupLocation, String  dropOffLocation){
        Taxi availableTaxi = findAvailableTaxi();
        if (availableTaxi != null) {
            System.out.println("Booking Successful!");
        }     
    }

    private Taxi findAvailableTaxi(){
        for(Taxi taxi : taxis){
            if(taxi.getAvailable() == true) return taxi;
        }
        return null;
    }
}
