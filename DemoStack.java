package com.tnsif.kprit.Collections;

import java.util.Stack;

public class DemoStack {
	public static void main(String args[]) {
		Stack<String> ss=new Stack<String>();
		ss.push("A");
		ss.push("B");
			System.out.println(ss);	
		ss.pop();
		System.out.println(ss);
	}
}
