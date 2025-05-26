package com.tnsif.kprit.Collections;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
public class DemoQueue {
	public static void main(String args[]) {
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(10);
		q.add(100);
		q.add(30);
		q.offer(12);
		//q.offer(null);
		q.peek();
		System.out.println(q);
		for(int i:q) {
			System.out.println(i);
		}
		
		Queue<String> qq=new PriorityQueue<String>();
		qq.add("A");
		qq.add("B");
		qq.add("C");
		//qq.add(null);
		for(String s:qq) {
			System.out.println(s);
		}
		
		Queue<String> qa=new ArrayDeque<String>();
		qa.add("A");
		qa.add("B");
		qa.add("C");
		//qa.add(null);
		for(String st:qa) {
			System.out.println(st);
		}
	}
}
