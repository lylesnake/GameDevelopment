
public class dragon {
	
	int height = 3;
	int weight = 28;
	int magickAbility = 10;
	int monthsTrained = 0; 
	int strength = 10;
	
	public void findStrength(int i) {
		int strength = i;
		if (strength < 20) {
			System.out.println("It's not very strong yet...");
		}
		else if (21 < strength && strength < 40) {
			System.out.println("It's moderately strong. Train some more with it!");
		}
		else if (strength > 40) {
			System.out.println("This is an incredibly strong dragon. I'm impressed!");
		}
	}
	 
		
	public void weightTraining(int i) {
		int monthsTrained = i; 
		weight = monthsTrained * 3; 		
	}

	public void magickTraining(int i) {
		int monthsTrained2 = i;
		magickAbility = monthsTrained2 * 2 + magickAbility;		
	} 
	
	public void heightByWeight(int i) {
		int weight = i; 
		height = weight - 25; 
	}

}
