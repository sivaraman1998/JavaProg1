package com.map.org;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
		Map<Integer, String> tm=new TreeMap<>();
//		Map<String, Integer> lhm=new LinkedHashMap<>();
		
		tm.put(101, "Sowpriya");
		tm.put(102, "Arun");
		tm.put(104, "Shaji");
		tm.put(103, "Yasin");
		tm.put(105, "Bhavani");
		
//		lhm.put("Pandi", 101);
//		lhm.put("Suresh", 103);
//		lhm.put("Gomathi", 102);
//		lhm.put("Muthu", 105);
//		lhm.put(null, 104);
		
		System.out.println(tm);
//		System.out.println(lhm);
		
		String string = tm.get(101);
		System.out.println(string);
		
		int size = tm.size();
		System.out.println(size);
		
		Set<Integer> keySet = tm.keySet();
		System.out.println(keySet);
		
		Collection<String> values = tm.values();
		System.out.println(values);
		
//		boolean containsKey = lhm.containsKey("Pandi");
//		System.out.println(containsKey);
//		
//		boolean containsValue = lhm.containsValue(103);
//		System.out.println(containsValue);
//		
//		Set<Entry<String, Integer>> entrySet = lhm.entrySet();
//		System.out.println(entrySet);
		
	}

}
