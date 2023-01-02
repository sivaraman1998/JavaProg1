package com.scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String a = sc.next();
		System.out.println(a);
		
		System.out.println("Enter your college name : ");
		String b = sc.nextLine();
		String c = sc.nextLine();
		System.out.println(c);
		
		System.out.println("Enter your Register number : ");
		int d = sc.nextInt();
		System.out.println(d);		
		
		System.out.println("Your Salary : ");
		float e = sc.nextFloat();
		System.out.println(e);

		System.out.println("Enter your Section : ");
		char f = sc.next().charAt(0);
		System.out.println(f);
		
		System.out.println("Enter the date : ");
		byte g = sc.nextByte();
		System.out.println(g);	
		
		System.out.println("Enter the month : ");
		short h = sc.nextShort();
		System.out.println(h);	
		
		System.out.println("Enter your mobile number : ");
		long i = sc.nextLong();
		System.out.println(i);	
		
		System.out.println("Time : ");
		double j = sc.nextDouble();
		System.out.println(j);	
		
		System.out.println("Enter your department : ");
		String k = sc.next().toString();
		System.out.println(k);	
		
		System.out.println("Say true or false ");
		boolean l = sc.nextBoolean();
		System.out.println(l);	
	}

}
