package com.tnsif.kprit.Threads;

public class ThreadLifeCycle {
	public void run() {
		System.out.println("Inside thread run() is Alive or not..?"+this.isAlive());
		int num=0;
		while(num<0) {
			num++;
			System.out.println("num="+num);
			try {
				Thread.sleep(500);
				System.out.println("In not runnable stage, Thread is alive or not "+this.isAlive());
			}
			catch(InterruptedException e) {
				System.err.println("Thread Interruped");
			}
		}
	}
	
	private String isAlive() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String args[]) {
		ThreadLifeCycle myThread=new ThreadLifeCycle();
		System.out.println("Before runnable stage,thread is alive or not"+myThread.isAlive());
		myThread.start();
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException e) {
			System.out.println("Thread Interrupted");
		}
		System.out.println("After complete execution of thread,thread is alive or not"+myThread.isAlive());
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}
}
