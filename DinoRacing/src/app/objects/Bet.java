package app.objects;

public class Bet {

	
	public int wagerAmt;
	public String name; //of person placing bet
	public int racerID;
	
	public int getWagerAmt() {
		return wagerAmt;
	}
	public void setWagerAmt(int wagerAmt) {
		this.wagerAmt = wagerAmt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRacerID() {
		return racerID;
	}
	public void setRacerID(int racerID) {
		this.racerID = racerID;
	}
	
	
	@Override
	public String toString() {
		return name + "- Wager: " + wagerAmt + " on Dino: " + racerID;
	}
	

	
	
}
