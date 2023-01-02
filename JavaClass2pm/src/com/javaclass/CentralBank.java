package com.javaclass;

public class CentralBank extends Bank{
	public void interest2() {
		System.out.println("For CentralBank");
		super.interest();
		System.out.println("3.5% interest rates for SBI");
	}
	public void fixedDeposit2() {
		super.fixedDeposit();
		System.out.println("6% interest rates for CBI fixed deposit");
	}
	public static void main(String[] args) {
		CentralBank obj=new CentralBank();
		obj.interest2();
		obj.fixedDeposit2();
	}

}
