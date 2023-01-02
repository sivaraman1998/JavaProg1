package com.bike;

public class Ktm implements Bike {
	@Override
	public void cost() {
		System.out.println("Price is Rs.1,04,000");
	}
	@Override
	public void speed() {
		System.out.println("Max speed 120p/h");
	}
	
	public static void main(String[] args) {
		Ktm obj=new Ktm();
		obj.cost();
		obj.speed();
	}

}
