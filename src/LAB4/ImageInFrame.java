package LAB4;

import java.awt.*;
import javax.swing.*;

public class ImageInFrame extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Canvas canvas = new ImageInFrame();

        canvas.setSize(300, 300);

        frame.add(canvas);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics graphics) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        Image img = tool.getImage("demo.jpg");
        graphics.drawImage(img, 120, 100, this);
    }
}
