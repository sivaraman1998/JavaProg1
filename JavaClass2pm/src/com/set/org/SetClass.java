package com.set.org;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

	public static void main(String[] args) {
		Set <Object> set1=new LinkedHashSet<Object>();
		Set <Object> set2=new TreeSet<>();
		
		set1.add(54);
		set1.add(55);
		set1.add(60);
		set1.add(57);
		set1.add(58);
		
		set2.add(60);
		set2.add(59);
		set2.add(61);
		set2.add(60);
		set2.add(63);
		
		System.out.println(set1);
		System.out.println(set2);
		
		int size = set1.size();
		System.out.println(size);
		
//		Object remove1 = set1.remove(2);
//		System.out.println(set1);
//		
		set1.retainAll(set2);
		System.out.println(set1);
		
	}

}
