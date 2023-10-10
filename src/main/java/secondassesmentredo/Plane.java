package secondassesmentredo;

public class Plane extends Vehicle implements Flyable {


    public Plane(String name, int speed, double price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public boolean transportPassengers() {
        return true;
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        System.out.println("plane");

    }

    @Override
    public float getPriceAfterDiscount(Vehicle vehicle) {

        return  (float)((1+(double)(vehicle.getTax_amt()))* vehicle.getPrice());
    }

    @Override
    public String toString() {
        return "Plane{" +
                "speed='" + getSpeed() + '\'' +
                "engine='" + getEngine()+ '\'' +
                "taxamount='" + getTax_amt()+ '\'' +
                '}';
    }
}

