/*
Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )
 */

package list9;
import java.util.LinkedList;

public class DisplayPositions {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");

        // Display elements with index positions
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }
    }
}