package com.greens;

import com.phone.Phone;

public class GreensTech {
	public void greensOmr() {
		System.out.println("Balamurugan garden,");
	}
	public void greensOmr(int add) {
		System.out.println(add+", Rajiv gandhi salai, Thoraipaakam,");
	}
	public void greensOmr(String city, long pincode) {
		System.out.println(city+", "+pincode+".");
	}
	public static void main(String[] args) {
		GreensTech obj=new GreensTech();
		obj.greensOmr();
		obj.greensOmr(19);
		obj.greensOmr("Chennai", 600097);
	}

}
