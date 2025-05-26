package com.tnsif.kprit.Collections;
import java.util.Comparator;
//import java.util.*;
public class Ename implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2) {
		if(e1.ename==e2.ename)
			return 0;
		else if(e1.ename!=e2.ename)
			return 1;
		else 
			return -1;
	}



	
}
