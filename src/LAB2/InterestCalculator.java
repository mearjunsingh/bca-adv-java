package LAB2;

import java.awt.event.*;
import javax.swing.*;

public class InterestCalculator {
    public static void main(String[] args) {
        new InterestImplementation();
    }
}

class InterestImplementation implements ActionListener {
    JFrame frame;
    JLabel principleLabel, timeLabel, rateLabel, resultLabel, result;
    JTextField principle, time, rate;
    JButton SIbtn, CIbtn;

    InterestImplementation() {
        frame = new JFrame("Interest Calculator");
        principleLabel = new JLabel("Principle: ");
        timeLabel = new JLabel("Time: ");
        rateLabel = new JLabel("Rate: ");
        principle = new JTextField(20);
        time = new JTextField(20);
        rate = new JTextField(20);
        SIbtn = new JButton("SI");
        CIbtn = new JButton("CI");
        resultLabel = new JLabel("Result: ");
        result = new JLabel("...");

        frame.add(principleLabel);
        frame.add(timeLabel);
        frame.add(rateLabel);
        frame.add(principle);
        frame.add(time);
        frame.add(rate);
        frame.add(SIbtn);
        frame.add(CIbtn);
        frame.add(resultLabel);
        frame.add(result);

        frame.setBounds(20, 50, 100, 20);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        principleLabel.setBounds(20, 50, 100, 20);
        principle.setBounds(150, 50, 200, 20);
        timeLabel.setBounds(20, 100, 100, 20);
        time.setBounds(150, 100, 200, 20);
        rateLabel.setBounds(20, 150, 100, 20);
        rate.setBounds(150, 150, 200, 20);

        SIbtn.setBounds(150, 200, 50, 20);
        CIbtn.setBounds(250, 200, 50, 20);

        resultLabel.setBounds(20, 250, 100, 20);
        result.setBounds(150, 250, 100, 20);

        SIbtn.addActionListener(this);
        CIbtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        String p = principle.getText();
        String t = time.getText();
        String r = rate.getText();

        double pn = Double.parseDouble(p);
        double tn = Double.parseDouble(t);
        double rn = Double.parseDouble(r);

        if (event.getActionCommand() == "SI") {
            double si = (pn * tn * rn) / 100;
            result.setText(Double.toString(si));
        } else if (event.getActionCommand() == "CI") {
            double ci = pn * (Math.pow((1 + (rn / 100)), tn) - 1);
            result.setText(Double.toString(ci));
        }
    }
}