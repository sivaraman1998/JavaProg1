package com.javaclass;

public class Override extends Overload {
	public void bank() {
		super.bank();
		System.out.println("4.5% interest");
		System.out.println();
	}
	public void bank(int a) {
		super.bank(a);
		System.out.println("Fixed deposit interest rate is 6.3% today");
		System.out.println();
	}
	public void bank(int a,float f) {
		super.bank(a,f);
		System.out.println("Daily withdrawal limit is Rs.40,000");
		System.out.println();
	}
	public void bank(int a,double d,String s ) {
		super.bank(a,d,s);
		System.out.println("Educational loan is available");
	}
	public static void main(String[] args) {
		Override obj=new Override();
		obj.bank();
		obj.bank(3);
		obj.bank(4, 3.45f);
		obj.bank(8, 56.7, "String");
	}
}