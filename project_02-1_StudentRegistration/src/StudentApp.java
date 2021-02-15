import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Student Registration Form");
        System.out.println();  

        // create the Scanner object
		Scanner sc = new Scanner(System.in);

        // get the student data 
        System.out.print("Enter first name: ");
        String firstName = sc.next();

        System.out.print("Enter last name: ");
        String lastName = sc.next();

        System.out.print("Enter year of birth: ");
        int birthYear = sc.nextInt();

        // create full name and temporary password
        String name = firstName + " " + lastName;
        String password = firstName + "*" + birthYear;

        // display the results
        System.out.println();
        System.out.println("Welcome " + name + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is: " + password);
        
        sc.close();
    } 
}