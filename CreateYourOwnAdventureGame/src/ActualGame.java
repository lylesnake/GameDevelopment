import java.util.Scanner; 

// Jeremy adding code to do pop up boxes. Start

import javax.swing.JOptionPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.beans.*; //Property change stuff
import java.awt.*;
import java.awt.event.*;
//Jeremy adding code to do pop up boxes. Start

public class ActualGame {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		String username;
		username = GreetUserAndGetName(); 
		
		
		System.out.println("This is a game where you will control your own destiny. ");
		entertoCont();
		System.out.println("Would like to play as (A) an ASSASSIN, (B) a MAGICIAN, or (C) a WARRIOR?");
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

		Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to the Choose Your Own Adventure Game!");
		entertoCont();
		
		System.out.println("What is your name? "); 
		String username = input.nextLine();
		System.out.println("Hello " + username +"!");

		return username;
	}
	
	
	private static void customMethodJordan(String username) {
		Scanner input = new Scanner(System.in);
		System.out.println("You chose to play as an ASSASSIN! \nLet me introduce you to my friend JORDAN.");
		entertoCont();
		System.out.println("JORDAN is a master assassin who will lead you on your adventure.");
		entertoCont();
		System.out.println("JORDAN saunters out from the shadows and shakes your hand.");
		entertoCont();
		System.out.println("\"Hello, " + username + ", \" JORDAN says to you, \"Let's begin training. First, you will need a weapon.\"");
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
				entertoCont();
			}

			else {
				System.out.println("You crouch down and walk towards your enemy. You jump up, but it's too soon. ");
				entertoCont();
				System.out.println("Stop!\" JORDAN interrupts you. \"You've been seen and, consequently, killed by guards. "
						+ "Be slower and quieter next time.\"");
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
			JordanMission1OptionA(dialogue2, username); 
		}
		
		else if (dialogue2.equalsIgnoreCase("b")) {
			JordanMission1OptionB(dialogue2, username); 
		}

		else {
			System.out.println("You run away, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

	}
	
	private static void entertoCont() {
		Scanner input = new Scanner(System.in);	
		System.out.println("[Press ENTER to continue]");
		
		input.nextLine();
		
	}

	private static void JordanMission1OptionA(String dialogue2, String username) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("You lift the paper with the bounty on it. \"Let's go kill this guy,\" you say. ");
		entertoCont();
		System.out.println("JORDAN nods. \"Good choice. That guy is one of the leaders of the invasion. Killing him would really help us.\"");
		entertoCont();
		System.out.println("JORDAN pulls out a map from their knapsack. ");
		entertoCont();
		System.out.println("\"The GENERAL is to the west of here. We will have to spend a couple of days travelling.\"");
		entertoCont();
		System.out.println("You and JORDAN start heading west. It's morning and the sun is behind you. You hear the distant ");
		entertoCont();
		System.out.println("bombs and war cries from the warriors. ");
		entertoCont();
		System.out.println("Suddenly, an enemy soldier appears! JORDAN throws on their cloak and runs to the trees nearby, "
				+ "being cautious that the enemy doesn't see them.");
		entertoCont();
		System.out.println("Make a choice:"
				+ "\n[Press Z to hide with JORDAN] "
				+ "\n[Press X to sneak up and kill the INFERNON SOLDIER]");
		String Fight1 = input.nextLine(); 
		if (Fight1.equalsIgnoreCase("Z")) {
			double chance2 = Math.random() * 11; 
			if (chance2 > 2){
				System.out.println("You throw your cloak over your body and crouch down, following JORDAN into the trees.");
				entertoCont();
			}
			else {
				System.out.println("You throw your cloak over your body and crouch down. ");
				entertoCont();
				System.out.println("While following JORDAN into the trees, you snap a twig. The SOLDIER sees you and fires their gun at you, "
						+ "killing you. ");
				System.exit(0);
			}
		}
		else if (Fight1.equalsIgnoreCase("X")){
			double chance2 = Math.random() * 11; 
			if (chance2 > 6){
				System.out.println("You crouch down low, and stalk up behind the SOLDIER. You prepare your DAGGER and jump up at just the "
						+ "right moment.");
				entertoCont();
				System.out.println("You slit the SOLDIER'S throat. They never saw it coming. ");
				entertoCont();
				System.out.println("The blood gurgles as the SOLDIER tries to breathe, choking on their on blood.");
				entertoCont();
				System.out.println("You walk back over to JORDAN who is smiling proudly at you. ");
				entertoCont();
				System.out.println("\"You'll make a great assassin, " + username + ". Let's keep moving,\" they say to you.\n");
				entertoCont();
			}
			else {
				System.out.println("You crouch down low, and stalk up behind the SOLDIER. You are inches away from them and they have no "
						+ "idea you're there.");
				entertoCont();
				System.out.println("You step on a twig and the SOLDIER whirls around to face you. The SOLDIER shoots you with their gun, "
						+ "killing you instantly.");
				System.exit(0);
			}
		}

		else {
			System.out.println("You do nothing, continuing to stand out in the open. The SOLIDER turns around and sees you. "
					+ "\nThey shoot you with their gun and you die.");
			System.exit(0);
		}
		System.out.println("You and JORDAN keep moving west. Soon, the sun is setting and the day is cooling off.");
		entertoCont();
		System.out.println("\"Are you hungry? I have granola bars,\" JORDAN says, offering you a granola bar. You take it and sit down under a tree. ");
		entertoCont();
		System.out.println("\"We probably shouldn't build a fire. The smoke would give out position away.\" ");
		entertoCont();
		System.out.println("\"Let's also sleep in the trees, that way if INFERNONS come they won't see us,\" JORDAN suggests. ");
		entertoCont();
		System.out.println("You and JORDAN climb into different trees and try to sleep. It takes you a while to sleep. ");
		entertoCont();
		System.out.println("The screaming citizens and the bombs were keeping you up. Eventually, sleep overtakes you."
				+ "\n[To be continued] ");
	}
	
	private static void JordanMission1OptionB(String dialogue2, String username){
		Scanner input = new Scanner(System.in);
		
		System.out.println("You hold up the paper with the request for information. \"I want to help our side get information,\" you say. ");
		entertoCont();
		System.out.println("\"We can definitely do that. Let's see if we can sneak into the Infernon headquarters and find out some of their war "
				+ "plans,\" JORDAN says.");
		entertoCont();
		System.out.println("\"We will have to travel east. There are some old castles there that the Infernons have turned into their headquarters. ");
		entertoCont();
		System.out.println("You and JORDAN start heading east. It's morning and the sun is in front of you. You hear the distant bombs and war cries "
				+ "from the warriors. ");
		entertoCont();
		System.out.println("Suddenly, an enemy soldier appears! JORDAN throws on their cloak and runs to the trees nearby, being cautious that the "
				+ "enemy doesn't see them.");
		entertoCont();
		System.out.println("Do you want to (Z) hide with JORDAN or (X) sneak up and kill the INFERNON SOLDIER? ");
		String Fight1 = input.nextLine(); 
		if (Fight1.equalsIgnoreCase("Z")) {
			double chance2 = Math.random() * 11; 
			if (chance2 > 2){
				System.out.println("You throw your cloak over your body and crouch down, following JORDAN into the trees.\n");
			}
			else {
				System.out.println("You throw your cloak over your body and crouch down. While following JORDAN into the trees,");
				entertoCont();
				System.out.println("you snap a twig. The SOLDIER sees you and fires a gun in your direction. ");
				entertoCont();
				System.out.println("JORDAN keeps running, and eventually flanks the soldier, who is approaching you with a giant SWORD. ");
				entertoCont();
				System.out.println("JORDAN takes out their DAGGER and stabs the SOLDIER in the back, saving your life. ");
				entertoCont();
				System.out.println("\"Let's keep moving, shall we?\" JORDAN says. You nod and follow them.\n");
				entertoCont();
			}
		}
		else if (Fight1.equalsIgnoreCase("X")){
			double chance2 = Math.random() * 11; 
			if (chance2 > 6){
				System.out.println("You crouch down low, and stalk up behind the SOLDIER. You prepare your DAGGER and jump up at just the "
						+ "right moment.");
				entertoCont();
				System.out.println("You slit the SOLDIER'S throat. They never saw it coming. ");
				entertoCont();
				System.out.println("The blood gurgles as the SOLDIER tries to breathe, choking on their on blood.");
				entertoCont();
				System.out.println("You walk back over to JORDAN who is smiling proudly at you. ");
				entertoCont();
				System.out.println("\"You'll make a great assassin, " + username + ". Let's keep moving,\" they say to you.");
				entertoCont();
			}
			else {
				System.out.println("You crouch down low, and stalk up behind the SOLDIER. You are inches away from them and they have no "
						+ "idea you're there.");
				entertoCont();
				System.out.println("You hear a hiss behind you and turn around, wondering what that noise was. It's JORDAN shaking their head 'no.' ");
				entertoCont();
				System.out.println("You back away from the SOLDIER slowly, letting them walk away.");
				entertoCont();
				System.out.println("\"You're not ready for that!\" JORDAN whisper yells at you once the SOLDIER is out of earshot. ");
				entertoCont();
				System.out.println("\"You would've gotten both of us killed. Just follow my lead, " + username + ". Now let's keep moving.\"\n ");
				entertoCont();
			}
		}

		else {
			System.out.println("You do nothing, continuing to stand out in the open. The SOLIDER turns around and sees you. "
					+ "\nThey shoot you with their gun and you die.");
			System.exit(0);
		}
		System.out.println("You and JORDAN keep moving east. Soon, the sun is setting and the day is cooling off.");
		entertoCont();
		System.out.println("\"Are you hungry? I have granola bars,\" JORDAN says, offering you a granola bar. You take it and sit down "
				+ "under a tree. ");
		entertoCont();
		System.out.println("\"We probably shouldn't build a fire. The smoke would give out position away.\" ");
		entertoCont();
		System.out.println("\"Let's also sleep in the trees, that way if INFERNONS come they won't see us,\" JORDAN suggests. ");
		entertoCont();
		System.out.println("You and JORDAN climb into different trees and try to sleep. It takes you a while to sleep. ");
		entertoCont();
		System.out.println("The screaming citizens and the bombs were keeping you up. Eventually, sleep overtakes you.");
		entertoCont();
		System.out.println("\"Wake up!\" someone shouts at you. You are dreaming and you can hear their voice in your dream. ");
		entertoCont();
		System.out.println("You are shaking and your dream world is falling apart. You open your eyes. It's JORDAN. ");
		entertoCont();
		System.out.println("\"Get up, we got shit to do,\" JORDAN says. They have their bags packed and are strapping their boots back on "
				+ "their feet.");
		entertoCont();
		System.out.println("You get up and take a drink of water from your canteen. Soon, you and JORDAN are on the road again. ");
		entertoCont();
		System.out.println("After a while, you come across a camp of what looks like Infernon soldiers. They have several tents surrounding "
				+ "a campfire. ");
		entertoCont();
		System.out.println("It almost looks cozy until you remember that these are deadly soldiers that want to kill you. ");
		entertoCont();
		System.out.println("You and JORDAN take cover in some nearby trees to plan your attack.");
		entertoCont();
		System.out.println("\"See the big tent with the table?\" JORDAN asks you. You nod. ");
		entertoCont();
		System.out.println("\"That's where the general keeps her books. The books have the information we need,\" JORDAN explains. ");
		entertoCont();
		System.out.println("\"We'll need to get through all of the soldiers, first,\" you notice. ");
		entertoCont();
		System.out.println("\"How do you propose we do that?\" JORDAN asks. ");
		entertoCont();
		System.out.println("Choose a plan of attack: "
				+ "\n(A) Ambush the soldiers and take them all at once, take the journal after every last one of them is dead and bleeding"
				+ "\n(B) Sneak up on the few soldiers guarding the tent and slit their throats, taking the journal stealthily "
				+ "\n(C) Wait until nightfall and then sneak into the general's tent and steal the journal, not killing anyone");
			String planOfAttack1 = input.nextLine(); 
			if (planOfAttack1.equalsIgnoreCase("a")){
				System.out.println("You don't even wait for JORDAN to follow you. ");
				entertoCont();
				System.out.println("You jump into the middle of the soldiers' camp and they notice you at once.");
				entertoCont();
				System.out.println("You stab a soldier on your right, and then another on your left. You feel the warm blood of your opponents "
						+ "on your arms and face.");
				entertoCont();
				System.out.println("JORDAN is shouting at you but you ignore them. Killing these Infernons is all that matters. ");
				entertoCont();
				System.out.println("Someone comes up to you and punches you before your knife can reach their throat. ");
				entertoCont();
				System.out.println("\"Finally, a real opponent,\" you challenge the soldier in front of you. ");
				entertoCont();
				System.out.println("\"You will die tonight, Portum scum,\" the soldier growls. "				
						+ "\n[Press x to stab your opponent]"); 
				String stab1 = input.nextLine(); 
				if (stab1.equalsIgnoreCase("x")) {
					double chance3 = Math.random() * 11;
					if (chance3 > 4) {
						System.out.println("Your knife connect with the soldier's arm and they grunt in pain."); 
						entertoCont();
					}
					else if (chance3 < 4) {
						System.out.println("You swing your knife at your opponent but you miss, and they sink their blade deep into your abdomen. "
								+ "You bleed to death. ");
						System.exit(0); 
					}
					
				}
				
				else {
					System.out.println("You swing your knife at your opponent but you miss, and they sink their blade deep into your abdomen.");
					System.exit(0); 
				}
				
				System.out.println("[to be continued]");
			}
	}
	
	
	private static void customMethodKendall(String username) {
		Scanner input = new Scanner(System.in);
		System.out.println("You chose to play as a MAGICIAN! \nLet me introduce you to my friend KENDALL.");
		entertoCont();
		System.out.println("KENDALL is a wise mage who will lead you on your adventure.");
		entertoCont();

		System.out.println("KENDALL appears in a puff of smoke that smells strangely of pancakes. ");
		entertoCont();
		System.out.println("\"Greetings, " + username + ". My name is KENDALL. I will train you in the ways of the MAGICIAN.\"");
		entertoCont();
		System.out.println("KENDALL reaches into a bag on his waist and hands you a STAFF. ");
		entertoCont();
		System.out.println("\"This STAFF can help you with all of the powerful spells. ");
		entertoCont();
		System.out.println("I see you already have an aptitude for FIRE MAGICK. Show me your skills, apprentice.\"");
		entertoCont();

		System.out.println("Choose a response for KENDALL: "
				+ "\n(A) I think I know what I'm doing. *Shoot a weak blast of FIRE MAGICK at the wall.* "
				+ "\n(B) Why do I need to know MAGICK? What's going on here? "); 
		String dialogue1 = input.nextLine();

		if (dialogue1.equalsIgnoreCase("a")) { 
			System.out.println("\"I think I know what I'm doing,\" you say. ");
			entertoCont();
			System.out.println("You step to the side of KENDALL, and aim your hands at the wall. ");
			entertoCont();
			System.out.println("A weak blast of FIRE MAGICK bursts from you, slightly toasting the wall. ");
			entertoCont();
			System.out.println("\"Excellent!\" KENDALL cheers.");
			entertoCont();
		}

		else if (dialogue1.equalsIgnoreCase("b")) {
			System.out.println("You look at KENDALL with a very confused look on your face. "); 
			entertoCont();
			System.out.println("\"Why do I need to know MAGICK?\" you ask, \"What's going on here?\"  ");
			entertoCont();
			System.out.println("\"I'm not going to report you for knowing MAGICK,\" KENDALL assures you. ");
			entertoCont();
		}

		else {
			System.out.println("You aim your hands at KENDALL's head and shoot a blast of FIRE MAGICK at him, killing him instantly. "
					+ "\nNext, you turn on ME!?!? OH NO--");
			System.exit(0);
		}	

		System.out.println("\"We are on a mission to save our planet from the invading INFERNONS,\" KENDALL explains. ");
		entertoCont();
		System.out.println("\"In order for you to be of any help to us at all, you'll require training. I will teach you two basic spells.\"");
				entertoCont();
		System.out.println("KENDALL aims his STAFF at the wall and shoots a powerful blast of FIRE MAGICK at the it. "
				+ "The flame leaves the wall blackened.");
		entertoCont();
		System.out.println("\"That's called FLAME. You can do it by pressing X on your keyboard. Show me your skill, apprentice.\""
				+ "\n[Press X]");
		String fire1 = input.nextLine(); 

		if (fire1.equalsIgnoreCase("x")) {
			double chance1 = Math.random() * 11; 
			if (chance1 > 5){
				System.out.println("You lift your STAFF, aim at the wall, and shoot a powerful FLAME blast, knocking yourself down with your "
						+ "own force.");
				entertoCont();
				System.out.println("\"Incredible,\" KENDALL says.");
				entertoCont();
			}

			else {
				System.out.println("A weak puff of smoke comes out of your STAFF. KENDALL looks puzzled.");
				entertoCont();
				System.out.println("\"I didn't think this would be so difficult for you, " + username +",\" he says, frowning.");
				entertoCont();
			}
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again.");
			System.exit(0);
		}

		System.out.println("KENDALL raises his STAFF above his head and begins to glow. His expression becomes peaceful. ");
		entertoCont();
		System.out.println("\"What I just did was called HEALING. You can do it, too. Just press Z on your keyboard."
				+ "\n[Press Z]");
		String healing1 = input.nextLine(); 
		if (healing1.equalsIgnoreCase("z")) {
			System.out.println("You lift your STAFF above your head, willing it to heal you. ");
			entertoCont();
			System.out.println("Almost immediately, you feel your muscles rejuvnate and your mind clear.");
			entertoCont();
		}

		else {
			System.out.println("You run out of the room, yelling \"NOPE! NOPE! NOPE!\" never to be seen again. ");
			System.exit(0);
		}

		System.out.println("KENDALL smiles proudly at you. ");
		entertoCont();
		System.out.println("\"You're doing incredibly well at this training, " + username + "! I think you are ready to go out into the real world.");
		entertoCont();
		System.out.println("Be warned, though, this is a warzone. Follow me!\" ");
		entertoCont();
		System.out.println("KENDALL opens the door of the training room and steps outside. You follow him. There are birds chirping and the cool wind blows. ");
		entertoCont();
		System.out.println("There are bombs exploding in the distance and you hear the screaming of dying citizens.");
		entertoCont();
		System.out.println("\"We have a couple of different things we can do,\" KENDALL tells you. ");
		entertoCont();
		System.out.println("\"We can go heal warriors in battle, or we can go on the offensive and battle alongside the warriors. What do you say?\""
				+ "\nChoose a response for KENDALL: "
				+ "\n(A) I want to heal warriors. "
				+ "\n(B) I want to go on the offensive. ");
		String dialogue2 = input.nextLine(); 
		if (dialogue2.equalsIgnoreCase("a")) {
			System.out.println("\"I want to heal our warriors. Being on the front lines isn't my thing,\" you say. ");
			entertoCont();
			System.out.println("\"Fair enough. It's not fun for me, either. Let's go!\" KENDALL says.");
			entertoCont();
			System.out.println("KENDALL starts heading north, and you follow. The sounds of the bombs are getting louder with each passing hour.");
			entertoCont();
			System.out.println("After about three hours of walking, you and KENDALL approach a large, wartorn castle. ");
			entertoCont();
			System.out.println("\"That used to be the home of our queen, but the INFERNON KING publicly executed her a few days ago,\" KENDALL says, point at the castle."); 
			entertoCont();
			System.out.println("\"I've heard rumors that her young son still lives. If that's true, then he is who we fight for.\"");
			entertoCont();
			System.out.println("\"Let's hurry and get to the infirmary,\" KENDALL says. He runs inside the castle, ignoring the loud bombs from the neary battlefield. ");
			entertoCont();
			System.out.println("The infirmary is upstairs and the left. There are soldiers in various states of disrepair.");
			entertoCont();
			System.out.println("\"Find someone and help them!\" a magician orders you.\n");
			entertoCont();
			System.out.println("You see a soldier with a broken leg lying on the floor by the wall, moaning in pain. \n"
					+ "[Press A to approach the wounded soldier]"); 
			String approach = input.nextLine(); 

			if (approach.equalsIgnoreCase("a") ){
				System.out.println("You rush over to the soldier who has broken her leg. ");
				entertoCont();
				System.out.println("\"Ohhh it hurts,\" she moans."
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
