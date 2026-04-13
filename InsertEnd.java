/*
 Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
 */

package list8;

import java.util.LinkedList;

public class InsertEnd {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");

        // Insert element at the end using offerLast()
        list.offerLast("Pink");

        // Display updated list
        System.out.println("Updated List: " + list);
    }
}