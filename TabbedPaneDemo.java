/*
  Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan
 */

package Swings;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class TabbedPaneDemo {

    JFrame f;
    JLabel label;

    TabbedPaneDemo() {

        f = new JFrame("Tabbed Pane Example");

        // Create panels with color boxes
        JPanel p1 = createPanel(Color.CYAN);
        JPanel p2 = createPanel(Color.MAGENTA);
        JPanel p3 = createPanel(Color.YELLOW);

        // Tabbed Pane
        JTabbedPane tp = new JTabbedPane();
        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        // Label
        label = new JLabel("Select a tab", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Change listener
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {

                int index = tp.getSelectedIndex();

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
        f.setLayout(new BorderLayout());
        f.add(tp, BorderLayout.CENTER);
        f.add(label, BorderLayout.SOUTH);

        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    // Method to create panel with centered color box
    private JPanel createPanel(Color color) {

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout()); // center box

        JPanel box = new JPanel();
        box.setBackground(color);
        box.setPreferredSize(new Dimension(200, 200)); // fixed size

        box.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); // border

        panel.add(box);

        return panel;
    }

    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}