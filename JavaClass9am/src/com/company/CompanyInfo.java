package com.company;

import com.employee.Employee;

public class CompanyInfo {
	public void companyname() {
		System.out.println("Company : " + "Infosys");
	}

	public void companyname(String s1) {
		System.out.println("Company : " + s1);
	}

	public void companyname(String s2, String s3) {
		System.out.println("Company : " + s2 + "	" + "Company : " + s3);
	}

	public static void main(String[] args) {
		CompanyInfo obj = new CompanyInfo();
		obj.companyname();
		obj.companyname("Cognizant");
		obj.companyname("TCS", "Wipro");
	}
}
