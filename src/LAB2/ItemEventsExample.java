package LAB2;

import java.awt.event.*;
import javax.swing.*;

public class ItemEventsExample {
    public static void main(String[] args) {
        new ItemEventsExampleImplementation();
    }
}

class ItemEventsExampleImplementation {
    JFrame frame;
    JLabel label;
    JCheckBox bca, bsc;

    ItemEventsExampleImplementation() {
        frame = new JFrame("Item Events");
        label = new JLabel("...");
        bca = new JCheckBox("BCA");
        bsc = new JCheckBox("BSc");

        frame.add(label);
        frame.add(bca);
        frame.add(bsc);

        frame.setBounds(433, 125, 450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        bca.setBounds(167, 50, 200, 30);
        bsc.setBounds(167, 100, 200, 30);
        label.setBounds(167, 150, 200, 30);

        bca.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                String status = event.getStateChange() == 1 ? "checked." : "unchecked.";
                label.setText("BCA is " + status);
            }
        });

        bsc.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent event) {
                String status = event.getStateChange() == 1 ? "checked." : "unchecked.";
                label.setText("BSc is " + status);
            }
        });
    }
}