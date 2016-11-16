
public class player {

	int level = 1; 
	int stanima = 100;
	
	int magicka = 100;
	
	int health = 100;
	
	//trying to make a formula that will show the total possible stat 
	//I want it to raise with the player's level
	public void PlayerTotals(int level) {
		int total = 100 * level; 
	}
	public void ShowPlayerCredentials() {
		System.out.println("You are level " + level);
		System.out.print("You have " + health + "out of "); PlayerTotals(level);
		
	}
	
	
}
