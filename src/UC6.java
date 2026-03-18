import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("====================================");

        // Create HashMap (Bogie -> Capacity)
        Map<String, Integer> capacityMap = new HashMap<>();

        // -------- INSERT DATA --------
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 24);

        // -------- DISPLAY DATA --------
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nTotal Bogie Types: " + capacityMap.size());

        System.out.println("\nUC6 operations completed successfully...");
    }
}