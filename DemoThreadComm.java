package com.tnsif.kprit.Threads;

public class DemoThreadComm {
	int i;//sending message
	boolean flag=false;
	
	synchronized void deliver(int i) {
		if(flag)
			try {
				wait();// wait till notification is received
			}
		catch(InterruptedException e) {
			System.err.println("Exception caught ");
		}
		this.i=i;
		flag=true;
		System.out.println("Data delivered "+i);
		notify();//when the data production is over, it will notify to thread2
	}
	
	synchronized int receive() {
		if(!flag)
			try {
				wait();// wait till notification is received from thread 1
			}
		catch(InterruptedException e) {
			System.err.println("Exception caught ");
		}
		
		System.out.println("Data received "+i);
		flag=false;
		notify();//when the data receiving is over, it will notify to thread1
		return i;
	}

}
