package animal;

import javax.swing.SwingUtilities;

public class Animal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new jftv1().setVisible(true);
        });
    }
}