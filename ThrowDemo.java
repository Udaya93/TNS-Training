package com.tnsif.kprit.Exceptions;

public class ThrowDemo {
	static void CheckAge(int age) {
		if(age<18) {
			throw new ArithmeticException("you are not eligible to vote");
		}
		else
		{
			System.out.println("You are eligible");
		}
	}
}
