package com.javaclass;

public class A2 extends A1 {
	@Override
	public void mobilenum(long mobile) {
		System.out.println("Mobile number : "+mobile);
		
	}

	@Override
	public void password(long pass) {
		System.out.println("Password : "+pass);
		
	}
	public static void main(String[] args) {
		A2 obj=new A2();
		obj.studentname("Sivaraman S");
		obj.registernum(720815101031l);
		obj.mailId("ramansiva1998@gmail.com");
		obj.mobilenum(9444722630l);
		obj.password(101031);
	}
}
