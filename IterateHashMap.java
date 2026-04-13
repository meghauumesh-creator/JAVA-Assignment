/*
 Write a Java program to traverse / iterate all the keys with the specified value in a HashMap  (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) 
[ hint : 6. Iterating Over Map in the worked out example]
 */

package map1;
import java.util.*;

public class IterateHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        // Iterating using entrySet
        System.out.println("Key -> Value:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}