import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginForm extends JFrame {
    final int WIDTH = 400;
    final int HEIGHT = 500;
    final Font mainFont = new Font("Inter", Font.BOLD, 18);

    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginForm() {
        initialize();
        setVisible(true);
    }

    public void initialize() {
        JLabel lbLoginForm = new JLabel("Login Form", SwingConstants.CENTER);
        lbLoginForm.setFont(mainFont);

        JLabel lbEmail = new JLabel("Email");
        lbEmail.setFont(mainFont);

        txtEmail = new JTextField();
        txtEmail.setFont(mainFont);

        JLabel lbPassword = new JLabel("Password");
        lbPassword.setFont(mainFont);

        txtPassword = new JPasswordField();
        txtPassword.setFont(mainFont);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        panel.add(lbLoginForm);
        panel.add(lbEmail);
        panel.add(txtEmail);
        panel.add(lbPassword);
        panel.add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setFont(mainFont);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(mainFont);

        btnLogin.addActionListener(_ -> {
            String email = txtEmail.getText();
            String password = String.valueOf(txtPassword.getPassword());

            User user = ConnectData.getAuthenticatedUser(email, password);

            if (user != null) {
                MainFrame mainFrame = new MainFrame();
                mainFrame.initialize(user);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Email or Password is invalid",
                                                        "Try again", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnLogin.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnLogin.doClick();
                }
            }
        });

        btnCancel.addActionListener(_ -> dispose());

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1,2 , 10, 0));
        btnPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        btnPanel.add(btnLogin);
        btnPanel.add(btnCancel);

        add(panel, BorderLayout.NORTH);
        add(btnPanel, BorderLayout.SOUTH);

        setTitle("Login Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
