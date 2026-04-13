/*
 Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass  is pressed” depending upon the Jbutton with image  either  Digital Clock or  Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).

 */

package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame implements ActionListener {

    JButton btnClock, btnHourGlass;
    JLabel label, imageLabel;
    ImageIcon clockIcon, hourGlassIcon;

    public ImageButtonDemo() {

        setTitle("Image Button Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images
        clockIcon = new ImageIcon("clock.jpeg");
        hourGlassIcon = new ImageIcon("hourglass.png");

        // Main panel with vertical layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        btnClock = new JButton("Digital Clock");
        btnHourGlass = new JButton("Hour Glass");

        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        buttonPanel.add(btnClock);
        buttonPanel.add(btnHourGlass);

        // Image label
        imageLabel = new JLabel();
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Message label
        label = new JLabel("Press any button");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add components with spacing
        panel.add(Box.createVerticalGlue());
        panel.add(buttonPanel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(imageLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(label);
        panel.add(Box.createVerticalGlue());

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClock) {
            imageLabel.setIcon(clockIcon);
            label.setText("Digital Clock is pressed");
        } 
        else if (e.getSource() == btnHourGlass) {
            imageLabel.setIcon(hourGlassIcon);
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}