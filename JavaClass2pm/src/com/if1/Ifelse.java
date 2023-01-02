package com.if1;

public class Ifelse {

	public static void main(String[] args) {
		float a=12;
		
		if(a==18) {
			System.out.println("You are eligible for to do vote");
		}
		else if(a<18) {
			System.out.println("You are not eligible to vote");
		}
		else if(a>18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("Condition Failed");
		}
	}
}
