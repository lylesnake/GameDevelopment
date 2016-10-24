package animationAttempt1;

//imports
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Dimension;

public class loadingImage {

	public static void main(String[] args) {
		
		JFrame f = new JFrame(); 		
		//creates j frame f
		
	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
	    //this is your screen size
	    
	    f.setUndecorated(true); 
	    //removes the surrounding border
	    
	    ImageIcon image = new ImageIcon(loadingImage.class.getResource("Star.png")); 
	    //imports the image
	    
	    JLabel lbl = new JLabel(image); 
	    //puts the image into a j label
	    
	    f.getContentPane().add(lbl); 
	    //puts label inside the j frame
	    
	    f.setSize(image.getIconWidth(), image.getIconHeight()); 
	    //gets h and w of image and sets j frame to the size
	    
	    int x = (screenSize.width - f.getSize().width)/2; 
	    int y = (screenSize.height - f.getSize().height)/2; 
	    //These two lines are the dimensions of the center of the screen
	    
	    f.setLocation(x, y); //sets the location of the j frame
	    f.setVisible(true); //makes the j frame visible
	}

}
