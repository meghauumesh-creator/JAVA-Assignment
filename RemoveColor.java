
/*
 Write a java program for getting different colors through ArrayList interface and remove the 2nd element and color "Blue" from the ArrayList (using remove by index and remove by object)
*/
 package list2;
import java.util.ArrayList;

public class RemoveColor {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove element "Blue" using object
        colors.remove("Blue");

        // Display updated list
        System.out.println("Updated List: " + colors);
    }
}