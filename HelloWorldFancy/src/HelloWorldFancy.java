import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class HelloWorldFancy {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                ImageIcon icon = new ImageIcon(HelloWorldFancy.class.getResource("/earth.png"));
                JOptionPane.showMessageDialog(
                        null,
                        "Hello world",
                        "Hello", JOptionPane.INFORMATION_MESSAGE,
                        icon);
                JOptionPane.showMessageDialog(
                        null,
                        new JLabel("Hello world", icon, JLabel.LEFT),
                        "Hello", JOptionPane.INFORMATION_MESSAGE);

            }
        });
    }
}
