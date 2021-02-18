
public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Hey there!");
		
		String choice = "y";
				
		while (choice.equalsIgnoreCase("y")) {
			
			
		// Prompt user for shape 'type' (c, s, r)
		String type = Console.getRequiredString("Calculate area of a "+
					"circle, square, or rectangle? (c/s/r) ");
		Shape shape = null;
		
		// Prompt for radius, width, height depending on shape
		switch(type) {
		case "c":
			//circle
			double radius = Console.getDouble("Enter radius: ", 0, Double.MAX_VALUE);
			shape = new Circle(radius);
			break;
		case "s":
			//square
			double width = Console.getDouble("Enter width: ", 0, Double.MAX_VALUE);
			shape = new Square(width);
			break;
		case "r":
			//rectangle
			width = Console.getDouble("Enter width: ", 0, Double.MAX_VALUE);
			double length = Console.getDouble("Enter length: ", 0, Double.MAX_VALUE);
			shape = new Rectangle(width, length);
			break;
		default:
			System.out.println("Invalid shape entry.");
			break;
		}
		
		// print the area
		// For example:  "The area of the rectangle you entered is 300.0"
		String shapeType = shape.getClass().getName();
		double area = shape.getArea();
		System.out.println("The Area of the "+shapeType+" you entered is "+area);
		choice = Console.getChoiceString("Continue? (y/n)", "y", "n");
		
			
		}
		
		
		System.out.println("Bye!  Hope you had fun!!");

	}

}
