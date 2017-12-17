package app.importers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import app.objects.*;

public class UserImporter {
	private File file = new File("resources/Users.txt");

	public UserImporter() {

	}

	public ArrayList<User> loadUsers() {
		ArrayList<User> users = new ArrayList<User>();
		try {

			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				User u = new User(line);
				users.add(u);
				System.out.println(line);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return users;
	}

	public void saveUsers(ArrayList<User> users) {
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);

			for (User u : users) {
				String line = u.getUserName();
				bw.write(line);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
