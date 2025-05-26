package com.tnsif.kprit.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.LinkedHashSet;

public class DemoLinkedList {
	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		//List l=new LinkedList();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.remove(2);
		ll.addFirst("E");
		ll.addLast("F");
		System.out.println(ll);
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println(v);
		
		
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(29);
		System.out.println(lhs);
		
		
		ArrayList<Integer> all=new ArrayList<Integer>();
		all.add(10);
		System.out.println(all);
		
	}

}
