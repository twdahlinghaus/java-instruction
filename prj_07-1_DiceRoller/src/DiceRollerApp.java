import java.util.Scanner;

public class DiceRollerApp {

	// Psuedo Code
	// 1. Welcome Msg
	// 2. Prompt for input - init choice before "while"
	// 3. Biz Logic -  create an app to roll die randomly from user input if he/she wants to play
	// 4. Display output - Roll dice, die 1, die 2, etc
	// 5. Bye Msg

	public static void main(String[] args) {
		System.out.println("Here we go with the Dice Roller!");
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n)");
		String choice = sc.next();
		
		while (choice.equalsIgnoreCase("y")) {
			// create instance of dice
			Dice dice = new Dice();
			
			// roll the dice
			dice.roll();
			
			// print the result
			System.out.println(dice.getRollResultString());
						
			
			System.out.println("Roll again (y/n)?");
			choice = sc.next();
		}
		
		
		
		
		sc.close();
		System.out.println("Better luck next time!");

	}

}
