package LAB3;

import java.awt.event.*;
import javax.swing.*;

public class MenuExample {

    JFrame frame;
    JMenuBar menuBar;
    JMenu menu, subMenu;
    JMenuItem i1, i2, i3, i4, i5;

    MenuExample() {
        frame = new JFrame();

        menuBar = new JMenuBar();
        menu = new JMenu("File");
        subMenu = new JMenu("Options");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("--EMPTY--");
        i5 = new JMenuItem("Quit");

        i1.setMnemonic(KeyEvent.VK_N);
        i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        i2.setMnemonic(KeyEvent.VK_O);
        i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));

        i3.setMnemonic(KeyEvent.VK_S);
        i3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        subMenu.add(i4);
        subMenu.add(i5);

        menu.add(subMenu);

        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.setBounds(433, 125, 450, 375);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new MenuExample();
    }
}
