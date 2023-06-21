public class Passengers {

    private int passengerId; //primary key

    private int weight;

    private  Lift lift;

    public Passengers(int passengerId, int weight, Lift lift) {
        this.passengerId = passengerId;
        this.weight = weight;
        this.lift = lift;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLift(Lift lift) {
        this.lift = lift;
    }
}
