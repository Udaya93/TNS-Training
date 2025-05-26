package com.tnsif.kprit.Threads;

public class UsingRunnable implements Runnable {
	Thread t;
	int h,l;
	String msg;
	public UsingRunnable(int h,int l,String msg) {
		this.h=h;
		this.l=l;
		this.msg=msg;
		t=new Thread(this, "Child Thread");
		t.start();
	}
	public void run() {
		for(int i=l;i<=h;i++) {
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Error "+e.getMessage());
			}
			System.out.println(msg+i);
		}
	}
}
