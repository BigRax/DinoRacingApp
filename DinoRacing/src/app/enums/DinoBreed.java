package app.enums;

import app.enums.Dice;

public enum DinoBreed {
	// Values from DnD book
	YoungAllosaurus("Young Allosaurus", 50, 80, 16, true, 13, 30, 6, 1, Dice.D10, 3, 15, 2),
	Deinonychus("Deinonychus", 40, 60, 12, true, 13, 26, 4, 1, Dice.D8, 2, 14, 2),
	Dimetrodon ("Dimetrodon", 30, 50, 8, false, 12, 19, 3, 2, Dice.D6, 1, 15, 2),
	Hadrosaurus("Hadrosaurus", 40, 50, 10, false, 11, 19, 3, 1, Dice.D10, 1, 13, 1),
	Other("Other", 40, 60, 12, false, 12, 24, 3, 1, Dice.D8, 2, 16, 3),
	YoungTriceratops("Young Triceratops", 50, 70, 14, false, 13, 38, 5, 1, Dice.D10, 1, 15, 2),
	YoungTyrannosaurus("Young Tyrannosaurus", 50, 100, 18, true, 13, 46, 6, 1, Dice.D12, 3, 17, 3);
	
	
	private String breedName;
	private int speed;
	private int critSpeed;
	private int skillCheck;
	private boolean beserkChance;
	private int aC;
	private int hitPoints;
	private int attack;
	private int damageDiceQty;
	private Dice diceType;
	private int dmgModifier;
	private int constitution;
	private int constitutionModifier;
	
	
	private DinoBreed(String breedName, int speed, int critSpeed, int skillCheck, boolean beserkChance, int aC, int hitPoints, int attack,
			int damageDiceQty, Dice diceType, int dmgModifier, int constitution, int constitutionModifier) {
		this.breedName = breedName;
		this.speed = speed;
		this.critSpeed = critSpeed;
		this.skillCheck = skillCheck;
		this.beserkChance = beserkChance;
		this.aC = aC;
		this.hitPoints = hitPoints;
		this.attack = attack;
		this.damageDiceQty = damageDiceQty;
		this.diceType = diceType;
		this.dmgModifier = dmgModifier;
		this.constitution = constitution;
		this.constitutionModifier = constitutionModifier;
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
		return aC;
	}

	public void setAC(int aC) {
		this.aC = aC;
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

	public int getDmgModifier() {
		return dmgModifier;
	}

	public void setDmgModifier(int dmgModifier) {
		this.dmgModifier = dmgModifier;
	}

	public String getBreedName() {
		return breedName;
	}

	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}
}
