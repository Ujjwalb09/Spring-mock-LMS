import java.util.HashMap;

public class PassengerRepository {

    HashMap<Integer, Passengers> passengerDb = new HashMap<>();

    public String addPassenger(Passengers passengers){

        if(passengerDb.containsKey(passengers.getPassengerId())){
            return "PASSENGER ALREADY EXISTS";
        }

        passengerDb.put(passengers.getPassengerId(), passengers);
        return "SUCCESS";
    }

    public String deletePassengers(){ //del passenger with id less than 5

        for(Passengers passengers : passengerDb.values()){

            if(passengers.getPassengerId() < 5){
                passengerDb.remove(passengers.getPassengerId());
            }
        }

        return "SUCCESS";
    }
}
