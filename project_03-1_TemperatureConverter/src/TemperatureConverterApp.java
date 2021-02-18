import java.util.Scanner;
import java.text.NumberFormat;

public class TemperatureConverterApp {
    
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Temperature Converter");
        System.out.println();  // print a blank line

        // create the Scanner object
        Scanner sc = new Scanner(System.in);

        // perform conversions until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get Fahrenheit temperature from user
            System.out.print("Enter degrees in Fahrenheit: ");
            double fah = sc.nextDouble();

            // convert Fahrenheit to Celsius
            double cel = (fah - 32) * 5 / 9;

            // format the Celcius output
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            String celString = number.format(cel);

            // display the result of the conversion
            System.out.println("Degrees in Celsius: " + celString + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        sc.close();
    }
}
