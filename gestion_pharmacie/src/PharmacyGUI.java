import javax.swing.*;
import java.awt.*;

public class PharmacyGUI {
    private PharmacySystem pharmacySystem;

    public PharmacyGUI(PharmacySystem pharmacySystem) {
        this.pharmacySystem = pharmacySystem;
    }

    public void show() {
        JFrame frame = new JFrame("Pharmacy Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(81, 81, 81));
        frame.getContentPane().add(new JLabel("Welcome to the Pharmacy Management System"));
    }
}
