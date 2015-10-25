package com.nytins.spring.core.car;

public class Civic implements Car {
	private Wheel wheel;
	
	public Civic(Wheel wheel) {
		this.wheel = wheel;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving car");
		wheel.rotate();
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
}
