public class Motorcycle extends Vehicle{
    private boolean streetLegal;

    public Motorcycle(int numWheels, int maxSpeed, boolean streetLegal) {
        super(numWheels, maxSpeed);
        this.streetLegal = streetLegal;
    }

    public void doAWheelie() {
        System.out.println("A wheelie was done!");
    }
}
