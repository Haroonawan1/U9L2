public class Truck extends Vehicle{
    private int maxLoad;

    public Truck(int numWheels, int maxSpeed, int maxLoad) {
        super(numWheels, maxSpeed);
        this.maxLoad = maxLoad;
    }

    public void unloadCargo() {
        System.out.println("Cargo has been unloaded!");
    }
}