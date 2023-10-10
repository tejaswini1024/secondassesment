package secondassesmentredo;

import java.util.HashMap;
import java.util.Map;

// Passenger Class
public class Passenger {
    private Map<Integer, String> info;

    public Passenger() {
        this.info = new HashMap<>();
    }

    public void addPassengerInfo(int passengerId, String passengerName) {
        info.put(passengerId, passengerName);
    }

    public Map<Integer, String> getInfo() {
        return info;
    }
}