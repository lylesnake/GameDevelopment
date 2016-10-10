import java.util.Scanner; 

public class ActualGame {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		String username;
		username = GreetUserAndGetName(); 


		System.out.println("This is a game where you will control your own destiny. "
				+ "\nWould like to play as (A) an ASSASSIN, (B) a MAGICIAN, or (C) a WARRIOR?\n");
		String characterType = input.nextLine(); 

		if (characterType.equalsIgnoreCase("a")) {
			customMethodJordan(username);

		}		

		else if (characterType.equalsIgnoreCase("b")) {
			customMethodKendall(username); 
		}

		else if (characterType.equalsIgnoreCase("c")) {
			customMethodTaylor(username); 

		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}	

	}

	private static String GreetUserAndGetName() {
		System.out.print("Welcome to the Choose Your Own Adventure Game!\n");

		Scanner input = new Scanner(System.in); 

		System.out.println("What is your name? "); 
		String username = input.nextLine();
		System.out.println("Hello " + username +"!");

		return username;
	}


	private static void customMethodKendall(String username) {
		Scanner input = new Scanner(System.in);
		System.out.println("You chose to play as a MAGICIAN! \nLet me introduce you to my friend KENDALL."
				+ "\nKENDALL is a wise mage who will lead you on your adventure.\n");

		System.out.println("KENDALL appears in a puff of smoke that smells strangely of pancakes. "
				+ "\n\"Greetings, " + username + ". My name is KENDALL. I will train you in the ways of the MAGICIAN.\""
				+ "\nKENDALL reaches into a bag on his waist and hands you a STAFF. "
				+ "\n\"This STAFF can help you with all of the powerful spells. "
				+ "I see you already have an aptitude for FIRE MAGICK. Show me your skills, apprentice.\"\n");

		System.out.println("Choose a response for KENDALL: "
				+ "\n(A) I think I know what I'm doing. *Shoot a weak blast of FIRE MAGICK at the wall.* "
				+ "\n(B) Why do I need to know MAGICK? What's going on here? "); 
		String dialogue1 = input.nextLine();

		if (dialogue1.equalsIgnoreCase("a")) { 
			System.out.println("\"I think I know what I'm doing,\" you say. "
					+ "\nYou step to the side of KENDALL, and aim your hands at the wall. "
					+ "\nA weak blast of FIRE MAGICK bursts from you, slightly toasting the wall. ");
			System.out.println("\"Excellent!\" KENDALL cheers.\n");
		}

		else if (dialogue1.equalsIgnoreCase("b")) {
			System.out.println("You look at KENDALL with a very confused look on your face. "
					+ "\n\"Why do I need to know MAGICK?\" you ask, \"What's going on here?\"  ");
			System.out.println("\"I'm not going to report you for knowing MAGICK,\" KENDALL assures you. ");
		}

		else {
			System.out.println("You aim your hands at KENDALL's head and shoot a blast of FIRE MAGICK at him, killing him instantly. Next, you turn on ME!?!? OH NO--");
			System.exit(0);
		}	

		System.out.println("\"We are on a mission to save our planet from the invading INFERNONS,\" KENDALL explains. "
				+ "\n\"In order for you to be of any help to us at all, you'll require training. I will teach you two basic spells.\""
				+ "\nKENDALL aims his STAFF at the wall and shoots a powerful blast of FIRE MAGICK at the it. The flame leaves the wall blackened."
				+ "\n\"That's called FLAME. You can do it by pressing X on your keyboard. Show me your skill, apprentice.\""
				+ "\n[Press X]");
		String fire1 = input.nextLine(); 

		if (fire1.equalsIgnoreCase("x")) {
			double chance1 = Math.random() * 11; 
			if (chance1 > 5){
				System.out.println("You lift your STAFF, aim at the wall, and shoot a powerful FLAME blast, knocking yourself down with your own force."
						+ "\n\"Incredible,\" KENDALL says.");
			}

			else {
				System.out.println("A weak puff of smoke comes out of your STAFF. KENDALL looks puzzled."
						+ "\n\"I didn't think this would be so difficult for you, " + username +",\" he says, frowning.");
			}
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again.");
			System.exit(0);
		}

		System.out.println("KENDALL raises his STAFF above his head and begins to glow. His expression becomes peaceful. "
				+ "\n\"What I just did was called HEALING. You can do it, too. Just press Z on your keyboard."
				+ "\n[Press Z]");
		String healing1 = input.nextLine(); 
		if (healing1.equalsIgnoreCase("z")) {
			System.out.println("You lift your STAFF above your head, willing it to heal you. "
					+ "\nAlmost immediately, you feel your muscles rejuvnate and your mind clear.");
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

		System.out.println("KENDALL grins at you. "
				+ "\n\"You're doing incredibly well at this training, " + username + "! I think you are ready to go out into the real world."
				+ "\nBe warned, though, this is a warzone. Follow me!\" "
				+ "\nKENDALL opens the door of the training room and steps outside. You follow him. There are birds chirping and the cool wind blows. "
				+ "\nThere are bombs exploding in the distance and you hear the screaming of dying citizens.");
		System.out.println("\"We have a couple of different things we can do,\" KENDALL tells you. "
				+ "\n\"We can go heal warriors in battle, or we can go on the offensive and battle alongside the warriors. What do you say?\""
				+ "\nChoose a response for KENDALL: "
				+ "\n(A) I want to heal warriors. "
				+ "\n(B) I want to go on the offensive. ");
		String dialogue2 = input.nextLine(); 
		if (dialogue2.equalsIgnoreCase("a")) {
			System.out.println("\"I want to heal our warriors. Being on the front lines isn't my thing,\" you say. "
					+ "\n\"Fair enough. It's not fun for me, either. Let's go!\" KENDALL says."
					+ "\nKENDALL starts heading north, and you follow. The sounds of the bombs are getting louder with each passing hour."
					+ "\nAfter about three hours of walking, you and KENDALL approach a large, wartorn castle. "
					+ "\n\"That used to be the home of our queen, but the INFERNON KING publicly executed her a few days ago,\" KENDALL says, point at the castle."
					+ "\n\"I've heard rumors that her young son still lives. If that's true, then he is who we fight for.\""
					+ "\n\"Let's hurry and get to the infirmary,\" KENDALL says. He runs inside the castle, ignoring the loud bombs from the neary battlefield. "
					+ "\nThe infirmary is upstairs and the left. There are soldiers in various states of disrepair."
					+ "\n\"Find someone and help them!\" a magician orders you.\n"
					+ "\nYou see a soldier with a broken leg lying on the floor by the wall, moaning in pain. "
					+ "[Press A to approach the wounded soldier]"); 
			String approach = input.nextLine(); 

			if (approach.equalsIgnoreCase("a") ){
				System.out.println("You rush over to the soldier who has broken her leg. "
						+ "\n\"Ohhh it hurts,\" she moans."
						+ "\n[Press X to heal the soldier]");
				String healing2 = input.nextLine();

			}
			else {
				System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
				System.exit(0);
			}
		}

		else if (dialogue2.equalsIgnoreCase("b")) {
			System.out.println("\"I want to go on the front lines and battle the INFERNONS directly,\" you say. "
					+ "\n\"Sounds good to me. Remember to HEAL yourself while we're out there,\" KENDALL reminds you."
					+ "\nKENDALL starts heading north, and you follow. The sounds of the bombs are getting louder with each passing hour."
					+ "\nAfter about three hours of walking, you and KENDALL approach a large, wartorn castle.\n"
					+ "\n\"That used to be the home of our queen, but the INFERNON KING publicly executed her a few days ago,\" KENDALL says, point at the castle."
					+ "\n\"I've heard rumors that her young son still lives. If that's true, then he is who we fight for.\"\n"
					+ "\n\"Are you ready to battle?\" KENDALL asks. You hesitate, but there is no chance to leave now.\n"
					+ "\nA horde of INFERNON SOLDIERS appear and they look angry. KENDALL immediately starts blasting them with his FLAME."
					+ "\nWhat would you like to do? "
					+ "\n(X) Use FLAME against the INFERNONS"
					+ "\n(Z) Use HEALING on KENDALL");

		}

		else {
			System.out.println("You run away, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}			

	}


	private static void customMethodJordan(String username) {
		Scanner input = new Scanner(System.in);
		System.out.println("You chose to play as an ASSASSIN! \nLet me introduce you to my friend JORDAN."
				+ "\nJORDAN is a master assassin who will lead you on your adventure.\n");

		System.out.println("JORDAN saunters out from the shadows and shakes your hand."
				+ "\n\"Hello, " + username + ", \" JORDAN says to you, \"Let's begin training. First, you will need a weapon.\" "
				+ "\nJORDAN reaches into a knapsack on their back and hands you a beautiful ebony DAGGER and a CLOAK."
				+ "\n\"Here is a DAGGER. This is the weapon of the ASSASSIN. The CLOAK will hide you as you stalk your enemies.\"\n ");

		System.out.println("Choose a response for JORDAN: "
				+ "\n(A) Thank you for the equipment. What is our mission?"
				+ "\n(B) Why do I need this stuff? What's going on?"
				+ "\n(C) Say nothing. ");
		String dialogue1 = input.nextLine();

		if (dialogue1.equalsIgnoreCase("a")) { 
			System.out.println("\"Thank you for the equipment, \" you say, \"What's our mission?\" ");
			System.out.println("JORDAN smiles at you and says, ");
		}

		else if (dialogue1.equalsIgnoreCase("b")){
			System.out.println("You look at the equipment in your arms, very confused. "
					+ "\n\"Why do I need this stuff?\" you ask, \"What's going on?\"\n ");
			System.out.println("\"Not even a thank you?\" JORDAN asks. ");
		}

		else if (dialogue1.equalsIgnoreCase("c")) {
			System.out.println("You look at the equipment in your arms and look back up at JORDAN, saying nothing." );
			System.out.println("\"You're a quiet one, eh?\" JORDAN says to you. ");
		}

		else {
			System.out.println("You take the dagger and stab JORDAN, killing them instantly. Next, you turn on ME!?!? OH NO--");
			System.exit(0);
		}
		System.out.print("\"I will be training you to help save our planet from the invasion of the INFERNONS,\" JORDAN explains. "
				+ "\n\"You have been chosen because you seem to have a special aptitude for mischief.\"\n"
				+ "\nJORDAN brings a dummy out of a nearby closet. "
				+ "\n\"It's time to train,\" they say. They crouch down, out of sight of the target, creep slowly behind the dummy, and slit its throat."
				+ "\n\"This is called the STALK ATTACK. You can do it by pressing X on your keyboard. Try it out!\""
				+ "\n[Press X]\n");
		String stalk_attack1 = input.nextLine(); 
		if (stalk_attack1.equalsIgnoreCase("x")) {
			double chance1 = Math.random() * 11; 
			if (chance1 > 5) {
				System.out.println("You crouch down and slowly approach the dummy. When you're sure the target cannot see you, you jump up and slit its throat."
						+ "\n\"Great job!\" JORDAN crongratulates you. ");
			}

			else {
				System.out.println("You crouch down and walk towards your enemy. You jump up, but it's too soon. "
						+ "\n\"Stop!\" JORDAN interrupts you. \"You've been seen and, consequently, killed by guards. Be slower and quieter next time.\"");
			}
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

		System.out.println("\"Next, I will show you how to HIDE,\" JORDAN says, \"Simply wear your CLOAK and hide somewhere. "
				+ "\nIf you're eavesdropping, make sure you remember what you hear.\""
				+ "\nJORDAN puts on their cloak and steps back out of your sight, into the shadows. "
				+ "\nYou can see them, of course, but only because you know they're there."
				+ "\n\"Press Z to put on your cloak and hide,\" JORDAN instructs. "
				+ "\n[Press Z]");
		String hide1 = input.nextLine(); 
		if (hide1.equalsIgnoreCase("z")) {
			System.out.println("You put your cloak on and throw the hood up. You see a corner in the room that is hidden by shadows and stand there.\n"
					+ "\"Good job,\" JORDAN says, \"You can come out now\"\n");
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

		System.out.println("\"I think your training is complete, " + username + ",\" JORDAN says."
				+ "\n\"Let's go out into the real world and help defend our home.\""
				+ "\nJORDAN walks out of the training room and you follow them. There are birds chirping and the cool wind blows. "
				+ "\nThere are bombs exploding in the distance and you hear the screaming of dying citizens.\n");

		System.out.println("\"We have a couple of options on what we can do right now,\" JORDAN informs you. They hand you two pieces of paper."
				+ "\nOne of the papers is a bounty for an INFERNON GENERAL. The other is asking for sensitive information. Both offer rewards of decent sizes."
				+ "\n\"Which would you like to do?\" JORDAN asks. "
				+ "\nChoose a response for JORDAN: "
				+ "\n(A) I would like to kill the INFERNON GENERAL. "
				+ "\n(B) I would like to find information.");
		String dialogue2 = input.nextLine(); 
		if (dialogue2.equalsIgnoreCase("a")) {
			System.out.println("You lift the paper with the bounty on it. \"Let's go kill this guy,\" you say. "
					+ "\nJORDAN nods. \"Good choice. That guy is one of the leaders of the invasion. Killing him would really help us.\""
					+ "\nJORDAN pulls out a map from their knapsack. "
					+ "\n\"The GENERAL is to the west of here. We will have to spend a couple of days travelling.\"\n "
					+ "\nYou and JORDAN start heading west. It's morning and the sun is behind you. You hear the distant bombs and war cries from the warriors. "
					+ "\nSuddenly, an enemy soldier appears! JORDAN throws on their cloak and runs to the trees nearby, being cautious that the enemy doesn't see them."
					+ "\nDo you want to (Z) hide with JORDAN or (X) sneak up and kill the INFERNON SOLDIER? ");
			String Fight1 = input.nextLine(); 
			if (Fight1.equalsIgnoreCase("Z")) {
				double chance2 = Math.random() * 11; 
				if (chance2 > 2){
					System.out.println("You throw your cloak over your body and crouch down, following JORDAN into the trees.\n");
				}
				else {
					System.out.println("You throw your cloak over your body and crouch down. While following JORDAN into the trees,"
							+ "\nyou snap a twig. The SOLDIER sees you and fires a gun in your direction. "
							+ "\nJORDAN keeps running, and eventually flanks the soldier, who is approaching you with a giant SWORD. "
							+ "\nJORDAN takes out their DAGGER and stabs the SOLDIER in the back, saving your life. "
							+ "\n\"Let's keep moving, shall we?\" JORDAN says. You nod and follow them.\n");
				}
			}
			else if (Fight1.equalsIgnoreCase("X")){
				double chance2 = Math.random() * 11; 
				if (chance2 > 6){
					System.out.println("You crouch down low, and stalk up behind the SOLDIER. You prepare your DAGGER and jump up at just the right moment."
							+ "\nYou slit the SOLDIER'S throat. They never saw it coming. "
							+ "\nThe blood gurgles as the SOLDIER tries to breathe, choking on their on blood."
							+ "\nYou walk back over to JORDAN who is smiling proudly at you. "
							+ "\n\"You'll make a great assassin, " + username + ". Let's keep moving,\" they say to you.\n");
				}
				else {
					System.out.println("You crouch down low, and stalk up behind the SOLDIER. You are inches away from them and they have no idea you're there."
							+ "\nYou hear a hiss behind you and turn around, wondering what that noise was. It's JORDAN shaking their head 'no.' "
							+ "\nYou back away from the SOLDIER slowly, letting them walk away."
							+ "\n\"You're not ready for that!\" JORDAN whisper yells at you once the SOLDIER is out of earshot. "
							+ "\n\"You would've gotten both of us killed. Just follow my lead, " + username + ". Now let's keep moving.\"\n ");
				}
			}

			else {
				System.out.println("You do nothing, continuing to stand out in the open. The SOLIDER turns around and sees you. "
						+ "\nThey shoot you with their gun and you die.");
				System.exit(0);
			}
			System.out.println("You and JORDAN keep moving west. Soon, the sun is setting and the day is cooling off.\n "
					+ "\n\"Are you hungry? I have granola bars,\" JORDAN says, offering you a granola bar. You take it and sit down under a tree. "
					+ "\n\"We probably shouldn't build a fire. The smoke would give out position away.\" "
					+ "\n\"Let's also sleep in the trees, that way if INFERNONS come they won't see us,\" JORDAN suggests. "
					+ "\nYou and JORDAN climb into different trees and try to sleep. It takes you a while to sleep. "
					+ "\nThe screaming citizens and the bombs were keeping you up. Eventually, sleep overtakes you."
					+ "[To be continued] ");
		}

		else if (dialogue2.equalsIgnoreCase("b")) {
			System.out.println("You hold up the paper with the request for information. \"I want to help our side get information,\" you say. "
					+ "\n\"We can definitely do that. Let's see if we can sneak into the Infernon headquarters and find out some of their war plans,\" JORDAN says.\n"
					+ "\n\"We will have to travel east. There are some old castles there that the Infernons have turned into their headquarters. "
					+ "\nYou and JORDAN start heading east. It's morning and the sun is in front of you. You hear the distant bombs and war cries from the warriors. "
					+ "\nSuddenly, an enemy soldier appears! JORDAN throws on their cloak and runs to the trees nearby, being cautious that the enemy doesn't see them."
					+ "\nDo you want to (Z) hide with JORDAN or (X) sneak up and kill the INFERNON SOLDIER? ");
			String Fight1 = input.nextLine(); 
			if (Fight1.equalsIgnoreCase("Z")) {
				double chance2 = Math.random() * 11; 
				if (chance2 > 2){
					System.out.println("You throw your cloak over your body and crouch down, following JORDAN into the trees.\n");
				}
				else {
					System.out.println("You throw your cloak over your body and crouch down. While following JORDAN into the trees,"
							+ "\nyou snap a twig. The SOLDIER sees you and fires a gun in your direction. "
							+ "\nJORDAN keeps running, and eventually flanks the soldier, who is approaching you with a giant SWORD. "
							+ "\nJORDAN takes out their DAGGER and stabs the SOLDIER in the back, saving your life. "
							+ "\n\"Let's keep moving, shall we?\" JORDAN says. You nod and follow them.\n");
				}
			}
			else if (Fight1.equalsIgnoreCase("X")){
				double chance2 = Math.random() * 11; 
				if (chance2 > 6){
					System.out.println("You crouch down low, and stalk up behind the SOLDIER. You prepare your DAGGER and jump up at just the right moment."
							+ "\nYou slit the SOLDIER'S throat. They never saw it coming. "
							+ "\nThe blood gurgles as the SOLDIER tries to breathe, choking on their on blood."
							+ "\nYou walk back over to JORDAN who is smiling proudly at you. "
							+ "\n\"You'll make a great assassin, " + username + ". Let's keep moving,\" they say to you.\n");
				}
				else {
					System.out.println("You crouch down low, and stalk up behind the SOLDIER. You are inches away from them and they have no idea you're there."
							+ "\nYou hear a hiss behind you and turn around, wondering what that noise was. It's JORDAN shaking their head 'no.' "
							+ "\nYou back away from the SOLDIER slowly, letting them walk away."
							+ "\n\"You're not ready for that!\" JORDAN whisper yells at you once the SOLDIER is out of earshot. "
							+ "\n\"You would've gotten both of us killed. Just follow my lead, " + username + ". Now let's keep moving.\"\n ");
				}
			}

			else {
				System.out.println("You do nothing, continuing to stand out in the open. The SOLIDER turns around and sees you. "
						+ "\nThey shoot you with their gun and you die.");
				System.exit(0);
			}
			System.out.println("You and JORDAN keep moving east. Soon, the sun is setting and the day is cooling off.\n "
					+ "\n\"Are you hungry? I have granola bars,\" JORDAN says, offering you a granola bar. You take it and sit down under a tree. "
					+ "\n\"We probably shouldn't build a fire. The smoke would give out position away.\" "
					+ "\n\"Let's also sleep in the trees, that way if INFERNONS come they won't see us,\" JORDAN suggests. "
					+ "\nYou and JORDAN climb into different trees and try to sleep. It takes you a while to sleep. "
					+ "\nThe screaming citizens and the bombs were keeping you up. Eventually, sleep overtakes you."
					+ "[To be continued] ");

		}

		else {
			System.out.println("You run away, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

	}


	private static void customMethodTaylor(String username) {
		Scanner input = new Scanner(System.in); 
		System.out.println("You chose to play as a WARRIOR! \nLet me introduce you to my friend TAYLOR."
				+ "\nTAYLOR is a brave warrior who will lead you on your adventure.\n");

		System.out.println("TAYLOR enters the room, laughing. "
				+ "\n\"Hey, " + username + "! I'm TAYLOR. So you think you can be a WARRIOR, eh? We'll see about that.\" "
				+ "\nTAYLOR hands you a heavy metal MACE and a SHIELD from her scabbard. "
				+ "\n\"This MACE will help you clobber your enemies on the battlefield. The SHIELD will protect you from their blows.\"\n ");

		System.out.println("Choose a response for TAYLOR: "
				+ "\n(A) Awesome MACE! Thanks, TAYLOR! Who are we battling?"
				+ "\n(B) Why do I need this stuff? "
				+ "\n(C) Say nothing. ");
		String dialogue1 = input.nextLine(); 

		if (dialogue1.equalsIgnoreCase("a")){
			System.out.println("You take the MACE and SHIELD with a grin on your face. "
					+ "\n\"Wow! Awesome MACE! Thanks TAYLOR!\" you say, excitedly, \"Who are we battling?\"\n");
			System.out.println("TAYLOR smiles at you. \"You remind me of when I was first starting out,\" she says. ");
		}

		else if (dialogue1.equalsIgnoreCase("b")) {
			System.out.println("You take the MACE and SHIELD hesitantly. \n\"Why do I need this stuff?\" you ask TAYLOR.\n");
			System.out.println("\"Didn't your mother teach you manners?\" TAYLOR asks. ");
		}

		else if (dialogue1.equalsIgnoreCase("c")) {
			System.out.println("You take the MACE and SHIELD and look at TAYLOR, saying nothing.\n");
			System.out.println("\"This isn't gonna work if you just keep quiet, " + username + ",\" TAYLOR says. ");
		}

		else {
			System.out.println("You take the MACE and swing at TAYLOR's head, killing her instantly. Next, you turn on ME!?!? OH NO--");
			System.exit(0);
		}

		System.out.print("\"As you know, we are at war with the INFERNONS,\" TAYLOR begins. "
				+ "\n\"As a WARRIOR, you will be on the front lines, stopping them from destroying our home and our way of life.\"\n"
				+ "\nTAYLOR brings a dummy out of a nearby closet.\n"
				+ "\"Let's begin your training,\" she says, \"Soon we'll go outside and kill real things, but not untl you know the basics.\""
				+ "\nTAYLOR grabs her mace and swings hard at the dummy, knocking it to the ground. "
				+ "\n\"That's called the SWING. You SWING by pressing X on your keyboard. Try it yourself.\"\n");
		String training = input.nextLine();
		if (training.equalsIgnoreCase("x")) {
			double chance1 = Math.random() * 11; 
			if (chance1 > 5) {
				System.out.println("You SWING your MACE hard, hitting the dummy and knocking it down."
						+ "\n\"Good job!\" TAYLOR says, clapping. ");
			}

			else {
				System.out.println("You swing the MACE weakly, completely missing the dummy."
						+ "\n\"Oh well,\" TAYLOR says, \"Better luck next time.\"");
			}
		}
		else {
			System.out.println("You throw the MACE on the ground, and run out of the room, never to be seen again. ");
			System.exit(0);
		}
		System.out.println("TAYLOR grabs her shield, and holds it in front of her. "
				+ "\"SWING at me and I'll BLOCK you,\" she instructs you."
				+ "\n[Press X to SWING]");
		String training2 = input.nextLine();
		if (training2.equalsIgnoreCase("x")) {
			System.out.println("You swing your mace at TAYLOR and she blocks you. The MACE makes a loud *thunk* against the solid shield.");
		}
		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}
		System.out.println("\"That's called the BLOCK move,\" TAYLOR explains, \"You can BLOCK by pressing Z on your keyboard.\""
				+ "\n\"It's your turn to BLOCK! I'll swing at you.\" "
				+ "\n[Press Z to BLOCK]");

		String blockTraining = input.nextLine(); 
		if (blockTraining.equalsIgnoreCase("z")) {
			double chance1 = Math.random() * 11; 
			if (chance1 > 5){
				System.out.println("TAYLOR grabs her mace and SWINGS at you.\nYou block her, staggering back with the power of her hit."
						+ "\n\"Great job!\" TAYLOR congratulates you. \"I think you're ready to go out in the real world.\"");
			}

			else {
				System.out.println("TAYLOR swings at you, and you lift your shield halfway. You jump out of the way at the last second. "
						+ "\n\"You were supposed to BLOCK me,\" TAYLOR says with a frown."
						+ "\"You're not quite ready to go out into the real world yet, but we have no choice. Follow me,\" she instructs you.");
			}
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

		System.out.println("You step outside of the room, following TAYLOR. There are birds chirping and the cool wind blows. "
				+ "\nThere are bombs exploding in the distance and you hear the screaming of dying citizens.");
		System.out.println("\"There are some different things we can do,\" TAYLOR says. "
				+ "\n\"We can battle offensively and take one of their forts for ourselves, or we can go help defend our castle. Which would you like to do?\" "
				+ "\nPick a response for TAYLOR: "
				+ "\n(A) I want to battle offensively. "
				+ "\n(B) I want to battle defensively. ");
		String dialogue2 = input.nextLine(); 
		if (dialogue2.equalsIgnoreCase("A")){
			System.out.println("\"I want to take their fort! They don't stand a chance against us,\" you say enthusiastically. "
					+ "\n\"I like your attitude,\" TAYLOR says. "
					+ "[To be continued]");
		}

		else if (dialogue2.equalsIgnoreCase("b")) {
			System.out.println("\"I want to take back what is rightfully ours. Let's go defend our castly,\" you say. "
					+ "\n\"Honorable choice,\" KENDALL says. "
					+ "[To be continued]");
		}

		else {
			System.out.println("You run away, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);

		}
	}
}
