package com.tnsif.kprit.Threads;

public class Communication {
	public static void main(String args[]) {
		DemoThreadComm ob=new DemoThreadComm();
		Thread1 t1=new Thread1(ob);
		Thread2 t2=new Thread2(ob);
		t1.start();
		t2.start();
	}
}
