/*
Write a Java program to iterate through all elements in a linked list starting at the specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))
*/
package list6;
import java.util.LinkedList;
import java.util.Iterator;

public class IterateFromSecond {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");

        // Start iteration from index 1 (2nd element)
        Iterator<String> it = list.listIterator(1);

        // Traverse and print elements
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}