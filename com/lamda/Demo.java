package com.lamda;
    

public class Demo {

	public static void main(String[] args) {
		
		DemoIn obj=(a,b)->a*b;
		
		int rs=obj.gen(5, 10);
//		System.out.println(rs);
//		rs=obj.gen(56, 4);
//		System.out.println(rs);
		
		 System.out.println(rs);
		 
	}

}
