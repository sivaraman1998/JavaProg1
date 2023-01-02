package com.education;

public class Arts extends Education {
	public void bSc() {
		System.out.println("B.Sc Computer Science");
	}
	public void bEd() {
		System.out.println("B.Ed English");
	}
	public void bA() {
		System.out.println("BA Tamil");
	}
	public void bba() {
		System.out.println("BBA Course");
	}
	public void ug() {
		super.ug();
	}
	public void pg() {
		super.pg();
	}
	public static void main(String[] args) {
		Arts obj=new Arts();
		obj.bSc();
		obj.bEd();
		obj.bA();
		obj.bba();
		obj.ug();
		obj.pg();
	}

}
