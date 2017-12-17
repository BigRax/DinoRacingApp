package app.objects;

import javax.swing.JOptionPane;

import app.valueobjects.App;

public class Racer {

	public int racerId;
	public int finishPosition;
	public int distance;
	public boolean racing;
	Dino dino;

	public int getRacerId() {
		return racerId;
	}

	public int getDistance() {
		return distance;
	}

	public Dino getDino() {
		return dino;
	}

	public void setRacerId(int racerId) {
		this.racerId = racerId;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public void setDino(Dino dino) {
		this.dino = dino;
	}

	public void move() {
		try {
			if(!racing) {
				return;
			}
			int roll = roll();
			System.out.println(racerId + " rolled: " + roll);
			if (dino.getBreed().isBeserkChance() && (roll + 5) < dino.getBreed().getSkillCheck()) {
				/*
				 * If an Animal Handling check made with advantage due to lashing fails by 5 or
				 * more, the animal goes berserk and is out of the race.
				 */
				System.out.println("Checking if #" + racerId + " goes beserk!");
				roll = roll();
				System.out.println(racerId + " rolled: " + roll + " for beserk check");
				if ((roll + 5) < dino.getBreed().getSkillCheck()) {
					racing = false;
					JOptionPane.showMessageDialog(null, "Racer #" +racerId + " has gone beserk!! They will not be able to finish the race!");
				}

			}
			
			if(roll == 20) {
				setDistance(distance + dino.getBreed().getCritSpeed());
			} else 	if( roll >= dino.getBreed().getSkillCheck()) {
				setDistance(distance + dino.getBreed().getSpeed());
			}

		} catch (

		Exception e) {
			JOptionPane.showMessageDialog(null, "Bad shit happened when rolling the dice");
			e.printStackTrace();
		}

	}

	public boolean isRacing() {
		return racing;
	}

	public void setRacing(boolean racing) {
		this.racing = racing;
	}

	private int roll() throws Exception {
		return App.getSession().getDiceRoller().rollDice(dino.getBreed().getDiceType().getDiceSides());
	}

}