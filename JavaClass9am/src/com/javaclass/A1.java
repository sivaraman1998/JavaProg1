package com.javaclass;

public abstract class A1 {
	public void studentname(String name) {
		System.out.println("Student name : "+name);
	}
	public void registernum(long num) {
		System.out.println("Register number : "+num);
	}
	public void mailId(String mail) {
		System.out.println("Email : "+mail);
	}
	public abstract void mobilenum(long mobile);
	public abstract void password(long pass);
}
