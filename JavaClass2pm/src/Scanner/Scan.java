package Scanner;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String s1 = sc.next();
		System.out.println(s1);
		
		System.out.println("Enter your Register number : ");
		int s2 = sc.nextInt();
		System.out.println(s2);

		System.out.println("Enter your college name : ");
		String s3 = sc.nextLine();
		String s6 = sc.nextLine();
		System.out.println(s6);
		
		System.out.println("Your Salary : ");
		float s4 = sc.nextFloat();
		System.out.println(s4);

		System.out.println("Enter your first name : ");
		char s5 = sc.next().charAt(2);
		System.out.println(s5);	
	}
}
