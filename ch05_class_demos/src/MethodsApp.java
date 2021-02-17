import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printWelcomeMessage();
		printWelcomeMessage("Tom");
		System.out.println("55.7 / 6.2 = " + divide(55.7, 6.2));

		int n1 = getInt("Enter a whole number: ", sc);
		int n2 = getInt("Enter another whole number: ", sc);
		System.out.println("Sum of numbers [" + n1 + ", " + n2 + "] = " + (n1 + n2));
		
		double d1 = getDouble("Enter a decimal value:  ", sc);
		System.out.println("Decimal entered: "+d1);
		
		// p.165 - NullPointerException - look over that and add it in to try it
		
		
		System.out.println("Laterz!");
		sc.close();

	}

	// p.153 - static method no parms and no return
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the Methods App!!");
	}
	// static method with 1 parameter and no return

	private static void printWelcomeMessage(String name) {
		System.out.println("Welcome, " + name + ", to the Methods App!!");
	}

	// static method with 2 params and return
	private static double divide(double d1, double d2) {
		return d1 / d2;
	}

	// prompt user for whole # and return that whole #
	// use exception handling
	private static int getInt(String prompt, Scanner sc) {
		int nbr = 0;
		boolean isValid = false;
		while (!isValid) {
			try {
				System.out.print(prompt);
				nbr = sc.nextInt();
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid entry.  Must be a whole number.");
				// clear input from scanner
				sc.nextLine();
			}
		}
		return nbr;
	}

	// prompt for a decimal and return it... using data validation
	private static double getDouble(String prompt, Scanner sc) {
		double d = 0.0;
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;

			}

			else {
				System.out.println("Invalid entry.  Must be a decimal.");
				sc.next();
			}


		}
		return d;
	}
}