import java.util.ArrayList;
import java.util.List;

public class Lift {

    private int liftNo; //primary key

   private int capacityWeight;

    private int capacityInPerson;

    private List<Passengers> passengers;

    public Lift(int liftNo, int capacityWeight, int capacityInPerson, List<Passengers> passengers) {
        this.liftNo = liftNo;
        this.capacityWeight = capacityWeight;
        this.capacityInPerson = capacityInPerson;
        this.passengers = passengers;
    }

    public int getLiftNo() {
        return liftNo;
    }

    public void setLiftNo(int liftNo) {
        this.liftNo = liftNo;
    }

    public int getCapacityWeight() {
        return capacityWeight;
    }

    public void setCapacityWeight(int capacityWeight) {
        this.capacityWeight = capacityWeight;
    }

    public int getCapacityInPerson() {
        return capacityInPerson;
    }

    public void setCapacityInPerson(int capacityInPerson) {
        this.capacityInPerson = capacityInPerson;
    }

    public List<Passengers> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passengers> passengers) {
        this.passengers = passengers;
    }
}
