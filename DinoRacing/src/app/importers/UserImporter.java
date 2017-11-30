package app.importers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import app.objects.*;

public class UserImporter {

	public ArrayList<User> loadUsers() {
		ArrayList<User> users = new ArrayList<User>();
		try {
			File file = new File("resources/Users.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				users.add(new User(line));
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return users;
	}
	public void saveUsers(ArrayList<User> users) {
		//TODO Save user file
	}
	
}
