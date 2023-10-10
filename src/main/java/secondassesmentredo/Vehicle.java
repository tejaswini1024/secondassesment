package secondassesmentredo;
public abstract class Vehicle extends Product {
   private Engine engine;
    private int speed;
    private double price;
    private final float tax_amt = 0.10f;

    public float getTax_amt() {
        return tax_amt;
    }

    public Vehicle(String name, int speed, double price, Engine engine) {
        super(name);
        this.speed = speed;
        this.price = price;
        this.engine = engine;
    }


    public abstract void printVehicleType(Vehicle vehicle);
    //System.out.println("Vehicle Type: " + this.getClass().getSimpleName());


    public abstract float getPriceAfterDiscount(Vehicle vehicle);
    // return price - (price * discount);


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


