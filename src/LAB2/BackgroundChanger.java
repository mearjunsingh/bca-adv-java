package LAB2;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class BackgroundChanger implements ActionListener {
    JFrame frame;
    JButton red, green, blue;

    BackgroundChanger() {
        frame = new JFrame("Background Changer");
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");

        frame.add(red);
        frame.add(green);
        frame.add(blue);

        frame.setBounds(433, 125, 450, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        red.setBounds(167, 100, 100, 30);
        green.setBounds(167, 150, 100, 30);
        blue.setBounds(167, 200, 100, 30);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand() == "Red") {
            frame.getContentPane().setBackground(Color.RED);
        } else if (event.getActionCommand() == "Green") {
            frame.getContentPane().setBackground(Color.GREEN);
        } else if (event.getActionCommand() == "Blue") {
            frame.getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new BackgroundChanger();
    }
}