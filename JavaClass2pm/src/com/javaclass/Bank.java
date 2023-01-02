package com.javaclass;

public class Bank {
	public void interest() {
		System.out.println("Simple Interest in %");
	}
	public void fixedDeposit() {
		System.out.println("Fixed deposit interest rates in %");
	}

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.interest();
		obj.fixedDeposit();
	}

}
