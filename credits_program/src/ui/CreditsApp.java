package ui;

public class CreditsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Credits App!");
		// set up film info
		String title = "Sharknado";
		int year = 2013;
		String director = "Anthony Ferrante";
		String role1 = "Fin";
		String actor1 = "Ian Ziering";
		String role2 = "April";
		String actor2 = "Tara Reid";
		String role3 = "George";
		String actor3 = "John Heard";
		String role4 = "Nova";
		String actor4 = "Cassie Scerbo";
				
		// display the info
		System.out.println(title + " (" + year + ")\n" +
			"A " + director + " film.\n\n" +
			role1 + "\t" + actor1 + "\n" +
			role2 + "\t" + actor2 + "\n" +
			role3 + "\t" + actor3 + "\n" +
			role4 + "\t" + actor4 + "\n");
				
		System.out.println("Hope you enjoyed the flick!");

	}

}
