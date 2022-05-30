package LAB4;

import java.awt.*;
import javax.swing.*;

public class ColorAndFontExample extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Canvas canvas = new ColorAndFontExample();

        canvas.setSize(300, 300);

        frame.add(canvas);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics graphics) {
        Font font = new Font("comic sans ms", Font.BOLD | Font.ITALIC, 20);
        graphics.setFont(font);
        graphics.setColor(Color.RED);
        graphics.drawString("Hello and Welcome!", 50, 100);
    }
}
