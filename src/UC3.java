import java.util.HashSet;
import java.util.Set;

public class UC3 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("====================================");

        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // -------- ADD IDs (including duplicates) --------
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");

        // Adding duplicates (will be ignored automatically)
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // -------- DISPLAY UNIQUE IDs --------
        System.out.println("\nBogie IDs after adding (duplicates removed automatically):");
        System.out.println(bogieIDs);

        // -------- CHECK SIZE --------
        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}