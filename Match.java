package main;

public class Match {

	private final String valueString;
	private final int valueBinaryInt;
	private final int valueDecimalInt;
	
	public Match(int value) {
		valueString = String.valueOf(value);
		valueBinaryInt = value;
		valueDecimalInt = getNonBinary(value);
	}
	
	public int getNonBinary(int val) {
		return -1;
	}

	public String getValueString() {
		return valueString;
	}

	public int getValueBinaryInt() {
		return valueBinaryInt;
	}

	public int getValueDecimalInt() {
		return valueDecimalInt;
	}

}
