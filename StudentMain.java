package com.tnsif.kprit.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class StudentMain {
	public static void main(String args[]) {
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(101,"A",23));
		a1.add(new Student(104,"B",25));
		a1.add(new Student(102,"c",22));
		Collections.sort(a1);
		for(Student s:a1) {
			System.out.println(s.sid+""+s.name+""+s.age);
		}
	}
}
