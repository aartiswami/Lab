import java.util.ArrayList;

public class ArrayListD {
    public static void main(String[] args) {
        // Create an ArrayList of fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        

        // Display the ArrayList
        System.out.println("Contents of the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // Remove an element
        fruits.remove("Banana"); // Example: Remove "Banana"
        System.out.println("\nBanana was removed.");

        // Display the updated ArrayList
        System.out.println("\nUpdated ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
