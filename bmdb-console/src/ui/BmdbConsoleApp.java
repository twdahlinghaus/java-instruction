package ui;

import java.io.*;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import util.Console;
import business.Actor;
import business.Movie;
import db.ActorDB;
import db.DAO;
import db.DAOUploadable;
import db.MovieDB;
import db.MovieTextFile;

public class BmdbConsoleApp {
	private static DAOUploadable<Movie> movieDAO = new MovieDB();
	private static DAOUploadable<Actor> ActorDAO = new ActorDB();

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the Bootcamp Movie Database!");
		String command = "";
		
		while (!command.equalsIgnoreCase("exit")) {
			System.out.println("MENU: ");
			System.out.println("1 - show all movies");
			System.out.println("2 - add a movie");
			System.out.println("3 - get a movie");
			System.out.println("4 - delete a movie");
			System.out.println("5 - upload a movie");
			System.out.println("6 - show all actors/actresses");
			System.out.println("7 - add an actor/actress");
			System.out.println("8 - get an actor/actress");
			System.out.println("9 - delete an actor/actress");
			System.out.println("10 - upload an actor/actress");
			System.out.println("99 - exit app");
			int[] validEntries = {1, Integer.MAX_VALUE};
			command = Console.getRequiredString("Command: ");
			switch (command) {
			case "1":
				// read all records from file and print to screen
				List<Movie> movies = movieDAO.getAll();
				System.out.println("Movie List:");
				System.out.println("===========");
				if (movies.size()!= 0) {
					for (Movie m: movies) {
						System.out.println(m);
					}
				}
				else { 
						System.out.println("Movie file empty.");
				}
				break;
			case "2":
				// prompt user for all fields for a new movie
				System.out.println("Add a Movie:");
				System.out.println("============");
				//int id = Console.getInt("ID: ", 0, Integer.MAX_VALUE);
				String title = Console.getRequiredString("Title: ");
				String rating = Console.getRequiredString("Rating: ");
				int year = Console.getInt("Year: ", 0, Integer.MAX_VALUE);
				String director = Console.getRequiredString("Director: ");
				// create instance of movie
				Movie m = new Movie(title, rating, year, director);
				// call writeMovieRecord
				if (movieDAO.add(m)) {
					System.out.println("Movie added!");
				}
				else {
					System.out.println("No movie added!");
				}
				
				break;
							
			case "3":
				System.out.println("Get a Movie:");
				System.out.println("============");
				int id = Console.getInt("Movie ID: ", 0, Integer.MAX_VALUE);
				Movie movie = movieDAO.getById(id);
				if(movie != null) {
					System.out.println(movie); 
						
					}
					else {
						System.out.println("Invalid movie id.");
					}
					break;
				
			case "4":
				System.out.println("Delete a Movie:");
				System.out.println("============");
				id = Console.getInt("Movie ID: ", 0, Integer.MAX_VALUE);
				movie = movieDAO.getById(id);
				if(movie != null) {
					movieDAO.delete(movie);
					System.out.println("Movie successfully deleted!");
						
					}
					else {
						System.out.println("Invalid movie id.");
					}
				break;
				
			case "5":
				if (movieDAO.upload())
					System.out.println("Upload completed successfully!");
				else
					System.out.println("Error in movie upload...check console.");
				break;
				
			case "6":
				// read all records from file and print to screen
				List<Actor> actors = ActorDAO.getAll();
				System.out.println("Actor List:");
				System.out.println("===========");
				if (actors.size()!= 0) {
					for (Actor a: actors) {
						System.out.println(a);
					}
				}
				else { 
						System.out.println("Actor file empty.");
				}
				break;
				
			case "7":
				// prompt user for all fields for a new actor
				System.out.println("Add an Actor or Actress:");
				System.out.println("============");
				//int id = Console.getInt("ID: ", 0, Integer.MAX_VALUE);
				String FirstName = Console.getRequiredString("First Name: ");
				String LastName = Console.getRequiredString("Last Name: ");
				String Gender = Console.getRequiredString("Gender: ");
				String BirthDate = Console.getRequiredString("Birth Date (enter YYYY-MM-DD format): ");
				// create instance of actor
				Actor a = new Actor(FirstName, LastName, Gender, BirthDate);
				// call actor file
				if (ActorDAO.add(a)) {
					System.out.println("Actor or actress added!");
				}
				else {
					System.out.println(" No actor or actress added!");
				}
				
				break;
							
			case "8":
				System.out.println("Get an actor or actress:");
				System.out.println("============");
				id = Console.getInt("Actor ID: ", 0, Integer.MAX_VALUE);
				Actor actor = ActorDAO.getById(id);
				if(actor != null) {
					System.out.println(actor); 
						
					}
					else {
						System.out.println("Invalid actor or actress id.");
					}
					break;
				
			case "9":
				System.out.println("Delete an actor or actress:");
				System.out.println("============");
				id = Console.getInt("Actor ID: ", 0, Integer.MAX_VALUE);
				actor = ActorDAO.getById(id);
				if(actor != null) {
					ActorDAO.delete(actor);
					System.out.println("Actor or actress successfully deleted!");
						
					}
					else {
						System.out.println("Invalid actor or actress id.");
					}
				break;
				
			case "10":
				if (ActorDAO.upload())
					System.out.println("Upload completed successfully!");
				else
					System.out.println("Error in actor or actress upload...check console.");
				break;
			case "99":
				
				break;
			}
			
		}
				
				
		System.out.println("Bye!");

	}

}