package com.tnsif.kprit.Threads;

public class Thread1 extends Thread {
	DemoThreadComm ob;
	Thread1(DemoThreadComm ob){
		this.ob=ob;
	}
	public void run() {
		for(int j=0;j<5;j++) {
			ob.deliver(j);
		}
	}
}
