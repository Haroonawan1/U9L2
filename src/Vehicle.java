public class Vehicle {
    private int numWheels;
    private int maxSpeed;

    public Vehicle(int numWheels, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println("The vehicle has been driven");
    }
}
