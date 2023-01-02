package com.univ;

public class College extends University{
	public void ug() {
		super.ug();
	}
	public void pg() {
		super.pg();
	}
	public static void main(String[] args) {
		College obj=new College();
		obj.ug();
		obj.pg();
	}

}
