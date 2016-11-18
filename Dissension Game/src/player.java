import java.util.Scanner;

public class player {

	//player's stats at the beginning of the game
	int level = 1; 
	int stanima = 100;
	int magicka = 100;
	int health = 100;
	String username;
	String type; 
	
	//this method learns and stores the player's name
	public void GreetUserAndGetName() {
		Scanner input = new Scanner(System.in); 
		System.out.println("Welcome to the Choose Your Own Adventure Game!");
		System.out.println("What is your name? "); 
		username = input.nextLine();
		System.out.println("Hello " + username +"!");
		input.nextLine();

	}
	
	//this method keeps track out how much health, stanima, and magicka the player can have
	public void PlayerTotals(int level) {
		int total = 100 * level; 
		System.out.print(total);
	}
	
	//this method has the ability to print the player's stats
	public void ShowPlayerCredentials() {
		System.out.println("You are level " + level);
		System.out.print("You have " + health + " health out of "); PlayerTotals(level); System.out.println(" possible health.");
		System.out.print("You have " + magicka + " magicka out of "); PlayerTotals(level); System.out.println(" possible magicka.");
		System.out.print("You have " + stanima + " stanima out of "); PlayerTotals(level); System.out.println(" possible stanima.");
		
	}
	
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
	
	
}
