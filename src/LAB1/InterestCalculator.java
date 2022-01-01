package LAB1;

import javax.swing.*;

public class InterestCalculator {
    public static void main(String[] args) {
        new InterestCalculatorImplementation();
    }
}

class InterestCalculatorImplementation {
    JFrame frame;
    JLabel principalLabel, rateLabel, timeLabel, resultLabel, result;
    JTextField principal, rate, time;
    JButton button;
    
    InterestCalculatorImplementation() {
        frame = new JFrame("Simple Interest Calculator");
        principalLabel = new JLabel("Principal:");
        principal = new JTextField(20);
        rateLabel = new JLabel("Rate:");
        rate = new JTextField(20);
        timeLabel = new JLabel("Time:");
        time = new JTextField(20);
        button = new JButton("Calculate");
        resultLabel = new JLabel("Interest:");
        result = new JLabel("...");
        
        frame.add(principalLabel);
        frame.add(principal);
        frame.add(rateLabel);
        frame.add(rate);
        frame.add(timeLabel);
        frame.add(time);
        frame.add(button);
        frame.add(resultLabel);
        frame.add(result);

        frame.setBounds(433, 125, 450, 375);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        principalLabel.setBounds(33, 50, 100, 30);
        principal.setBounds(167, 50, 200, 30);
        rateLabel.setBounds(33, 100, 100, 30);
        rate.setBounds(167, 100, 200, 30);
        timeLabel.setBounds(33, 150, 100, 30);
        time.setBounds(167, 150, 200, 30);
        button.setBounds(167, 200, 100, 30);
        resultLabel.setBounds(33, 250, 100, 30);
        result.setBounds(167, 250, 200, 30);
    }

}