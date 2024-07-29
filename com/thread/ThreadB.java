package com.thread;

public class ThreadB implements Runnable{

	String name;

	public ThreadB(String name) {
		
		this.name = name;
		System.out.println("name :"+name);
	}

	@Override
	 public void run() {
		for(int i=5;i>0;i--) {
			try {
				System.out.println(name +":"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(name+ "Exiting");
				e.printStackTrace();
			}
			
		}
		System.out.println(name + " exiting...");
		
	}
	
	

}
