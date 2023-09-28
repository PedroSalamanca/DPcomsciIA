import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class puri 2.0 moimoi extends JFrame implements ActionListener {

    JLabel userLabel, passwordLabel, messageLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton, signUpButton;

    puri 2.0 moimoi() {
        userLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        messageLabel = new JLabel("");

        userTextField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        signUpButton = new JButton("Sign Up");

        setLayout(new GridLayout(5, 2));

        add(userLabel);
        add(userTextField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); 
        add(loginButton);
        add(signUpButton);
        add(messageLabel);

        loginButton.addActionListener(this);
        signUpButton.addActionListener(this);

        setTitle("Login Page with Sign Up and Registration");
        setSize(300, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("your_username") && password.equals("your_password")) {
                messageLabel.setText("Login successful!");

                openMainPage(username); 
                dispose(); 
            } else {
                messageLabel.setText("Login failed. Please try again.");
            }
        } else if (e.getSource() == signUpButton) {
            openRegistrationDialog();
        }
    }

    private void openMainPage(String username) {
        JFrame mainPage = new JFrame("Main Page");
        mainPage.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Welcome, " + username + "!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPage.add(welcomeLabel, BorderLayout.CENTER);

        mainPage.setSize(400, 300);
        mainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPage.setLocationRelativeTo(null);
        mainPage.setResizable(false);
        mainPage.setVisible(true);
    }

    private void openRegistrationDialog() {
    }

    public static void main(String[] args) {
        new puri 2.0 moimoi();
    }
}
