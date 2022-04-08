package LAB3;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {

    JFrame frame;
    JButton b1, b2, b3, b4, b5;

    FlowLayoutExample() {
        frame = new JFrame();

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        frame.setBounds(433, 125, 450, 375);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 25));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
