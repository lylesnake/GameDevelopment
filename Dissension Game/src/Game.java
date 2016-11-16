import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		String username; 
		GreetUserAndGetName();
		player player1 = new player(); 
		
		//working on showing the player their credentials. It's not working so far. 
		player1.ShowPlayerCredentials();
		
		
	}
		
		
		private static String GreetUserAndGetName() {

			Scanner input = new Scanner(System.in); 
			System.out.println("Welcome to the Choose Your Own Adventure Game!");
			
			System.out.println("What is your name? "); 
			String username = input.nextLine();
			System.out.println("Hello " + username +"!");

			return username;

	}

}
