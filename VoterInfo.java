package com.tnsif.kprit.Exceptions;
public class VoterInfo {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
			this.age=age;
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
	public String toString() {
		return "VoterInfo [name="+name+", age="+age+"]";
	}
}
