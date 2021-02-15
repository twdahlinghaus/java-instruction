import java.util.Scanner;

public class InvoiceApp {

    public static void main(String[] args) {
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice is equal to "y" or "Y"
        String choice = "y";
        
        int invoiceCount = 0;
        double totalInvoiceAmt = 0.0;
        double totalDiscountAmt = 0.0;
        invoiceCount++;
        
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent;
            if (subtotal >= 500) {
                discountPercent = .25;
            }
              else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            totalInvoiceAmt += total;
            totalDiscountAmt += discountAmount;

            // display the discount percent, discount amount and invoice total
            
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";            
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
        
       // display the total # of invoices, average discount percent and average discount amount
        System.out.println("Number of invoices:  "+invoiceCount + "\n");
        System.out.println("Average invoice:  "+totalInvoiceAmt/invoiceCount + "\n");
        System.out.println("Average discount amount:   "+totalDiscountAmt/invoiceCount + "\n");
        
    }
    
    		//Display print out of invoices
}