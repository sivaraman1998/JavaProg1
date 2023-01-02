package com.javaclass;

public class HDFC extends Bank{
	public void interest1() {
		System.out.println("For HDFC");
		super.interest();
		System.out.println("4.2% interest rates for SBI");
	}
	public void fixedDeposit1() {
		super.fixedDeposit();
		System.out.println("6.4% interest rates for HDFC fixed deposit");
	}
	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.interest1();
		obj.fixedDeposit1();
	}

}
