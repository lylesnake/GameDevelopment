import java.util.Scanner;

public class player {

	//player's stats at the beginning of the game
	int level = 1; 
	int stanima = 100;
	int magicka = 100;
	int health = 100;
	int xp = 0; 
	String username;
	String type; 
	
	/* 
	 * I want to design a system that keeps track of experience (or xp for short). 
	 * Each mission earns so much xp which contributes to the player's level. 
	 * The higher the level of the player,
	 * the more missions they can go on and items they can acquire. 
	 * It's basically an awards system that motivates people to play. 
	 * -- Lyle
	 * 
	 */

	//this method learns and stores the player's name
	public void GreetUserAndGetName() {
		Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to the Choose Your Own Adventure Game!");
		System.out.println("What is your name? "); 
		username = input.nextLine();
		System.out.println("Hello " + username +"!");
		input.nextLine();

	}
	
	//this method has the ability to print the player's stats
	public void ShowPlayerCredentials() {
		System.out.println("You are level " + level);
		System.out.print("You have " + health + " health out of "); PlayerTotals(level); System.out.println(" possible health.");
		System.out.print("You have " + magicka + " magicka out of "); PlayerTotals(level); System.out.println(" possible magicka.");			
		System.out.print("You have " + stanima + " stanima out of "); PlayerTotals(level); System.out.println(" possible stanima.");
		System.out.println("You have " + xp + " xp");
	}


	//this method keep track of all the xp the player acquires
	public void addXP(int i) {
		xp = i + xp; 
		System.out.println("You now have " + xp + " xp");
	}

	
	//this method keeps track out how much health, stanima, and magicka the player can have
	public void PlayerTotals(int level) {
		int total = 100 * level; 
		System.out.print(total);
	}

	
	//here's where the actual gameplay begins
	
	//find out how to player wants to play
	public void WhatType(){
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to play as (A) an assassin (B) a mage or (C) a warrior?");
		type = input.nextLine(); 
		if (type.equalsIgnoreCase("a")){
			System.out.println("So, you're an assassin?");
		}
		else if (type.equalsIgnoreCase("b")){
			System.out.println("So, you're a mage?");
		}
		else if (type.equalsIgnoreCase("c")){
			System.out.println("So, you're a warrior?");
		}
	}

	//for assassins 
	public void customMethodAssassin() {
		Scanner input = new Scanner(System.in);
		System.out.println("You chose to play as an ASSASSIN! \nLet me introduce you to my friend JORDAN.");
		entertoCont();
		System.out.println("JORDAN is a master assassin who will lead you on your adventure.");
		entertoCont();
		System.out.println("JORDAN saunters out from the shadows and shakes your hand.");
		entertoCont();
		System.out.println("\"Hello," + username + ", \" JORDAN says to you, \"Let's begin training. First, you will need a weapon.\"");
		entertoCont();
		System.out.println("JORDAN reaches into a knapsack on their back and hands you a beautiful ebony DAGGER and a CLOAK.");
		entertoCont();
		System.out.println("\"Here is a DAGGER. This is the weapon of the ASSASSIN. The CLOAK will hide you as you stalk your enemies.\" ");
		entertoCont();

		System.out.println("Choose a response for JORDAN: "
				+ "\n(A) Thank you for the equipment. What is our mission?"
				+ "\n(B) Why do I need this stuff? What's going on?"
				+ "\n(C) Say nothing. ");
		String dialogue1 = input.nextLine();

		if (dialogue1.equalsIgnoreCase("a")) { 
			System.out.println("\"Thank you for the equipment, \" you say, \"What's our mission?\" ");
			entertoCont();
			System.out.println("JORDAN smiles at you and says, ");
			entertoCont();
		}

		else if (dialogue1.equalsIgnoreCase("b")){
			System.out.println("You look at the equipment in your arms, very confused. "
					+ "\n\"Why do I need this stuff?\" you ask, \"What's going on?\" ");
			entertoCont();
			System.out.println("\"Not even a thank you?\" JORDAN asks. ");
			entertoCont();
		}

		else if (dialogue1.equalsIgnoreCase("c")) {
			System.out.println("You look at the equipment in your arms and look back up at JORDAN, saying nothing." );
			entertoCont();
			System.out.println("\"You're a quiet one, eh?\" JORDAN says to you. ");
			entertoCont();
		}

		else {
			System.out.println("You take the dagger and stab JORDAN, killing them instantly. Next, you turn on ME!?!? OH NO--");
			System.exit(0);
		}
		System.out.println("\"I will be training you to help save our planet from the invasion of the INFERNONS,\" JORDAN explains. ");
		entertoCont();
		System.out.println("\"You have been chosen because you seem to have a special aptitude for mischief.\"");
		entertoCont();
		System.out.println("JORDAN brings a dummy out of a nearby closet. ");
		entertoCont();
		System.out.println("\"It's time to train,\" they say. They crouch down, out of sight of the target, "
				+ "creep slowly behind the dummy, and slit its throat. ");
		entertoCont();
		System.out.println("\"This is called the STALK ATTACK. You can do it by pressing X on your keyboard. Try it out!\"");
		System.out.println("[Press X]");
		String stalk_attack1 = input.nextLine(); 
		if (stalk_attack1.equalsIgnoreCase("x")) {
			double chance1 = Math.random() * 11; 
			if (chance1 > 5) {
				System.out.println("You crouch down and slowly approach the dummy. When you're sure the target cannot see you, "
						+ "you jump up and slit its throat.");
				entertoCont();
				System.out.println("\"Great job!\" JORDAN crongratulates you. ");
				addXP(10); //winning the training gets more xp
				entertoCont();
			}

			else {
				System.out.println("You crouch down and walk towards your enemy. You jump up, but it's too soon. ");
				entertoCont();
				System.out.println("Stop!\" JORDAN interrupts you. \"You've been seen and, consequently, killed by guards. "
						+ "Be slower and quieter next time.\"");
				addXP(5); //i didn't want to not let the player earn points for losing, especially since it's all chance
				entertoCont();
			}
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

		System.out.println("\"Next, I will show you how to HIDE,\" JORDAN says, \"Simply wear your CLOAK and hide somewhere. ");
		entertoCont();
		System.out.println("If you're eavesdropping, make sure you remember what you hear.\"");
		entertoCont();
		System.out.println("JORDAN puts on their cloak and steps back out of your sight, into the shadows. ");
		entertoCont();
		System.out.println("You can see them, of course, but only because you know they're there.");
		entertoCont();
		System.out.println("\"Press Z to put on your cloak and hide,\" JORDAN instructs. ");
		System.out.println("[Press Z]");
		String hide1 = input.nextLine(); 
		if (hide1.equalsIgnoreCase("z")) {
			System.out.println("You put your cloak on and throw the hood up. You see a corner in the room that is hidden by shadows "
					+ "and stand there.");
			entertoCont();
			System.out.println("\"Good job,\" JORDAN says, \"You can come out now\"");
			addXP(15); //i want the player to hit level two at 20 xp (after training)
			entertoCont();
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

		System.out.println("\"I think your training is complete, " + username + ",\" JORDAN says.");
		entertoCont();
		System.out.println("\"Let's go out into the real world and help defend our home.\"");
		entertoCont();
		System.out.println("JORDAN walks out of the training room and you follow them. There are birds chirping and the cool wind blows. ");
		entertoCont();
		System.out.println("There are bombs exploding in the distance and you hear the screaming of dying citizens.\n");
		entertoCont();

		System.out.println("\"We have a couple of options on what we can do right now,\" JORDAN informs you. They hand you two pieces of paper.");
		entertoCont();
		System.out.println("One of the papers is a bounty for an INFERNON GENERAL. The other is asking for sensitive information. ");
		entertoCont();
		System.out.println("Both offer rewards of decent sizes.");
		entertoCont();
		System.out.println("\"Which would you like to do?\" JORDAN asks. ");
		entertoCont();
		System.out.println("Choose a response for JORDAN: "
				+ "\n(A) I would like to kill the INFERNON GENERAL. "
				+ "\n(B) I would like to find information.");

		String dialogue2 = input.nextLine(); 

		if (dialogue2.equalsIgnoreCase("a")) {
			JordanMission1OptionA(dialogue2); 
		}

		else if (dialogue2.equalsIgnoreCase("b")) {
			JordanMission1OptionB(dialogue2); 	
		}

	}

		
	public void JordanMission1OptionA(String dialogue2) {
		
	}

	public void JordanMission1OptionB(String dialogue2) {
		
	}


	public void customMethodMage() {
		
		
	}
	
	public void customMethodWarrior() {
		
		
	}

	public void entertoCont() {
		Scanner input = new Scanner(System.in);	
		System.out.println("[Press ENTER to continue]");
		input.nextLine();
	}




}
