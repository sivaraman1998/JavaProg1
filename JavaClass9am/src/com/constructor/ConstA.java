package com.constructor;

public class ConstA {
	public ConstA() {
		System.out.println("My Car");
	}
	public ConstA(String name) {
		System.out.println(name);
	}
	public ConstA(int speed) {
		System.out.println(speed+" kmp/h");
	}
	public ConstA(int gear1, String type) {
		System.out.println(gear1+" gears, "+type);	
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConstA obj=new ConstA();
		@SuppressWarnings("unused")
		ConstA obj1=new ConstA("BMW");
		@SuppressWarnings("unused")
		ConstA obj2=new ConstA(180);
		@SuppressWarnings("unused")
		ConstA obj3=new ConstA(5,"Automatic type");
	}
}
