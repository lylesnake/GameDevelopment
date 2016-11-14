
public class ObjectsAttempt1 {

	public static void main(String[] args) {
		// We are going to begin playing with Object 
		//oriented programming in Java 
		
		/*
		 * The evolutionary line of dragons on Portum 
		 * is very similar to the evolutionary line of 
		 * the Hexavis. 
		 * They have six limbs the same way the Hexavis do. 
		 * This is why they have wings and arms. Ignis was 
		 * the first modern dragon. 
		 * Her breath is the hottest flame. They say 
		 * Caritas herself trained and rode this dragon. 
		 * This is the dragon we will talk about herein. 
		 * 
		 */
		
		dragon Ignis = new dragon(); 
		
		/*
		 * Caritas met Ignis when she was a young wild dragon.
		 * She was stronger than the other wild dragons, 
		 * but she was not strong enough
		 * to beat Caritas. When Caritas captured her, 
		 * they trained relentlessly together. 
		 * 
		 */
		
		System.out.println("At first, Ignis weighed " 
		+ Ignis.weight + " tons."); 
		
		/*
		 * To train, Caritas made Ignis protein shakes that 
		 * were good for dragon growth. They also went on long
		 * flights and battled other dragons both in the wild
		 * and under the guide of other people. There 
		 * was a tribe of Hexavi dragon trainers that gave 
		 * Caritas pointers. 
		 * 
		 */
		
		Ignis.weightTraining(9); 
		
		System.out.println("After nine months of training, "
				+ "Ignis weighed " + Ignis.weight + " tons. ");
		
		/*
		 * Ignis had a strength in magick, which was why 
		 * Caritas was interested in her in the firt place. 
		 * 
		 */
		
		System.out.println("Initially, Ignis had a magick "
				+ "ability of " + Ignis.magickAbility + " volts."); 
		
		

	}

}
