package app.enums;

public enum Dice {
	 D4(4), D6(6), D8(8), D10(10), D12(12), D20(20);
	
	private int DiceSides;
	
	Dice(int sides) {
		setDiceSides(sides);
	}

	public int getDiceSides() {
		return DiceSides;
	}

	public void setDiceSides(int diceSides) {
		DiceSides = diceSides;
	}
}
