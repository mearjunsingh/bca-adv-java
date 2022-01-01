package LAB1;

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
    JButton button;

    CalculatorImplementation() {
        frame = new JFrame("Calculator");
        number1Label = new JLabel("Number 1:");
        number1 = new JTextField(20);
        number2Label = new JLabel("Number 2:");
        number2 = new JTextField(20);
        button = new JButton("Add");
        resultLabel = new JLabel("Result:");
        result = new JLabel("...");
        
        frame.add(number1Label);
        frame.add(number1);
        frame.add(number2Label);
        frame.add(number2);
        frame.add(button);
        frame.add(resultLabel);
        frame.add(result);

        frame.setBounds(433, 125, 450, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        number1Label.setBounds(33, 50, 100, 30);
        number1.setBounds(167, 50, 200, 30);
        number2Label.setBounds(33, 100, 100, 30);
        number2.setBounds(167, 100, 200, 30);
        button.setBounds(167, 150, 100, 30);
        resultLabel.setBounds(33, 200, 100, 30);
        result.setBounds(167, 200, 100, 30);
    }
}