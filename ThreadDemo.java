package com.tnsif.kprit.Threads;

public class ThreadDemo extends Thread{
	String msg;
	ThreadDemo(String msg){
		this.msg=msg;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		ThreadDemo td=new ThreadDemo("task1");
		ThreadDemo td1=new ThreadDemo("task2");
		Thread t1=new Thread(td);
		Thread t2=new Thread(td1);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}
