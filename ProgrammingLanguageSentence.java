/*
Include the following elements into the LinkedHashMap called programminglanguages and print as follows. 
Java was developed in 1995 
Python was developed in 1991. 
JavaScript was developed in 1995 
C++ was developed in 1985 
*/

package map11;
import java.util.*;

public class ProgrammingLanguageSentence {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> programminglanguages = new LinkedHashMap<>();

        // Adding elements
        programminglanguages.put("Java", 1995);
        programminglanguages.put("Python", 1991);
        programminglanguages.put("JavaScript", 1995);
        programminglanguages.put("C++", 1985);

        // Printing in required format
        for (Map.Entry<String, Integer> entry : programminglanguages.entrySet()) {
            System.out.println(entry.getKey() + " was developed in " + entry.getValue());
        }
    }
}