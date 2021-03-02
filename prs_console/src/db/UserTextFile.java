package db;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserTextFile implements DAO<User> {
	private static final String USER_FILE_NAME = "users.txt";
	List<User> users = new ArrayList<>();
		

	public UserTextFile() {
		// fill user list with users from text file	
		getAll();
	}

	@Override
	public User getById(int id) {
		User u = null;
			for (User user: users) {
				if (user.getId()==id) {
					u = user;
				}
			}
			return u;
		}

		@Override
		public List<User> getAll() {
				List<User> users = new ArrayList<>();
				//p.477
				if (users.size()==0);
				try {
				BufferedReader in = new BufferedReader(
									new FileReader(USER_FILE_NAME));
				String line = in.readLine();
				while (line != null) {
					// this is ORM in core Java! (Object Relational Management)
					String[] fields = line.split("\t");
					//after split we should have 9 fields per line
					String idStr = fields[0];
					int id = Integer.parseInt(idStr);
					String un = fields[1];
					String pwd = fields[2];
					String fn = fields[3];
					String ln = fields[4];
					String pn = fields[5];
					String em = fields[6];
					String rvStr = fields[7];
					boolean rv = Boolean.parseBoolean(rvStr);
					String admStr = fields[8];
					boolean adm = Boolean.parseBoolean(admStr);
					
					
					User u = new User(id, un, pwd, fn, ln, pn, em, rv, adm);
					users.add(u);
					
					//get the next line in the file
					line = in.readLine();			
					
					}
					in.close();
				}
				catch (IOException e) {
					System.out.println("Error getting movie records from file.");
					e.printStackTrace();
				}
				return users;
			}		


		@Override
		public boolean add(User u) {
			users.add(u);
			return saveALL();
			
		}
			// this method will be called for any maintenance function (add, update, delete)
			private boolean saveALL() {
				boolean success = true;
				Path usersPath = Paths.get(USER_FILE_NAME);
				File usersFile = usersPath.toFile(); 		
							
				try (PrintWriter out = new PrintWriter(
										               new BufferedWriter(
												       new FileWriter(usersFile)))) {
								    	   
				//p.483 - NOTE: this looks different than example in book for works the same
				for (User u: users) {
						out.println(u.getId()+"\t");
						out.println(u.getUserName()+"\t");
						out.println(u.getPassword()+"\t");
						out.println(u.getFirstName()+"\t");
						out.println(u.getLastName()+"\t");
						out.println(u.getPhoneNumber()+"\t");
						out.println(u.getEmail()+"\t");
						out.println(u.isReviewer()+"\t");
						out.println(u.isAdmin()+"\t");
					}
										
				} catch (IOException e) {
					success = false;
					e.printStackTrace();
				}
				return success;
			}
		
		@Override
		public boolean delete(User u) {
			// add a "remove" command here.
			return saveALL();
		}

		
		@Override
		public boolean update(User t) {
			// TODO Auto-generated method stub
			return false;
		}

				
	}

	
