package com.ruby.java.test1;

public class Armor {
	private String name;
	private int height;
	
	double speed;
	
	
	public void speedup(double value) {
		speed = value;
	}
	public void speedup(double value, int maxValue) {
		speed = value;
		int maxSpeed = maxValue;
	}
	public String getName() {
		return name;
	}

	public void setHeight (int value) {
		height =value;
	}
		public void setName () {
		String value = "mark6";
		name = value;
		takeOff(23);
	}
	public int takeOff(int value) {
		System.out.println("엔진 시동: value = "+ value);
		return value -50;
	}
	
	
}
