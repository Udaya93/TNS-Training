package com.tnsif.kprit.Exceptions;

public class PercentageValidator {
	static void isValidPercentage(float per)throws ArithmeticException{
		if(per>=0 && per<=100) {
			System.out.println("Valid Percentage "+per);
		}
		else {
			throw new ArithmeticException("percentage should be between 0 and 100");
		}
	}
}
