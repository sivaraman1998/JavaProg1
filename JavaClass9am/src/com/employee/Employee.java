package com.employee;

public class Employee {
	public void empId() {
		System.out.println("Employee ID1 : "+3898);
	}
	public void empId(long id) {
		System.out.println("Employee ID2 : "+id);
	}
	public void empId(float id1, double id2) {
		System.out.println("Employee ID3 : "+id1+"	"+"Employee ID4 :"+id2);
	}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.empId();
		obj.empId(3899);
		obj.empId(3900, 3901);
	}
}
