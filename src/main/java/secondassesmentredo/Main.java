package secondassesmentredo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car Mustang = new Car("Mustang", 65, 25000.0, new Engine(Size.MEDIUM),4);
        Boat SeaHorse = new Boat("SeaHorse", 35, 18000.0, new Engine(Size.SMALL),true);
        Truck GM = new Truck("GM", 55, 45000.0, new Engine(Size.LARGE)) ;
        Plane plane = new Plane("Plane Model 1", 600, 1500000.0, new Engine(Size.MEDIUM));
        FlyingCar flyingCar = new FlyingCar("flyingmodel1",8000,2000000.0,new Engine(Size.LARGE));
        Drone drone = new Drone("DroneX");
        List<Vehicle> vehicles = new ArrayList<>();

        // Add all vehicles to the list
        vehicles.add(Mustang);
        vehicles.add(SeaHorse);
        vehicles.add(GM);
        vehicles.add(plane);
        vehicles.add(flyingCar);




        // Print the names of each vehicle
        VehicleApp vehicleApp = new VehicleApp();
        System.out.println("List of vehicles");
        vehicleApp.printListOfVehicleNames(vehicles);

        List<Flyable> flyableObjects = new ArrayList<>();

        // Add flyable objects to the list
        flyableObjects.add(drone);
        flyableObjects.add(plane);
        flyableObjects.add(flyingCar);


        VehicleApp vehicleApp1 = new VehicleApp();
        System.out.println("List of flyable object");
        vehicleApp1.printListofFlyableObjects(flyableObjects);

        // Create a Map to store passenger information
       Map<Integer, String> passengers = new HashMap<>();

        // Add the first passenger
        passengers.put(26, "Wini");

        // Add the second passenger
        passengers.put(3, "Zoey");

        // Print the passenger information
        for (Map.Entry<Integer, String> entry : passengers.entrySet()) {
            int passengerId = entry.getKey();
            String passengerName = entry.getValue();
            System.out.println("Passenger ID: " + passengerId );
        }
    }
}

