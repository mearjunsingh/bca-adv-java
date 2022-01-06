package LAB2;

import java.awt.event.*;
import javax.swing.*;

public class MouseEventsExample {
    public static void main(String[] args) {
        new MouseEventsExampleImplementation();
    }
}

class MouseEventsExampleImplementation {
    JFrame frame;
    JLabel label;
    MouseEventsExampleEventHandler handler;

    MouseEventsExampleImplementation() {
        frame = new JFrame("Mouse Events");
        label = new JLabel("...");
        handler = new MouseEventsExampleEventHandler(this);

        frame.add(label);

        frame.setBounds(433, 125, 450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        label.setBounds(33, 100, 100, 30);

        frame.addMouseListener(handler);
    }
}

class MouseEventsExampleEventHandler implements MouseListener {
    MouseEventsExampleImplementation obj;

    MouseEventsExampleEventHandler(MouseEventsExampleImplementation obj) {
        this.obj = obj;
    }

    public void mouseClicked(MouseEvent e) {
        obj.label.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        obj.label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        obj.label.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        obj.label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        obj.label.setText("Mouse Released");
    }
}