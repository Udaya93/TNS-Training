package com.tnsif.kprit.Threads;

public class Thread2 extends Thread{
	DemoThreadComm ob;
	Thread2(DemoThreadComm ob){
		this.ob=ob;
	}
	public void run() {
		for(int k=0;k<=5;k++) {
			ob.receive();
		}
	}
}
