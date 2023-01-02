package com.javaclass;

public class SBI extends Bank {
	public void interest3() {
		System.out.println("For SBI");
		super.interest();
		System.out.println("3.8% interest rates for SBI");
	}
	public void fixedDeposit3() {
		super.fixedDeposit();
		System.out.println("6.3% interest rates for SBI fixed deposit");
	}
	
	public static void main(String[] args) {
		SBI obj=new SBI();
		obj.interest3();
		obj.fixedDeposit3();
	}

}
