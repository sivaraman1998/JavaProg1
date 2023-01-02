import java.util.Scanner;

public class Reverse {
	/*public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int ar=scan.nextInt();
		int arr[]=new int[ar];
		int i,j;
		for(i=0;i<ar;i++) {
			arr[i]=scan.nextInt();
		}
		for(j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}
	}*/
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word=scan.next();
		char[] ch=word.toCharArray();
		int size=ch.length;
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word1=scan.next();
		int size=word1.length();
		String rev="";
		
		for(int i=size-1;i>=0;i--) {
			rev=rev+word1.charAt(i);
		}
		System.out.println(rev);*/
		
		
		/*System.out.println();
		
		int arr[]= {2,4,6,8,10};
		int size1=arr.length;
		for(int j=size1-1;j>=0;j--) {
			System.out.print(arr[j]+" ");
		}*/
	}
}
