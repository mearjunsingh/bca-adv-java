package LAB2;

import java.awt.event.*;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        new CalculatorImplementation();
    }
}

class CalculatorImplementation {
    JFrame frame;
    JLabel number1Label, number2Label, resultLabel, result;
    JTextField number1, number2;
    JButton addBtn, subBtn;

    CalculatorImplementation() {
        frame = new JFrame("Calculator");
        number1Label = new JLabel("Number 1: ");
        number2Label = new JLabel("Number 2: ");
        resultLabel = new JLabel("Result: ");
        result = new JLabel("...");
        number1 = new JTextField(10);
        number2 = new JTextField(10);
        addBtn = new JButton("Add");
        subBtn = new JButton("Sub");

        frame.add(number1Label);
        frame.add(number2Label);
        frame.add(resultLabel);
        frame.add(result);
        frame.add(number1);
        frame.add(number2);
        frame.add(addBtn);
        frame.add(subBtn);

        frame.setBounds(433, 125, 450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        number1Label.setBounds(33, 50, 100, 30);
        number1.setBounds(167, 50, 200, 30);
        number2Label.setBounds(33, 100, 100, 30);
        number2.setBounds(167, 100, 200, 30);
        addBtn.setBounds(167, 150, 100, 30);
        subBtn.setBounds(300, 150, 100, 30);
        resultLabel.setBounds(33, 200, 100, 30);
        result.setBounds(167, 200, 100, 30);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String num1 = number1.getText();
                String num2 = number2.getText();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                int sum = n1 + n2;
                result.setText(Integer.toString(sum));
            }
        });

        subBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String num1 = number1.getText();
                String num2 = number2.getText();

                int n1 = Integer.parseInt(num1);
                int n2 = Integer.parseInt(num2);

                int diff = n1 - n2;
                result.setText(Integer.toString(diff));
            }
        });
    }
}