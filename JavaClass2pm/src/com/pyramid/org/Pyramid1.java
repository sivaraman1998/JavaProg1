package com.pyramid.org;

public class Pyramid1 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=10+1;j<=i;j++) {
				System.out.print(" ");
			}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
}

//public static void main(String arfs[] ) {
//	int i=8;
//	
//	 do{
//		System.out.println(i);
//		i++;
//	}while(i<=10);
//}
//}