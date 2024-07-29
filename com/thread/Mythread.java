package com.thread;

//import com.conditions.Table;

public class Mythread implements Runnable{
	
	
	public void run() {
		
		try {
			while(true) {
				System.out.println("Mahesh's thread...");
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			System.out.println("something went wrong");
		}
		
//		Table tb= new Table();
//		
//		tb.tables();
		
	}

}
