package LAB1;

import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        new LoginFormImplementation();
    }
}

class LoginFormImplementation {
    JFrame frame;
    JLabel usernameLabel, passwordLabel;
    JTextField username, password;
    JButton button;
    
    LoginFormImplementation() {
        frame = new JFrame("Login Form");
        usernameLabel = new JLabel("Username:");
        username = new JTextField(20);
        passwordLabel = new JLabel("Password:");
        password = new JPasswordField(20);
        button = new JButton("Login");
        
        frame.add(usernameLabel);
        frame.add(username);
        frame.add(passwordLabel);
        frame.add(password);
        frame.add(button);

        frame.setBounds(433, 125, 450, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        usernameLabel.setBounds(33, 50, 100, 30);
        username.setBounds(167, 50, 200, 30);
        passwordLabel.setBounds(33, 100, 100, 30);
        password.setBounds(167, 100, 200, 30);
        button.setBounds(167, 150, 100, 30);
    }

}