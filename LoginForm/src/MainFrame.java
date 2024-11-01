import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    final int WIDTH = 1100;
    final int HEIGHT = 650;

    public void initialize(User user) {
        JPanel inforPanel = new JPanel();
        inforPanel.setLayout(new GridLayout(0, 2, 5, 5));
        inforPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        inforPanel.add(new JLabel("Name"));
        inforPanel.add(new JLabel(user.name));
        inforPanel.add(new JLabel("Email"));
        inforPanel.add(new JLabel(user.email));
        inforPanel.add(new JLabel("Phone"));
        inforPanel.add(new JLabel(user.phone));
        inforPanel.add(new JLabel("Address"));
        inforPanel.add(new JLabel(user.address));

        add(inforPanel, BorderLayout.NORTH);

        setTitle("Dashboard");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
