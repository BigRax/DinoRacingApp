package app.objects;

import app.enums.*;

public class Dino {
	private int raceNumber;
	private String mount;
	private int speed;
	private int critSpeed;
	private int skillCheck;
	private boolean beserkChance;
	private int AC;
	private int hitPoints;
	private int attack;
	private int damageDiceQty;
	private Dice diceType;
	private int constitution;
	private int constitutionModifier;
	private DinoOdds odds;
	private boolean active;

	public int getRaceNumber() {
		return raceNumber;
	}

	public void setRaceNumber(int raceNumber) {
		this.raceNumber = raceNumber;
	}

	public String getMount() {
		return mount;
	}

	public void setMount(String mount) {
		this.mount = mount;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCritSpeed() {
		return critSpeed;
	}

	public void setCritSpeed(int critSpeed) {
		this.critSpeed = critSpeed;
	}

	public int getSkillCheck() {
		return skillCheck;
	}

	public void setSkillCheck(int skillCheck) {
		this.skillCheck = skillCheck;
	}

	public boolean isBeserkChance() {
		return beserkChance;
	}

	public void setBeserkChance(boolean beserkChance) {
		this.beserkChance = beserkChance;
	}

	public int getAC() {
		return AC;
	}

	public void setAC(int aC) {
		AC = aC;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDamageDiceQty() {
		return damageDiceQty;
	}

	public void setDamageDiceQty(int damageDiceQty) {
		this.damageDiceQty = damageDiceQty;
	}

	public Dice getDiceType() {
		return diceType;
	}

	public void setDiceType(Dice diceType) {
		this.diceType = diceType;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getConstitutionModifier() {
		return constitutionModifier;
	}

	public void setConstitutionModifier(int constitutionModifier) {
		this.constitutionModifier = constitutionModifier;
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
	
	 
	

}
