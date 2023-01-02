package com.javaclass;

public class Calc {
	public void bikes() {
		System.out.println("Royal Enfield");
		System.out.println("Avenger");
		System.out.println("Yamaha");
	}
	private void cars() {
		System.out.println("Maruthi");
		System.out.println("Fortune");
		System.out.println("Aadi");
	}
	public void add() {
		long a=123;
		long b=123;
		System.out.println("Add : "+(a+b));
	}
	public void subtract() {
		float c=12.123f;
		double d=11.12;
		System.out.println("Subtract : "+(c-d));
	}
	public void multiply() {
		int e=1234;
		long f=12345l;
		System.out.println("Multiply : "+(e*f));
	}
	public void division() {
		int g=14;
		int h=3;
		System.out.println("Division : "+(g/h));
	}
	public static void main(String[] args) {
		Calc obj=new Calc();
		obj.bikes();
		obj.cars();
		obj.add();
		obj.subtract();
		obj.multiply();
		obj.division();
	}
}
