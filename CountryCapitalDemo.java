/*
  Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
o/p
Capital of USA is: Washington D.C.
Capital of India is: New Delhi
Capital of Vietnam is: Hanoi
Capital of Denmark is: Copenhagen
Capital of Africa is: Addis Ababa
Capital of Japan is: Tokyo
Capital of Greenland is: Nuuk
Capital of Singapore is: Singapore
 */

package Swings;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalDemo extends JFrame {

    JList<String> countryList;
    HashMap<String, String> capitalMap;

    public CountryCapitalDemo() {

        setTitle("Country Capital Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Countries array
        String[] countries = {
            "USA", "India", "Vietnam", "Canada",
            "Denmark", "France", "Great Britain",
            "Japan", "Africa", "Greenland", "Singapore"
        };

        // JList
        countryList = new JList<>(countries);
        countryList.setFont(new Font("Arial", Font.BOLD, 14));

        // Scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Capital mapping
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // List selection event
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();

                    if (selectedCountry != null) {
                        String capital = capitalMap.get(selectedCountry);
                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
                    }
                }
            }
        });

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalDemo();
    }
}