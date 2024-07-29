package com.inheritance;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void displayInfo() {
		System.out.println("name:"+name+" age:"+age);
	}
	
}
