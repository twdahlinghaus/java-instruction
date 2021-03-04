package ui;

import util.Console;

public class BowlingScoresFunApp1 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bowling Scores Fun App!");
		
		
		String nextBowler;
		nextBowler = "y";
		while (nextBowler.equalsIgnoreCase("y")) {
		
		// Prompt for user input
		int bowlingScore = Console.getInt("Enter your score to find out your level (Your score must be between 0 and 300): ", -1, 301);
			System.out.println();
		
		// Setup the output for scores
		if (bowlingScore >= 1 && bowlingScore <= 100) {
			System.out.println("You're still a beginner but you're getting better!");

		}

		else if (bowlingScore >= 101 && bowlingScore <= 150) {
			System.out.println("You're not quite done with being a beginner yet!");

		}
		else if (bowlingScore >= 151 && bowlingScore <= 175) {
			System.out.println("You're becoming more advanced!  Strike it up and get more spares!!");

		 }
		else if (bowlingScore >= 176 && bowlingScore <= 200) {
			System.out.println("You're way advanced!  Can you do it again?  I bet you're getting lucky!");

		}
		else if (bowlingScore >= 201 && bowlingScore <= 250) {
			System.out.println("If you're shooing this regularly then you need to think about being a pro.  Uhm...yeah!");

		}
		else if (bowlingScore >= 251 && bowlingScore <= 299) {
			System.out.println("If you really are shooting these kind of scores then go try some sport shots and compete in some pro tourneys!");

		}
		else if (bowlingScore == 300) {
			System.out.println("PERFECT GAME!  You're alright.  Keep it up.");
		}
		else {
		 	System.out.println("Really?  You got all gutter balls?  Or they didn't set up any pins at all?");
		}		
		 	
			System.out.println();
			nextBowler = Console.getChoiceString("Enter another score? (y/n)", "y", "n");
		
	}
		System.out.println("Thanks for playing!");

}
}
