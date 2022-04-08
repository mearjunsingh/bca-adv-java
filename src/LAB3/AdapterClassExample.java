package LAB3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdapterClassExample extends MouseMotionAdapter {
    JFrame frame;

    AdapterClassExample() {
        frame = new JFrame();

        frame.addMouseMotionListener(this);

        frame.setBounds(433, 125, 450, 375);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = frame.getGraphics();
        g.setColor(Color.ORANGE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public static void main(String[] args) {
        new AdapterClassExample();
    }
}