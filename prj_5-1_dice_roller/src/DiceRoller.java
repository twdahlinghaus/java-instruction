import java.util.Scanner;

public class DiceRoller {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller!");
		
		// Create scanner and string choice
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		// Get input - Roll the dice?
		System.out.println("Roll the dice? (y/n)");
		
		public static int getRandomInt(int limit) {
			double d1 = Math.random() * 6 + 1;
			int randomInt = (int) d1;
			randomInt++;
			return randomInt;
			
		}
		{
		
		//  Roll the dice
		while (choice.equalsIgnoreCase("y")) {
		int die1 = sc.nextInt();
		int die2 = sc.nextInt();
		
			
		//  If two ones rolled, display SNAKE EYES.  If two sixes rolled, display BOX CARS.
				
		
		// See if the user wants to continue
		System.out.println("Roll again? (y/n)");
		choice = sc.next();
				
		
		sc.close();
		System.out.println("Good riddance!");

	}

}
