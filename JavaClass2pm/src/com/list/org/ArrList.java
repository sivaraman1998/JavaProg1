package com.list.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrList {

	public static void main(String[] args) {
//		ArrayList <Object> alist=new ArrayList <Object>();
//		
//		alist.add("Siva");
//		alist.add(34);
//		alist.add(52.3);
//		alist.add('S');
//		
//		System.out.println(alist);
		
		Vector <Object> vec=new Vector<Object>();
		List <Object> linked=new LinkedList <Object>();
		
		vec.add("Siva");
		vec.add(54);
		vec.add(23.3);
		vec.add('S');
		
		linked.add("Siva");
		linked.add(34);
		linked.add(52.3);
		linked.add('S');
		
		System.out.println(vec);
		
		int size = vec.size();
		System.out.println(size);
		
		Object set1 = vec.set(3, "Set");
		System.out.println(vec);
		
		Object get1 = vec.get(3);
		System.out.println(get1);
		
		Object remove1 = vec.remove(2);
		System.out.println(vec);
		
		int indexOf1 = vec.indexOf(54);
		System.out.println(indexOf1);
		
		vec.retainAll(linked);
		System.out.println(vec);
	}

}
