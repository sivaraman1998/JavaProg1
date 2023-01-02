package com.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		super.deposit();
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
