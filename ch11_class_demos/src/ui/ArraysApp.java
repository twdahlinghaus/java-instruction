package ui;

import java.util.Arrays;

import business.Product;

public class ArraysApp {

	public static void main(String[] args) {
	System.out.println("Hey there, this is Arrays!");
	// p.355
	double[] prices = new double[4];
	
	prices[0] = 5.99;
	prices[1] = 7.55;
	prices[2] = 11.11;
	prices[3] = 25.25;
	//prices[4] = 57.25;  <= not allowed
	
	System.out.println("Item at idx 2: "+prices[2]);
	
	//p.357
	int[] numbers = {5,24,7,9,45,11};
	System.out.println("Array of numbers length = "+numbers.length);
	
	//p.359
	System.out.println("All prices in our array: ");
	for (int i=0; i < prices.length; i ++) {
		System.out.println(i + ", "+prices[i]);
	}
	
	//pp.360-361
	int sum = 0;
	for (int i: numbers) {	
		sum+=i;
		
	}
	System.out.println("sum = "+sum);
	System.out.println("# of elements = "+numbers.length);
	System.out.println("avg = "+(double)sum/(double)numbers.length);
	
	
	//Activate the below later after adding the Product  --- from prior project (was in Ch9 Class Demos before)
	Product p1 = new Product("java", "Murach's Java Progamming", 59.50);
	Product p2 = new Product("mysql", "Murach's My SQL", 55.50);
	Product p3 = new Product("andr", "Murach's Android Progamming", 59.50);
	
	Product[]products = {p1, p2, p3};
	
	
	for (Product p: products) {
		System.out.println(p);
	}
	
	//p.365
	for (int i: numbers) {
		System.out.println(i);
	}
	{ Arrays.sort(numbers);	
	System.out.println("---- sorted ----");
		for (int i: numbers) {
		System.out.println(i);
	}
		for (Product p: products) {
			System.out.println(p);
		}
		{ Arrays.sort(numbers);	
		System.out.println("---- sorted ----");
			for (Product p: products) {
			System.out.println(p);
		}
	
	System.out.println("Ba bye!");

	}

}
	}
	}
