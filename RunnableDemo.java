package com.tnsif.kprit.Threads;

public class RunnableDemo {
	public static void main(String args[]) {
		UsingRunnable ur=new UsingRunnable(10,20,"Hello");
		Runnable r=new Runnable() {
			public void run() {
			System.out.println("Runnable with Anonymous class");
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(ur);
		t1.start();
		t2.start();
	}
}
