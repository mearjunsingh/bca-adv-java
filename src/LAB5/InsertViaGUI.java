package LAB5;

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class InsertViaGUI {
    public static void main(String[] args) {
        new GUIInsert();
    }
}

class GUIInsert implements ActionListener {
    JFrame frame;
    JLabel rollLabel, nameLabel, addressLabel, collegeLabel, message;
    JTextField roll, name, address, college;
    JButton insertBtn;

    GUIInsert() {
        frame = new JFrame("Add Student Form");
        rollLabel = new JLabel("Roll: ");
        nameLabel = new JLabel("Name: ");
        addressLabel = new JLabel("Address: ");
        collegeLabel = new JLabel("College: ");
        roll = new JTextField(25);
        name = new JTextField(50);
        address = new JTextField(100);
        college = new JTextField(75);
        insertBtn = new JButton("Insert Record");
        message = new JLabel("...");

        frame.add(rollLabel);
        frame.add(nameLabel);
        frame.add(addressLabel);
        frame.add(collegeLabel);
        frame.add(roll);
        frame.add(name);
        frame.add(address);
        frame.add(college);
        frame.add(insertBtn);
        frame.add(message);

        frame.setBounds(20, 50, 100, 20);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rollLabel.setBounds(20, 50, 100, 20);
        roll.setBounds(150, 50, 200, 20);
        nameLabel.setBounds(20, 100, 100, 20);
        name.setBounds(150, 100, 200, 20);
        addressLabel.setBounds(20, 150, 100, 20);
        address.setBounds(150, 150, 200, 20);
        collegeLabel.setBounds(20, 200, 100, 20);
        college.setBounds(150, 200, 200, 20);

        insertBtn.setBounds(150, 250, 200, 20);

        message.setBounds(150, 300, 200, 20);

        insertBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        String r = roll.getText();
        String n = name.getText();
        String a = address.getText();
        String c = college.getText();

        String msg = "";

        try {
            msg = insertRecord(r, n, a, c);
        } catch (Exception e) {
            msg = "Unknown Error Occurred.";
        }

        message.setText(msg);
    }

    public String insertRecord(String roll, String name, String address, String college) throws Exception {
        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost/College";
        String user = "postgres";
        String password = "pass";

        Connection con = DriverManager.getConnection(url, user, password);

        if (con == null) {
            return "Connection Error.";
        } else {

            String sql = "INSERT INTO public.\"Student\"(\"Roll\", \"Name\", \"Address\", \"College\") VALUES ("
                    + roll + ", '" + name + "', '" + address + "', '" + college + "');";

            Statement stmt = con.createStatement();

            boolean status = stmt.execute(sql);

            if (!status) {
                return "Record Inserted Successfully.";
            } else {
                return "Insertion Error.";
            }
        }
    }

}