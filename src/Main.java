import java.util.*;

// Base class
abstract class Bogie {
    String id;

    public Bogie(String id) {
        this.id = id;
    }
}

// Passenger bogie class
class PassengerBogie extends Bogie {
    String type;
    int capacity;

    public PassengerBogie(String id, String type, int capacity) {
        super(id);
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + id + ", Type: " + type + ", Capacity: " + capacity;
    }
}

// Comparator for sorting by capacity
class CapacityComparator implements Comparator<PassengerBogie> {
    @Override
    public int compare(PassengerBogie b1, PassengerBogie b2) {
        return Integer.compare(b2.getCapacity(), b1.getCapacity()); // Descending
    }
}

// Main class for UC7
public class UC7 {
    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        // Sample data
        bogies.add(new PassengerBogie("B1", "Sleeper", 72));
        bogies.add(new PassengerBogie("B2", "AC Chair", 56));
        bogies.add(new PassengerBogie("B3", "First Class", 24));
        bogies.add(new PassengerBogie("B4", "Sleeper", 80));

        System.out.println("Before Sorting:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        // Sorting using Comparator
        Collections.sort(bogies, new CapacityComparator());

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}
