/*
Add elements in the same order in the LinkedHaspMap using for() loop and put()  String[] keys = {"C", "A", "B", "E", "D"}; 
Integer[] values = {3, 1, 2, 5, 4};
*/

package map12;
 
import java.util.*;

public class LinkedHashMapUsingLoop {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        String[] keys = {"C", "A", "B", "E", "D"};
        Integer[] values = {3, 1, 2, 5, 4};

        // Adding elements using for loop
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }

        // Printing map
        System.out.println("LinkedHashMap contents:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}