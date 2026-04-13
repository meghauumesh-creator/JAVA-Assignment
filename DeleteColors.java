/*  
 Write a java program for getting different colors through ArrayList interface and delete nth  element from the ArrayList object  by  using remove by index
 */
package list5;
 
import java.util.ArrayList;

public class DeleteColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Define index (nth position)
        int n = 2;  // Removes 3rd element

        // Remove element using index
        colors.remove(n);

        // Display updated list
        System.out.println("After Deletion: " + colors);
    }
}