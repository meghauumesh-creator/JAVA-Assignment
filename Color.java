/*
 Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not 
( Hint : Use ArrayListObj.contains() )
*/
package list1;
import java.util.ArrayList;

public class Color {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to ArrayList
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        // Check if "Red" is present using contains()
        if (colors.contains("Red")) {
            System.out.println("Red is available in the list.");
        } else {
            System.out.println("Red is not available in the list.");
        }
    }
}