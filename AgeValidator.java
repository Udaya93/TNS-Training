package com.tnsif.kprit.Exceptions;

public class AgeValidator {
	static void validateAge(int age)throws Exception{
		if(age<18) {
			throw new Exception("you are not eligible to vote");
		}
	}
}
