
public class InterfacesApp {

	public static void main(String[] args) {
		System.out.println("What's up?");
		
		Printable p = new Book("java", "Murach's Java Programming", 59.50, "Joel Murach");
		Book b = new book("andr", "Murach's Android Programming", 57.50, "Joel Murach");
		p.print();
		printIt(b);
		
		// p.317 - Clone a Product
		Book seanBook = new book("java", "Murach's Java Programming", 59.50, "Joel Murach");
		Book willBook = seanBook.clone();
		Book willBook = null;
		try {
			Book willBook = (BookseanBook.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Bye!");

	}

	private static void printIt(Printable p) {
		p.print();
	}
	
}
