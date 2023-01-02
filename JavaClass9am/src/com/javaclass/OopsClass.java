package com.javaclass;

public class OopsClass {
	private void studentname() {
		System.out.println("Name : "+"Sivaraman S");
	}
	private void studentId() {
		System.out.println("ID : "+720815101031l);

	}
	private void mailId() {
		System.out.println("Mail : "+"ramansiva1998@gmail.com");

	}
	private void password() {
		System.out.println("Password : "+948951);

	}
	private void phonenumber() {
		System.out.println("Phone number : "+9361786124l);

	}
	private void collegename() {
		System.out.println("College Name : "+"Hindusthan Institute of Technology");

	}
	private void dept() {
		System.out.println("Department : "+"Aeronautical Engineering");

	}
	public static void main(String[] args) {
		OopsClass obj=new OopsClass();
		obj.studentname();
		obj.studentId();
		obj.mailId();
		obj.password();
		obj.phonenumber();
		obj.collegename();
		obj.dept();
	}

}
