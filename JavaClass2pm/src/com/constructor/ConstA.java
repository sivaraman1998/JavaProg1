package com.constructor;

public class ConstA {
	String name;
	int age;
	String degree;
	String dept;
	String city;
	
//	private void ConstA() {
//		
//	}
	
	private ConstA() {
		System.out.println("Bio data");
		System.out.println();
	}
	
	ConstA(String a,int b,String c,String d,String e) {
		name=a;
		age=b;
		degree=c;
		dept=d;
		city=e;
	}
	
	public static void main(String[] args) {
		ConstA obj1=new ConstA();
		
		ConstA obj2=new ConstA("Sivaraman",25,"BE",""
				+ "Aeronautical Engineering","Tirunelveli");
		System.out.println("Name : "+obj2.name);
		System.out.println("Age : "+obj2.age);
		System.out.println("Degree : "+obj2.degree);
		System.out.println("Department : "+obj2.dept);
		System.out.println("City : "+obj2.city);
		System.out.println();
		
		ConstA obj3=new ConstA("Veera",25,"BE",""
				+ "EEE","Chennai");
		System.out.println("Name : "+obj3.name);
		System.out.println("Age : "+obj3.age);
		System.out.println("Degree : "+obj3.degree);
		System.out.println("Department : "+obj3.dept);
		System.out.println("City : "+obj3.city);
		System.out.println();
	}
}
