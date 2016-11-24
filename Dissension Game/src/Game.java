import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		String username; 
		Scanner input = new Scanner(System.in); 
		player player1 = new player(); 
		
		player1.GreetUserAndGetName();
		player1.ShowPlayerCredentials();
		
		System.out.println("Your name is " + player1.username); 
		
		player1.WhatType();
		
		Jordan assassin = new Jordan(); 
		Kendall mage = new Kendall(); 
		Tayler warrior = new Tayler(); 

		if (player1.type.equalsIgnoreCase("a")) {
			player1.customMethodAssassin(); 
		}

		else if (player1.type.equalsIgnoreCase("b")){
			player1.customMethodMage();
		}

		else if (player1.type.equalsIgnoreCase("c")){
			player1.customMethodWarrior(); 
		}

	}

}
