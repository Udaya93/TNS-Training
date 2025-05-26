package com.tns.casestudy.user.interfac;
import  com.tns.casestudy.user.interfac.Userinter;
import java.util.*;
import com.tns.casestudy.User;
public class Userimplementation implements Userinter{
	public static ArrayList<User> l=new ArrayList<>();

	public String addUser(User u) {
		l.add(u);
		return "added";
		
	}
	public String deleteUser(int id) {
//		l.remove(i);
//	return "deleted";
		for(User u:l) {
			if(u.getUserId()==id) {
				l.remove(u);
				return "deleted";
			}
		}
		return "user id doesn't exsist";
	}

}
