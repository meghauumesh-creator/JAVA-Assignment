/*
 Write a Java program to traverse / iterate all the keys with the specified value in a linked  HashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) and display  only elderly entered 4 elements only 
[ hint : Refer to 5. LinkedHashMap Demonstration of worked out example]
 */

package map9;
import java.util.*;

public class IterateLinkedHashMap {
    public static void main(String[] args) {

        // LinkedHashMap maintains insertion order
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        System.out.println("First 4 inserted elements:");

        int count = 0;

        // Iterating using entrySet()
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (count < 4) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                count++;
            } else {
                break;
            }
        }
    }
}