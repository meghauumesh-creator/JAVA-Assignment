/* 
 Write a Java program that swaps two elements ( first and third elements ) in a linked list  ( using Collections.swap(l_list, 0, 2)) 
 */

package list10;
import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Swap elements at index 0 and 2
        Collections.swap(list, 0, 2);

        // Display updated list
        System.out.println("After Swapping: " + list);
    }
}