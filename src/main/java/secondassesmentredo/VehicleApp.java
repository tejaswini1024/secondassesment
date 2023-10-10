package secondassesmentredo;

import java.util.List;
import java.util.Map;

public class VehicleApp {
    public void printListOfVehicleNames(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName());
        }
    }

    public void printListofFlyableObjects(List<Flyable> flyables) {
        for (Flyable flyable : flyables) {
            System.out.println(flyable);

        }
    }

    public void sortAndPrintDriveableVehiclesBySpeed(List<Driveable> driveables) {
        // Implement sorting logic here
        // Print the sorted list of driveable vehicles by speed
    }

    public void printPassengerNumbersOnly(Map<Integer, String> passengerInfo) {
        // Implement logic to print passenger numbers only
    }

    @Override
    public String toString() {
        return "VehicleApp{}";
    }
}
