package app.objects;

import app.enums.DinoBreed;
import app.enums.Operation;

public class Dino {
	private int raceNumber;
	private String dinoName;
	private DinoOdds odds;
	private boolean active;
	private DinoBreed breed;

	public int getRaceNumber() {
		return raceNumber;
	}

	public void setRaceNumber(int raceNumber) {
		this.raceNumber = raceNumber;
	}

	public String getDinoNamet() {
		return dinoName;
	}

	public void setDinoName(String mount) {
		this.dinoName = mount;
	}
	
	public DinoOdds getOdds() {
		return odds;
	}

	public void setOdds(DinoOdds odds) {
		this.odds = odds;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public DinoBreed getBreed() {
		return breed;
	}

	public void setBreed(DinoBreed breed) {
		this.breed = breed;
	}

	public String getFileLine() {
		String activeVal;
		String operationVal;
		if(active) {
			activeVal = "T";
		} else {
			activeVal = "f";
		}
		
		if(odds.getOperation().equals(Operation.MULTIPLY)) {
			operationVal = "*";
		} else {
			operationVal = "/";
		}
		return raceNumber + "|" + dinoName + "|" + breed.getBreedName() + "|" + activeVal + "|" + operationVal + "|" +odds.getValue();
	}
	
	
	 
	

}
