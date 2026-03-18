import java.util.LinkedList;
import java.util.List;

public class UC4 {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================");

        // Create LinkedList to maintain order
        List<String> trainConsist = new LinkedList<>();

        // -------- ADD BOGIES --------
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // -------- INSERT AT POSITION --------
        trainConsist.add(2, "Pantry Car"); // Insert at index 2

        System.out.println("\nAfter Adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // -------- REMOVE FIRST & LAST --------
        trainConsist.remove(0); // remove first
        trainConsist.remove(trainConsist.size() - 1); // remove last

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        // -------- FINAL STATE --------
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 operations completed successfully...");
    }
}