import java.util.Scanner;
public class ObjectsAttempt1 {
	static Scanner input = new Scanner(System.in); 

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
		
		//dragon Ignis = new dragon(); 
		
		/*
		 * Caritas met Ignis when she was a young wild dragon.
		 * She was stronger than the other wild dragons, 
		 * but she was not strong enough
		 * to beat Caritas. When Caritas captured her, 
		 * they trained relentlessly together. 
		 * 
		 */
		
		//System.out.println("At first, Ignis weighed " 
		//+ Ignis.weight + " tons."); 
		
		/*
		 * To train, Caritas made Ignis protein shakes that 
		 * were good for dragon growth. They also went on long
		 * flights and battled other dragons both in the wild
		 * and under the guide of other people. There 
		 * was a tribe of Hexavi dragon trainers that gave 
		 * Caritas pointers. 
		 * 
		 */
		
		//Ignis.weightTraining(9); 
		
		//System.out.println("After nine months of training, "
		//	+ "Ignis weighed " + Ignis.weight + " tons. ");
		
		/*
		 * Ignis had a strength in magick, which was why 
		 * Caritas was interested in her in the firt place. 
		 * 
		 */
		
		//System.out.println("Initially, Ignis had a magick "
		//	+ "ability of " + Ignis.magickAbility + " volts."); 
		
		/*
		 * Ignis trained hard to impress Caritas. After
		 * some training, she had improved her 
		 * magick ability. 
		 * 
		 */
		
		//Ignis.magickTraining(4);
		
		//System.out.println("After four months, Ignis raised "
		//		+ "her magick ability to " + Ignis.magickAbility 
		//		+ " volts.");
		
		/*
		 * After a few years of bonding and training with
		 * Caritas, Ignis was much stronger, faster, 
		 * and more powerful. One day, while Ignis and Caritas 
		 * were out flying near the Floating Isles, Ignis 
		 * saw some creatures that looked like her. They were
		 * big and scaley with wings and magick abilities. 
		 * 
		 *  She did not listen to Caritas; she flew hard and fast
		 *  towards the creatures. The creatures saw this massive
		 *  stranger coming towards them and they fled. All of them
		 *  except for one. An equally strong male dragon stood 
		 *  his ground. Ignis bowed to him. Caritas upon her back stared 
		 *  wide-eyed into the face of this massive and gorgeous
		 *  dragon. The male came closer enabling Caritas to get 
		 *  a better look at him. 
		 * 
		 */
		
		//dragon Caelum = new dragon(); 
		
		//Caelum.weightTraining(36);
		//System.out.println("The new dragon has a weight of "
		//+ Caelum.weight + " tons.");
		
		//Caelum.heightByWeight(108);
		//System.out.println("The new dragon is approximately " 
		//+ Caelum.height + " feet tall. "); 
		
		/*
		 * List to deliver: 
		 * spawn new dragon 
		 * train new dragon 
		 * win/lose battles with dragon 
		 * get money 
		 * be the best
		 * 
		 */
		
		/* 
		 * Caelum spoke to the pair. He told them his name was Caelum
		 * and asked Ignis for her name. Caritas was shocked. She 
		 * did not know dragons could speak. She had never taught Ignis 
		 * to talk. 
		 * 
		 * Now, Caritas knew she must begin training Ignis 
		 * to talk. 
		 * 
		 * Months went by and Ignis began spending more and 
		 * more time with the other dragons. One day, she came home to 
		 * Caritas with an egg. 
		 * 
		 * "It is not safe for me to keep this egg. There have been 
		 * many battles between the dragon tribes. Keep it safe for 
		 * me. Raise it well. I will be back whenever the time comes,"
		 * Ignis said. Caritas nodded. She would do her best to care
		 * for Ignis's child. 
		 * 
		 * Decades came and went and Caritas began breeding this 
		 * baby dragon with other dragons to get stronger dragons. 
		 * She passed this on to her children and they passed it
		 * on to their children who passed it on to you. 
		 *  
		 */
		
		System.out.println("What is your name?");
		String username = input.nextLine();
		System.out.println("Hello " + username + "! ");
		input.nextLine();
		
		player player = new player(); 
		
		System.out.println("What is that in your hands?");
		input.nextLine();
		System.out.println("It's a dragon toy. Shake it!");
		input.nextLine();
		System.out.println("You shake the toy and a small baby dragon "
				+ "comes flying and running into your arms.");
		System.out.println("This is your dragon. You are its parent. "
				+ "What will you name it?"); 
		String DragonName = input.nextLine(); 
		
		dragon dragon = new dragon(); 
		
		System.out.println(DragonName + "'s initial stats are: "); 
		System.out.println("\t" + dragon.weight + " kilograms of weight");
		System.out.println("\t" + dragon.magickAbility + " volts of magick ability");
		System.out.println("\t" + dragon.height + " feet tall");
		System.out.print("\t"); dragon.findStrength(dragon.strength);
		input.nextLine();
		
		System.out.println("Now it is time to train. ");
		
		
		
		
		
		
		
		
		
		
		
	}

}
