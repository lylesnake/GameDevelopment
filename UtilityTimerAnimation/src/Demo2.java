import java.awt.EventQueue;
import javax.swing.JFrame;

public class Demo2 extends JFrame {

    public Demo2() {

        initUI();
    }
    
    private void initUI() {
        
        add(new Board2());
                        
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
                JFrame ex = new Demo2();
                ex.setVisible(true);                
            }
        });
    }
}
