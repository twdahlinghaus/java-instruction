import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Hey there!  Welcome to the Guessing # Game!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		final int LIMIT = 100;
		
		while (choice.equalsIgnoreCase("y")) {
			// display instructions
			System.out.println("I'm thinking of a number from 1 to "+LIMIT+".");
		    System.out.println("Try to guess it.\n");
			
			// generate random #
			int randNbr = (int)(Math.random()*6)+1;
			int numberGuesses = 0;
			int guess = 0;
			System.out.println("hint: randNbr is "+randNbr);  // this is there to test the condition during development
			
			while (guess != randNbr) {
			// prompt for guess: int
			int guess1 = getIntWithinRange(sc, "Enter number: ", 0, LIMIT+1);
			
			// compare guess vs random #
			// display output to user
			int diff = guess1 - randNbr;
			getGuessVsNumberMessage(numberGuesses, diff);
		}
			
			
			// display output - Did user win?  How far away are they?
			
			
			//  if win - display message
			
			
			
			choice = getChoiceString(sc, "Try Again?", sc, "y", "n");
		}
		
					
		sc.close();
		System.out.println("Thanks for the Playing the Guessing # Game!");
	

	}
	private static String getChoiceString(Scanner sc, String string, Scanner sc2, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}
	private static void getGuessVsNumberMessage(int numberGuesses, int diff) {
		String message = "";
		if(diff < -10) {
			message = " Way too low! Guess again.";
		}
		else if(diff < 0) {
			message = " Too low! Guess again.";
		}
		else if(diff < 10) {
			message = " Way too high! Guess again.";
		}
		else if(diff > 0) {
			message = " Too high! Guess again.";
		}
		else if(diff > 0) {
			// If win - display message
			message = " You got it in "+numberGuesses+" tries.\n";
			message += getWinMessage(numberGuesses);
		}
	}
		private static String getWinMessage(int numberGuesses) {
		String msg = "";
		if (numberGuesses <=3)
			msg = "Great work! You are a mathematical wizard!";
		else if (numberGuesses <=7)
			msg = "Not too bad! You've got some potential.";
		else if (numberGuesses >=7)
			msg = "What took you so long? Maybe you should take some lessons.";
	}
		private static int getInt(Scanner sc, String prompt) {
	        int i = 0;
	        boolean isValid = false;
	        while (!isValid) {
	            System.out.print(prompt);
	            if (sc.hasNextInt()) {
	                i = sc.nextInt();
	                isValid = true;
	            } else {
	                System.out.println("Error! Invalid integer value. Try again.");
	            }
	            sc.nextLine();  // discard any other data entered on the line
	        }
	        return i;
	    }
	    private static int getIntWithinRange(Scanner sc, String prompt,
	            int min, int max) {
	        int i = 0;
	        boolean isValid = false;
	        while (!isValid) {
	            i = getInt(sc, prompt);
	            if (i <= min) {
	                System.out.println("Error! Number must be greater than " + min);
	            } else if (i >= max) {
	                System.out.println("Error! Number must be less than " + max);
	            } else {
	                isValid = true;
	            }
	        }
	        return i;
	        
	        private static String getRequiredString(Scanner sc, String prompt) {
	            String s = "";
	            boolean isValid = false;
	            while (!isValid) {
	                System.out.print(prompt);
	                s = sc.nextLine();
	                if (s.equals("")) {
	                    System.out.println("Error! This entry is required. Try again.");
	                } else {
	                    isValid = true;
	                }
	            }
	            return s;
	        }
	        private static String getChoiceString(Scanner sc, String prompt,
	                String s1, String s2) {
	            String s = "";
	            boolean isValid = false;
	            while (!isValid) {
	                s = getRequiredString(sc, prompt);
	                if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
	                    System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
	                } else {
	                    isValid = true;
	                }
	            }
	            return s;
    }
}
