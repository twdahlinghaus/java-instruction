import java.awt.print.Book;

public class InheritanceDemoApp {

	public static void main(String[] args) {
		System.out.println("Hey!");
		
		
		Product p1 = new Product("java", "Murach's Java", 59.50);
				
		System.out.println(p1.toString());
		
		
		Product p2 = new Product("java","Murach's Java", 59.50);
		System.out.println(p2);
		
		if (p1==p2 ) {
			System.out.println("p1 and p2 point to the same object");
			}
		else {
			System.out.println("p1 and p2 DO NOT point to the same object");
			}
		if (p1.equals(p2)) {
			System.out.println("p1 and p2 have the same state");
			}
		else {
			System.out.println("p1 and p2 DO NOT have the same state");
			}
		
		// p. 265
		// create a book
		Book b1 = new Book("andr", "Murach's Android Programming",
					58.99, "Joel Murach");
		System.out.println(b1);
		
		
		
		System.out.println("Bye!");

	}

}
