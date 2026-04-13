/* 
  Write a java program for getting different colors through ArrayList interface and extract the elements 1st and 2nd from the ArrayList object  by  using SubList() 
 */

package list4;
import java.util.ArrayList;
import java.util.List;

public class ExtractColors {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        // Extract elements from index 0 to 1 (1st and 2nd elements)
        List<String> subList = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted Elements: " + subList);
    }
}