package com.final1.org;

public class FinalA {
	final static int a=62;
	public final void data1() {
		System.out.println("Final Data1");
	}
	public static void add(int b) {
		System.out.println("a+b = "+(a+b));
	}
	public static void data2() {
		System.out.println("Data 2");
	}
	public static void main(String[] args) {
		FinalA obj=new FinalA();
		obj.data1();
		obj.add(5);
		System.out.println("a = "+a);
		data2();
	}
}
