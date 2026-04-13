/*
  Include the following elements into the LinkedHashMap called programminglanguages and print all of them. 
("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985); 
 */

package map10;
import java.util.*;

public class ProgrammingLanguageMap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> programminglanguages = new LinkedHashMap<>();

        // Adding elements
        programminglanguages.put("Java", 1995);
        programminglanguages.put("Python", 1991);
        programminglanguages.put("JavaScript", 1995);
        programminglanguages.put("C++", 1985);

        // Printing all
        System.out.println(programminglanguages);
    }
}