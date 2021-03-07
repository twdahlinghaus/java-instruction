package ui;

import java.util.Scanner;

public class DivviMarbleApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Divvi Marble App!");
		
		
		Scanner sc = new Scanner(System.in);
		
		// variables
		int numberOfMarbles;
		int numberOfKids;
		int marblesPerKid;
		int marblesLeftOver;
		
		// get input from user
		System.out.println("Number of marbles: ");
		numberOfMarbles = sc.nextInt();
		System.out.println("Number of kids: ");
		numberOfKids = sc.nextInt();
		
		// calculate the results
		marblesPerKid = numberOfMarbles / numberOfKids;
		marblesLeftOver = numberOfMarbles % numberOfKids;
		
		// print results
		System.out.println("Give each kid " + marblesPerKid + " marbles.");
		System.out.println("You will have " + marblesLeftOver + " marbles left over.");
		System.out.println();		
		
		System.out.println("Thanks for playing the Divvi Marble App!");

	}

}
