package app.objects;

import app.enums.*;

public class DinoOdds {
	private Operation Operation; // if false divide
	private int Value; // Multiplier or divider
	
	public Operation getOperation() {
		return Operation;
	}
	
	public void setOperation(Operation operation) {
		Operation = operation;
	}
	public int getValue() {
		return Value;
	}
	public void setValue(int value) {
		Value = value;
	}
	
}
