package com.inheritance;

public class Demo {
	
	public static void main(String args[] ){
		
		
		
		
	//single inheritance
		
		Student s=new Student("mahesh", 21, 513);
		s.displayInfo();
		
		
	//hierarchical inheritance
		Athlete at=new Athlete("ramesh", 22, "volleyball");
		at.displayInfo();
		at.playSport();
		
		
		//multiple inheritance
		Teacher t=new Teacher("madhavi", 45, "java");
		t.displayInfo();
		t.work();
		
	}

	
	
	

}
