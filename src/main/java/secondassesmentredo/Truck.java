package secondassesmentredo;

public  class Truck extends Vehicle implements Driveable {
    public Truck(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }
    public void printSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getSpeed());
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        System.out.println("car");

    }

    @Override
    public float getPriceAfterDiscount(Vehicle vehicle) {

        return  (float)((1+(double)(vehicle.getTax_amt()))* vehicle.getPrice());
    }
}