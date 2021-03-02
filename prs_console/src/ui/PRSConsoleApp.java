package ui;

import java.util.Arrays;

import business.User;
import db.DAO;
import db.UserList;
import db.UserTextFile;
import util.Console;

public class PRSConsoleApp {


private static DAO<User> userDAO = new UserTextFile();

public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App!");
		
		int command = 0;

		
		// 99 is used to leave room for other choices
		while (!(command == 99)) {
			System.out.println();
			System.out.println("Menu:\n"
					+ "============\n"
					+ "1)  List Users\n"					
					+ "2)  Add User\n"
					+ "3)  Get User ID\n"
					+ "99) Exit");
			
			System.out.println();
			
			
			command = Console.getInt("Command?--> ", 0, 100);
			System.out.println();
			switch (command) {
			case 1:
				if (userDAO.getAll().isEmpty()) {
					System.out.println("User list is empty.. add some users!");
				}
				else {
					for (User u: userDAO.getAll()) {
						System.out.println(u);
					}
				}
				break;
				
			case 2:
				int id = Console.getInt("Id?", 0, Integer.MAX_VALUE);
				String un = Console.getRequiredString("User Name? ");
				String pw = Console.getRequiredString("User Password? ");
				String fn = Console.getRequiredString("User First Name? ");
				String ln = Console.getRequiredString("User Last Name? ");
				String pn = Console.getRequiredString("User Phone Number? ");
				String em = Console.getRequiredString("User Email? ");
				String adm = Console.getChoiceString("Admin? (y/n)", "y", "n");
				String rvw = Console.getChoiceString("Reviewer? (y/n)", "y", "n");
				boolean admin = (adm.equalsIgnoreCase("y")) ? true: false;
				boolean reviewer = (rvw.equalsIgnoreCase("y")) ? true: false;
				
				User u = new User(id, un, pw, fn, ln, pn, em, admin, reviewer);
				userDAO.add(u);
				System.out.println("User added");
			
				break;
				
			case 3:
				id = Console.getInt("User ID to retried? ", 0, Integer.MAX_VALUE);
				User user = userDAO.getById(id);
				if (user != null) {
					System.out.println("User Found!");
					System.out.println(user);
				}
				else {
					System.out.println("No user found for id: "+id);
				}
				break;
			}
		}
		
				
		
		System.out.println("See you later!");
		
	{



			
			
		
		
		
	}

	
	}
}

