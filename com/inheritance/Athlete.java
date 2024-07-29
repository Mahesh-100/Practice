package com.inheritance;



public class Athlete extends Person{

	String sport;
	
	public Athlete(String name, int age,String sport) {
		super(name, age);
		this.sport=sport;
	}
	
	
	public void playSport() {
		System.out.println("plays "+sport);
	}
	
}
