package LAB4;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListAndTableExample {

    JFrame frame;
    JList list;
    JTable table;

    ListAndTableExample() {
        frame = new JFrame();

        String[] listItems = { "Red", "Green", "Blue" };
        Color[] listColors = { Color.RED, Color.GREEN, Color.BLUE };

        list = new JList(listItems);

        list.setVisibleRowCount(3);
        list.setSelectionMode(0);

        frame.add(new JScrollPane(list));

        String[][] data = {
                { "01", "Ram", "Kathmandu" },
                { "02", "Shyam", "Pokhara" },
                { "03", "Hari", "Biratnagar" }
        };
        String[] columns = { "ID", "Name", "Address" };

        table = new JTable(data, columns);

        frame.add(new JScrollPane(table));

        frame.setBounds(433, 125, 450, 375);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                frame.getContentPane().setBackground(listColors[list.getSelectedIndex()]);
            }
        });
    }

    public static void main(String[] args) {
        new ListAndTableExample();
    }
}
