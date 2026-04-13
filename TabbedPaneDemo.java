/*
Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan
 */

package Swings;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class TabbedPaneDemo extends JFrame {

    JTabbedPane tabbedPane;
    JLabel label;

    public TabbedPaneDemo() {

        setTitle("Tabbed Pane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tabbed Pane
        tabbedPane = new JTabbedPane();

        // Panels for each tab
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Label to display selected color
        label = new JLabel("Select a tab");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Add change listener
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tabbedPane.getSelectedIndex();

                if (index == 0) {
                    label.setText("Cyan color selected");
                } else if (index == 1) {
                    label.setText("Magenta color selected");
                } else if (index == 2) {
                    label.setText("Yellow color selected");
                }
            }
        });

        // Layout
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.CENTER);
        add(label, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}