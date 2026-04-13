/*
 Remove the following all elements from the HashMap then verify that its size is zero and  include once again following elements and check its size 
(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”) [ Hint : clear() , size() and put()] 
 */

package map2;
import java.util.*;
public class ClearAndAddHashmap {
	
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        System.out.println("Initial Map: " + map);

        // Clearing all elements
        map.clear();

        // Check size
        System.out.println("After clearing, size: " + map.size());

        // Adding again
        map.put(1, "Banana");
        map.put(2, "Orange");
        map.put(3, "Guava");
        map.put(4, "Pomegranate");
        map.put(5, "Amla");

        // Check size again
        System.out.println("After adding again, size: " + map.size());
    }
}