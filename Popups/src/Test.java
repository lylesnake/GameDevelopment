import javax.swing.*; 

public class Test {

	public static void main(String[] args) {
	
		String username = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + username); 
	
	}
	
}
