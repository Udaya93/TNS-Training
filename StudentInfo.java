package com.tnsif.kprit.Exceptions;

public class StudentInfo {
	private int rollNo;
	private String name;
	private float per;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per=per;
	}
	public void show() {
		try {
			PercentageValidator.isValidPercentage(per);
			System.out.println("Student Details: ");
			System.out.println("RollNo: "+rollNo+"\tName: "+name+"\tPercentage"+per);
		}
		catch(ArithmeticException e) {
			System.out.println("invalid");
		}
	}
}
