package com.tnsif.kprit.Collections;

public class Employee {
	public int eid;
	public String ename;
	public float esal;
	public Employee(int eid,String ename,float esal) {
		super();
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	public int compareTo(Employee em) {
		if(esal==em.esal)
		return 0;
		else if(esal>em.esal)
			return 1;
		else
			return -1;
	}
}
