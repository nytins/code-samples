package nyts.fixtures;

import nyts.Calculator;

public class Division {
	
	private int numerator;
	private int denominator;
	
	public double quotient() {
		return Calculator.divide(numerator, denominator);
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}
