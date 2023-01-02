package com.javaclass;

public class Overriding extends Overloading {
	public void Register_No(int num) {
		super.Register_No(num);
	}
	public void Student_Name(String name) {
		super.Student_Name(name);
	}
	public void Department(String dept) {
		super.Department(dept);
	}
	public void Semester(int sem) {
		super.Semester(sem);
	}
	public static void main(String[] args) {
		Overriding obj=new Overriding();
		obj.Register_No(101031);
		obj.Student_Name("Sivaraman S");
		obj.Department("Aeronautical Engineering");
		obj.Semester(8);
	}
}
