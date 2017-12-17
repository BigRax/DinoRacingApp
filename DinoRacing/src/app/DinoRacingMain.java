package app;

import app.valueobjects.App;
import app.valueobjects.ScreenManager;

public class DinoRacingMain {

	public static void main(String[] args) {
		// Initialize the value objects 
		ScreenManager.getMgr();
		App.getSession();
		
		// Load files
		App.getSession().loadApplication();

		ScreenManager.getMgr().displayMainMenu();
	}

}
