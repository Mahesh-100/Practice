package com.conditions;

 public class Table  {
	
	
	
	
	
	public void table(int n) {
		
		for(int i=1;i<=12;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
		
	}
	
	
	public void tables() {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=12;j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}

}
