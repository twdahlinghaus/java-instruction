import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class NumberClassesApp {

	public static void main(String[] args) {
		System.out.println("Good to see you!");

		//p.101 - wrapper classes
		int n1 = 11;
		Integer int1 = new Integer(n1);
		
		System.out.println(int1);
		
		String n2 = "22";
		
		int nbr2 = Integer.parseInt(n2);
		System.out.println(nbr2 + n1);
		
		//p.103 Math class
				double x = 10.315;
		// round x
		System.out.println(Math.round(x));
		// round to the hundredth place (multiply by 100, round, then divide by 100)
		System.out.println((double)Math.round(x*100) / 100);
		
		// max / min:  m1, nbr2
		
		System.out.println(Math.max(n1, nbr2));
		System.out.println(Math.min(n1, nbr2));
		
		// random - print a random number
		System.out.println(Math.random());
		// die roll, 1 to 6
		System.out.println((int)(Math.random()*6)+1);
		// guess the number 1 to 100
		System.out.println((int)(Math.random()*100)+1);
		
		//p.105 - formatting
		double price = 9999.432;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println(currency.format(price));
		
		double interest = .3576;
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(2);
		System.out.println(percent.format(interest));
		
		//p.11 - BigDecimal
		BigDecimal subtotal = new BigDecimal("100.05");
		BigDecimal discountPercent = new BigDecimal(".1");
		
		final BigDecimal SALES_TAX_PCT = new BigDecimal(".05");
		
		BigDecimal discountAmount = subtotal.multiply(discountPercent);
		System.out.println(discountAmount);
		discountAmount = discountAmount.setScale(2, RoundingMode.HALF_UP);
		System.out.println(discountAmount);
		
		BigDecimal totalBeforeTax = subtotal.subtract(discountAmount);
		BigDecimal salesTax = totalBeforeTax.multiply(SALES_TAX_PCT);
		salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
		BigDecimal total = totalBeforeTax.add(salesTax);
		System.out.println(total);
		
		
		
		
		
		System.out.println("Ba bye!");
	}

}
