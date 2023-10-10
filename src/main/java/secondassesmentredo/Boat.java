package secondassesmentredo ;

public  class Boat extends Vehicle implements Driveable {


    private boolean hasgps ;

    public Boat(String name, int speed, double price, Engine engine, boolean hasgps) {
        super(name, speed, price, engine);
        this.hasgps= hasgps;
    }
   public void printgpsinfo(){
        System.out.println("the boat has gps: " + hasgps);
   }
    @Override
    public void printSpeed(Vehicle vehicle) {
        System.out.println(vehicle.getSpeed());
    }

    @Override
    public void printVehicleType(Vehicle vehicle) {
        System.out.println("boat");

    }

    @Override
    public float getPriceAfterDiscount(Vehicle vehicle) {

        return  (float)((1+(double)(vehicle.getTax_amt()))* vehicle.getPrice());
    }




}