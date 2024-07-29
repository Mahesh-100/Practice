package com.poly;

import java.util.Scanner;

public class Demo {

	
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter animal:");
	String str=sc.nextLine();
	Demo d=new Demo();
	Animal a=d.dynamicBinding(str);
	a.eat();
	
	sc.close();
	}
	
	
	
	
	public Animal dynamicBinding(String str) {
		if(str.equals("dog")) {
			Animal am=new Dog();
			return am;
		}else if(str.equals("cow")) {
			Animal b=new Cow();
			return b;
		}else {
			Animal c=new Snake();
			return c;
		}
			
	}
	
	
	
	
	
	
	
}
