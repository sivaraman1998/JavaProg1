package com.array;

public class Arra1 {

	public static void main(String[] args) {
		int arr1[]=new int[5];
		
		arr1[0]=12;
		arr1[1]=23;
		arr1[2]=36;
		arr1[3]=65;
		arr1[4]=45;
		
//		System.out.println(arr1[2]);
		
		int arr2[]= {78,89,94,45,65,98,65,61,87};
		
		for(int i=arr2.length-4;i>=arr2.length-7;i--) {
			System.out.println(arr2[i]);
		}
		
//		for(char c='Z';c>='U';c--) {
//			System.out.println(c);
//		}
		
//		System.out.println(arr2[3]);
		
		
	}

}
