package LAB3;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {

    JFrame frame;
    JButton b1, b2, b3, b4, b5;

    BorderLayoutExample() {
        frame = new JFrame();

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");

        frame.setLayout(new BorderLayout(7, 10));

        frame.add(b1, BorderLayout.EAST);
        frame.add(b2, BorderLayout.WEST);
        frame.add(b3, BorderLayout.NORTH);
        frame.add(b4, BorderLayout.SOUTH);
        frame.add(b5, BorderLayout.CENTER);

        frame.setBounds(433, 125, 450, 375);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
