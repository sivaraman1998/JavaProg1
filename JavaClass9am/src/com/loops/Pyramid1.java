package com.loops;

public class Pyramid1 {

	public static void main(String[] args) {
		for(int i=0;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
