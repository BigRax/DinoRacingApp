package app.objects;

import java.util.ArrayList;

public class Race {	
	public final static int RACE_LENGTH = 300;
	public int round;
	private int nextFinishPosition;
	ArrayList<Racer> racers = new ArrayList<Racer>();
	public boolean raceComplete;
	
	public Race() {
		round = 0;
		nextFinishPosition = 1;
	}
	public void nextRound() {
		
		//Roll and move each dino
		for (Racer r : racers) {
			r.move();
		}
		
		// Check for finishers
		checkPositions();
		
		// check if race over
		if(isRaceDone()) {
			raceComplete = true;
		}
		
		
	}
	
	private void checkPositions() {
		int cnt = 0;
		for (Racer r : racers) {
			if(r.racing) {
				if(r.getDistance() >= RACE_LENGTH) {
				r.finishPosition = nextFinishPosition;
				cnt ++;
				r.racing = false;
				}
			}
		}
		nextFinishPosition += cnt;
	}
	
	private boolean isRaceDone() {
		if( nextFinishPosition > 4) {
			return true;
		} else {
			return false;
		}
	}
}
