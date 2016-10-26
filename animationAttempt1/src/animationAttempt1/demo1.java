package animationAttempt1;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class demo1 extends JFrame {

    public demo1() {
        
        initUI();
    }
    
    private void initUI() {

        add(new Board());
        
        setResizable(false);
        pack();
        
        setTitle("Star");
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {                
                JFrame ex = new demo1();
                ex.setVisible(true);                
            }
        });
    }
}