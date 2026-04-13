/*
Write a Java program to check whether a map contains Key-Values mappings (empty) or not after adding all the following elements into Hashmap and after removing all the elements from the Hashmap.  
 (1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue") 
 */

package map4;
import java.util.*;

public class CheckEmptyHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        // Check if empty
        System.out.println("Is map empty? " + map.isEmpty());

        // Remove all elements
        map.clear();

        // Check again
        System.out.println("After clearing, is map empty? " + map.isEmpty());
    }
}