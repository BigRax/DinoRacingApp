package app.ui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.objects.Bet;
import app.valueobjects.App;
import app.valueobjects.ScreenManager;

public class BettingScreenListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "BeginRace":
			
			break;

		case "RemoveBet":
			ScreenManager.getMgr().getBettingScreen().abm.removeBet(ScreenManager.getMgr().getBettingScreen().listActiveBets.getSelectedValue());;
			break;

		case "Add Bet":
			if (validateInputs()) {
				addBet();
			}
			break;
		case "Exit":
			App.getSession().closeApplication();
		}

	}

	private void addBet() {
		Bet newBet = new Bet();
		newBet.setName(ScreenManager.getMgr().getBettingScreen().comboBoxUsers.getSelectedItem().toString());
		newBet.setRacerID(Integer.getInteger(ScreenManager.getMgr().getBettingScreen().getInputRacerID()));
		newBet.setWagerAmt(Integer.getInteger(ScreenManager.getMgr().getBettingScreen().getInputBetAmount()));

		ScreenManager.getMgr().getBettingScreen().abm.addBet(newBet);

	}

	private boolean validateInputs() {
		if (Integer.getInteger(ScreenManager.getMgr().getBettingScreen().getInputBetAmount()) > 0
				&& Integer.getInteger(ScreenManager.getMgr().getBettingScreen().getInputRacerID()) > 0) {
			return true;
		}
		return false;
	}

}
