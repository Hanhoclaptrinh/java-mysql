import GUI.Quanlynhanvien;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            System.out.println("Không thể chuyển đổi giao diện");
        } 
        SwingUtilities.invokeLater(() -> {
            new Quanlynhanvien();
        });
    }
}
