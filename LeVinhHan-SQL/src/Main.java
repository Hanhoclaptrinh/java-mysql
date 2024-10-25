import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println("Không thể thay đổi giao diện");
        }

        SwingUtilities.invokeLater(() -> {
            GUI gui = new GUI();
            gui.init();
            gui.loadDuLieu();
            gui.loadComboBoxData();
        });
    }
}
