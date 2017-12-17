package app.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.valueobjects.App;
import app.valueobjects.ScreenManager;

public class MainMenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()){
		case "ManagementScreen":
			ScreenManager.getMgr().displayManagementScreen();
			break;
		case "BeginRace":
			ScreenManager.getMgr().displayBettingScreen();
			break;
		case "Exit":
			App.getSession().closeApplication();
			break;
			
			
		}
		
	}

}
