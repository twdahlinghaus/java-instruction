import java.util.Scanner;

public class RelationalOperatorsApp {

	public static void main(String[] args) {
		System.out.println("Hey there from Relational App!!");

		// p. 121 relational operators

		int n1 = 77;
		int n2 = 77;

		if (n1 == n2) {
			System.out.println("same");
		} else {

			System.out.println("not the same");

		}
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		// technically this shouldn't work
		if (str1 == str2 ) {
			System.out.println("string same");
			
		// THIS IS HOW YOU SHOULD DO IT
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("strings contain the same data");
		}
		
		// boolean in a while loop
		boolean isValid = false;
		// loop until user enters 'stop'
		Scanner sc = new Scanner(System.in);
		String action = "";
		while (!isValid) {
			System.out.println("Action? ");
			action = sc.next();
			if (action.equalsIgnoreCase("stop")) {
				isValid = true;
		
		// AFTER RUNNING THIS, YOU MUST TYPE SOMETHING AND THEN HIT 'ENTER' TO TEST THE LOOP.  HIT 'STOP' TO QUIT THE LOOP.
			}
		}
		
		
		}
		
		System.out.println("Ba bye");

	}

}
