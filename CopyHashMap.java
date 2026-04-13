/* 
 .Write a Java program to copy all mappings from the specified map to another map as shown below Hashmap1 => ( 1, "Red") ,(2, "Green"), (3, "Black") 
Hashmap2 => (4, "White"),(5, "Blue"),(6, "Orange")  
Add all the values of Hashmap1 intoLiberation Serif Hashmap2 and print the result 
 */

package map3;
import java.util.*;

public class CopyHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");

        // Copy all elements from map1 to map2
        map2.putAll(map1);

        System.out.println("After copying map1 into map2:");
        System.out.println(map2);
    }
}