import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 

public class Checkbox {

	public static void main(String[] args) {
		
		JRadioButton choice1 = new JRadioButton("Choice 1", true); 
		JRadioButton choice2 = new JRadioButton("Choice 2");
		JRadioButton choice3 = new JRadioButton("Choice 3"); 
		
		ButtonGroup group = new ButtonGroup();
			group.add(choice1);
			group.add(choice2);
			group.add(choice3);
		
	}

}
