package Test;

import PresentationLayer.GUI;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.out.println("Can not change UI");
        }
        
        SwingUtilities.invokeLater(() -> {
            new GUI();
        });
    }
}
