package app.enums;

public enum Operation {
	MULTIPLY("Multiply"), DIVIDE("Divide");
	
	private String Operation;
	
	Operation(String s){
	  setOperation(s);	
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
}
