import java.util.Scanner;

public class SwitchStatementApp {

	public static void main(String[] args) {
		System.out.println("Hey there from Switch Statement App!");

		Scanner sc = new Scanner(System.in);
		String direction = "";

		while (!direction.equalsIgnoreCase("x")) {

			// p. 129
			System.out.println("You've come to an intersection.  Which way do you want to go?");
			System.out.println("N - North");
			System.out.println("S - South");
			System.out.println("E - East");
			System.out.println("W - West");
			System.out.println("X - Exit");
			direction = sc.next();

			switch (direction) {
			case "N":
			case "n":
				System.out.println("North...  ice, snow!!!");
				break;
			case "S":
			case "s":
				System.out.println("South...  eaten, Bigfoot!!!");
				break;
			case "E":
			case "e":
				System.out.println("East...  fallen into water, secret pond!!!");
				break;
			case "W":
			case "w":
				System.out.println("West...  burned, lava from erupted volcano!!!");
				break;
			case "X":
			case "x":
				// do nothing, code will exit
				break;
			}

		}

		System.out.println("Bye!");
	}
}