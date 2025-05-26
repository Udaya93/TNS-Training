package com.tnsif.kprit.Exceptions;

public class ThrowsDemo {
	static void checkAge(int age)throws ArithmeticException{
		if(age<18) {
			System.err.println("You are not eligible");
		}
		else {
			System.out.println("You are eligible");
		}
	}
}
