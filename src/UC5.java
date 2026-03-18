import java.util.LinkedHashSet;
import java.util.Set;

public class UC5 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("====================================");

        // Create LinkedHashSet (maintains order + uniqueness)
        Set<String> trainFormation = new LinkedHashSet<>();

        // -------- ADD BOGIES --------
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // -------- DISPLAY FINAL FORMATION --------
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal Bogies: " + trainFormation.size());

        System.out.println("\nUC5 operations completed successfully...");
    }
}