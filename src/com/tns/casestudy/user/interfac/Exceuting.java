package com.tns.casestudy.user.interfac;
import com.tns.casestudy.User;

import com.tns.casestudy.user.interfac.Userimplementation;



public class Exceuting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User a=new User(1,"udaya",836721);
		Userimplementation b=new Userimplementation();
//		b.addUser(a);
//		b.deleteUser(0);
		
		System.out.println(b.addUser(a));
		System.out.println(b.deleteUser(1));
		
		User c=new User(1,"rushi",94418);
		System.out.println(b.addUser(c));
		System.out.println(b.deleteUser(5));
		System.out.println(a.toString());
		System.out.println(c.toString());
		

	}

}
