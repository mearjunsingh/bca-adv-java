package LAB2;

import java.awt.event.*;
import javax.swing.*;

public class KeyEventsExample {
    public static void main(String[] args) {
        new KeyEventsExampleImplementation();
    }
}

class KeyEventsExampleImplementation {
    JFrame frame;
    JLabel label;
    JTextField input;
    KeyEventsExampleEventHandler handler;

    KeyEventsExampleImplementation() {
        frame = new JFrame("Key Events");
        input = new JTextField(20);
        label = new JLabel("...");
        handler = new KeyEventsExampleEventHandler(this);

        frame.add(input);
        frame.add(label);

        frame.setBounds(433, 125, 450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        input.setBounds(167, 50, 200, 30);
        label.setBounds(167, 150, 200, 30);

        input.addKeyListener(handler);
    }
}

class KeyEventsExampleEventHandler implements KeyListener {
    KeyEventsExampleImplementation obj;

    KeyEventsExampleEventHandler(KeyEventsExampleImplementation obj) {
        this.obj = obj;
    }

    public void keyTyped(KeyEvent e) {
        obj.label.setText("Key Typed");
    }

    public void keyPressed(KeyEvent e) {
        obj.label.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        obj.label.setText("Key Released");
    }
}