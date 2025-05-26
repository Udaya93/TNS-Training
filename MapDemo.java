package com.tnsif.kprit.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String args[]) {
		Map<String,Integer> mp=new HashMap<String,Integer>();
		mp.put("hobby",4);
		mp.put("Gura", 2);
		System.out.println(mp);
		
		for(Map.Entry<String,Integer> entry:mp.entrySet()) {
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+":"+value);
		}
		
		Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		m.put("Mobby",4);
		m.put("Gura", 2);
		System.out.println(m);
		
		for(Map.Entry<String,Integer> entry:m.entrySet()) {
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+":"+value);
		}
		
		
		Map<String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("Mobby",4);
		tm.put("Gura", 2);
		System.out.println(tm);
		
		for(Map.Entry<String,Integer> entry:tm.entrySet()) {
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
