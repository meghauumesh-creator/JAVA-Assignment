/*
 Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator())
 */

package list7;
import java.util.LinkedList;
import java.util.Iterator;

public class ReverseIterate {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Use descendingIterator for reverse traversal
        Iterator<String> it = list.descendingIterator();

        // Print elements in reverse order
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}