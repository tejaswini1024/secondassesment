package secondassesmentredo;

public class Car extends Vehicle implements Driveable {

    private int NumOfDoors;
    private final float extratax = .05f;


    public Car(String name, int speed, double price, Engine engine, int numOfDoors) {
        super(name, speed, price, engine);
       this.NumOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return NumOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        NumOfDoors = numOfDoors;
    }

    public void printNumofDoors() {
        System.out.println(NumOfDoors);

    }

    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getSpeed());
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        System.out.println("car");

    }

    @Override
    public float getPriceAfterDiscount(Vehicle vehicle) {

        return  (float)((1+(double)(vehicle.getTax_amt())+(double)(extratax))* vehicle.getPrice());
    }
}




