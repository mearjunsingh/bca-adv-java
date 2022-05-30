package LAB4;

import java.awt.*;
import javax.swing.*;

public class ShapesExample extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Canvas canvas = new ShapesExample();

        canvas.setSize(400, 600);

        frame.add(canvas);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics graphics) {
        graphics.drawLine(100, 100, 200, 200);
        graphics.drawRect(30, 30, 100, 50);
        graphics.drawArc(60, 180, 50, 140, 0, 90);
        graphics.drawOval(100, 100, 50, 90);
        int[] x = { 10, 200, 10 };
        int[] y = { 450, 450, 550 };
        graphics.drawPolygon(x, y, 3);
    }
}
