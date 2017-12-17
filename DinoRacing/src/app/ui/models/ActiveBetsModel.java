package app.ui.models;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

import app.objects.Bet;

public class ActiveBetsModel extends  AbstractListModel<Bet>  {
	
	public ArrayList<Bet> activeBets;
	
	public ActiveBetsModel() {
		activeBets = new ArrayList<Bet>();
	}
	
	@Override
	public Bet getElementAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return activeBets.size();
	}
	
	public void addBet(Bet b) {
		activeBets.add(b);
		this.fireContentsChanged(this, 0, activeBets.size());
	}
	
	public void removeAll() {
		activeBets.clear();
		
		super.fireIntervalRemoved(this, 0, activeBets.size());
	}
	
	public void removeBet(Bet bet){
//		for (Bet b : activeBets) {
//			if(b.getName().equalsIgnoreCase(bet.getName())
//			&& b.getRacerID() == bet.getRacerID()){
				activeBets.remove(bet);
//			}
//		}
	}

}
