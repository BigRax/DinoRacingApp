package app.valueobjects;

import app.ui.screens.*;
public class ScreenManager {
	private static ScreenManager screenMgr;
	
	private MainMenu mainMenu;
	private ManagementScreen mgmtScreen;
	private RaceScreen raceScreen;
	private RaceResultsScreen raceResultScreen;
	private BettingScreen bettingScreen;
	
	public static ScreenManager getMgr() {
		if (screenMgr == null) {
			screenMgr = new ScreenManager();
		}
		return screenMgr;
	}
	
	public MainMenu getMainMenu() {
		return mainMenu;
	}

	public ManagementScreen getMgmtScreen() {
		return mgmtScreen;
	}

	public RaceScreen getRaceScreen() {
		return raceScreen;
	}

	public RaceResultsScreen getRaceResultScreen() {
		return raceResultScreen;
	}

	public BettingScreen getBettingScreen() {
		return bettingScreen;
	}


	private ScreenManager() {
		this.mainMenu = new MainMenu();
		this.mgmtScreen = new ManagementScreen();
		this.raceResultScreen = new RaceResultsScreen();
		this.raceScreen = new RaceScreen();
		this.bettingScreen = new BettingScreen();
	}
	
	public void displayMainMenu() {
		mainMenu.setVisible(true);
		mgmtScreen.setVisible(false);
		raceScreen.setVisible(false);
		raceResultScreen.setVisible(false);
		bettingScreen.setVisible(false);
	}
	
	public void displayManagementScreen() {
		mainMenu.setVisible(false);
		mgmtScreen.setVisible(true);
		raceScreen.setVisible(false);
		raceResultScreen.setVisible(false);
		bettingScreen.setVisible(false);
	}
	
	public void displayRaceScreen() {
		mainMenu.setVisible(false);
		mgmtScreen.setVisible(false);
		raceScreen.setVisible(true);
		raceResultScreen.setVisible(false);
		bettingScreen.setVisible(false);
	}
	
	public void displayRaceResultScreen() {
		mainMenu.setVisible(false);
		mgmtScreen.setVisible(false);
		raceScreen.setVisible(false);
		raceResultScreen.setVisible(true);
		bettingScreen.setVisible(false);
	}
	
	public void displayBettingScreen() {
		mainMenu.setVisible(false);
		mgmtScreen.setVisible(false);
		raceScreen.setVisible(false);
		raceResultScreen.setVisible(false);
		bettingScreen.setVisible(true);
		
	}
	
}
