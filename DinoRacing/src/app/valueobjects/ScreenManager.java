package app.valueobjects;

import app.ui.screens.*;
public class ScreenManager {

	private MainMenu mainMenu;
	private ManagementScreen mgmtScreen;
	private RaceScreen raceScreen;
	private RaceResultsScreen raceResultScreen;
	
	public ScreenManager() {
		this.mainMenu = new MainMenu();
		this.mgmtScreen = new ManagementScreen();
		this.raceResultScreen = new RaceResultsScreen();
		this.raceScreen = new RaceScreen();
	}
	
	public void displayMainMenu() {
		mainMenu.setVisible(true);
		mgmtScreen.setVisible(false);
		raceScreen.setVisible(false);
		raceResultScreen.setVisible(false);
	}
	
	public void displayManagementScreen() {
		mainMenu.setVisible(false);
		mgmtScreen.setVisible(true);
		raceScreen.setVisible(false);
		raceResultScreen.setVisible(false);
	}
	
	public void displayRaceScreen() {
		mainMenu.setVisible(false);
		mgmtScreen.setVisible(false);
		raceScreen.setVisible(true);
		raceResultScreen.setVisible(false);
	}
	
	public void displayRaceResultScreen() {
		mainMenu.setVisible(false);
		mgmtScreen.setVisible(false);
		raceScreen.setVisible(false);
		raceResultScreen.setVisible(true);
	}
	
	public void switchToRaceTab() {
	//TODO
	}
}
