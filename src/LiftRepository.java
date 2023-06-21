import java.util.HashMap;
import java.util.List;

public class LiftRepository {

    HashMap<Integer, Lift> liftDb = new HashMap<>();

    public String addLift(Lift lift){

        if(liftDb.containsKey(lift.getLiftNo())){
            return "LIFT ALREADY EXISTS";
        }

        liftDb.put(lift.getLiftNo(), lift);
        return "SUCCESS";
    }

    //Find the maximum number of people with weight X that can travel in a given lift M

    public int maxNoOfPeopleWeightX(Lift lift, int x){

        return lift.getCapacityWeight()/x;


    }

    //Find the number of people with a weight greater than 50 in a given lift M

    public int peopleGreaterThan50(Lift lift){

        List<Passengers> passengersList = lift.getPassengers();
        int count = 0;

        for(Passengers passengers: passengersList){
            if(passengers.getWeight() > 50){
                count++;
            }
        }

        return count;
    }
}
