import java.text.NumberFormat;
import java.util.Scanner;

public class TempConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Converter App!");
		System.out.println();  // print a blank line

		
		// create the Scanner object
        Scanner sc = new Scanner(System.in);
		
		
      //Enter degrees in F		
     // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from the user
            System.out.print("Enter Temp in Fahrenheit: ");
            double fah = sc.nextDouble();
            

            // calculate the conversion to Celcius
            double cel = (fah-32) * 5/9;
            
            // format the celcius output
            NumberFormat number = NumberFormat.getInstance();
            number.setMaximumFractionDigits(2);
            String celString = number.format(cel);
            

            // display the result
            System.out.println("Degrees in Celcius:         "+ celString + "\n");
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();
		
			
		
		
		System.out.println("Goodbye!");
	}

}
