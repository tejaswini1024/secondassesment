package secondassesmentredo;


public class FlyingCar extends Vehicle implements  Flyable {
    public FlyingCar(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }
    public boolean transportPassengers() {
        return true;
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        System.out.println("flyingcar");

    }

    @Override
    public float getPriceAfterDiscount(Vehicle vehicle) {

        return  (float)((1+(double)(vehicle.getTax_amt()))* vehicle.getPrice());
    }
    @Override
    public String toString() {
        return "Flyingcar{" +
                "speed='" + getSpeed() + '\'' +
                "engine='" + getEngine()+ '\'' +
                "taxamount='" + getTax_amt()+ '\'' +
                '}';
    }
}

