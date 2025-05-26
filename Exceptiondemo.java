package com.tnsif.kprit.Exceptions;

public class Exceptiondemo {
	public static void divide(int a,int b) {
		int result;
		try {
			result=a/b;
			System.out.println(result);
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			}
		finally {
			System.out.println("Hello Welcome");
		}
	}
}
