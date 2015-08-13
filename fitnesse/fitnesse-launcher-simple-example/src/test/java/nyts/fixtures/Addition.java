package nyts.fixtures;

import nyts.Calculator;

public class Addition {
	
	private int first;
	private int second;
	
	public int sum() {
		return Calculator.add(first, second);
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	

}
