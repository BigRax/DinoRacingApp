package app.valueobjects;

import java.util.ArrayList;

import app.importers.DinoImporter;
import app.importers.UserImporter;
import app.objects.Bet;
import app.objects.Dino;
import app.objects.User;
import app.util.DiceRoller;

public class App {
	private static App session;

	private UserImporter userImporter;
	private DiceRoller diceRoller;
	private DinoImporter dinoImporter;

	public static App getSession() {
		if (session == null) {
			session = new App();
		}
		return session;
	}

	public ArrayList<Dino> dinos;
	public ArrayList<User> users;

	private App() {
		users = new ArrayList<User>();
		diceRoller = new DiceRoller();
		userImporter = new UserImporter();
		dinoImporter = new DinoImporter();
		dinos = new ArrayList<Dino>();
	}

	public void loadApplication() {
		users = userImporter.loadUsers();
		dinos = dinoImporter.loadDinos();
		for (User u : users) {
			ScreenManager.getMgr().getBettingScreen().comboBoxUsers.addItem(u);
		}
	}

	public void closeApplication() {
		userImporter.saveUsers(users);
		dinoImporter.saveDinos(dinos);
		System.exit(0);
	}

	public DiceRoller getDiceRoller() {
		return diceRoller;
	}

}
