package app.util;

import java.util.Random;

public class DiceRoller {
	private Random rn;
	
	private static final int DICE_MIN = 1; 
	public DiceRoller() {
		rn = new Random();
	}
	
	public int rollDice(int diceSides) throws Exception {
		int roll = 0;
		//super randomized
		for(int i = 0; i < rn.nextInt(10) + 1; i ++) {
			roll = rn.nextInt(diceSides - DICE_MIN + 1) + DICE_MIN ;
		}
		if(roll == 0) {
			throw new Exception("Something fucked up and dice is 0");
		}
		return roll;
	}

}
