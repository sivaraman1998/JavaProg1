package com.array;

public class Array2 {

	public static void main(String[] args) {
		int a[][] = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 10 }, 
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
