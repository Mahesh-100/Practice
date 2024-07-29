package com.inheritance;



public class Student extends Person  {

	
	int studentId;
	
	public Student(String name, int age,int studentId) {
		super(name, age);
		this.studentId=studentId;
	}

	public void displayInfo() {
		
		
		System.out.println("name:"+name+" age:"+age+"student Id:"+studentId);
	}
	
	
	
	
		
	 
	 
	
	
}
