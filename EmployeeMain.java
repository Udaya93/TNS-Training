package com.tnsif.kprit.Collections;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String args[]) {
		ArrayList<Employee> arl=new ArrayList<Employee>();
		arl.add(new Employee(102,"A",3000.09f));
		arl.add(new Employee(101,"C",3500.09f));
		arl.add(new Employee(104,"B",3200.09f));
		//Collections.sort(arl);
		for(Employee emp:arl) {
			System.out.println(emp.eid+" "+emp.ename+" "+emp.esal);
		}
	}

}
