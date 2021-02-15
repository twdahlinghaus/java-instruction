
public class StringsApp {

	public static void main(String[] args) {
		System.out.println("What's up Strings?!");

			//Ways to string stuff
			String firstName = "Bob";
			System.out.println(firstName);
			String lastName = "Marley";
			System.out.println(firstName + " " + lastName);
			
			String fullName = firstName + " " + lastName;
			System.out.println(fullName);
			
			fullName = "Sarah";
			
			fullName += " Connor";
			System.out.println(fullName);
			
			//CONCAT a String and a primitive
			fullName += 5;
			System.out.println(fullName);
			
			//p.51 escape sequences
			String msg = "This is going to suck\n"
					+ " really, really bad!";
					System.out.println(msg);
			
					
		
		System.out.println("Ba Bye!");
		

	}

}
