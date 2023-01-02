import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size :");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		
		int alice=0,bob=0;
		
		System.out.print("Array 1 elements :");
		for(int i=0;i<size;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.print("Array 2 elements :");
		for(int j=0;j<size;j++) {
			arr2[j]=sc.nextInt();
		}
		for(int k= 0;k<size;k++) {
			for(int l=0;l<size;l++){
				if(arr1[k]>arr2[l]) {
					alice++;
				}
				else if(arr1[k]<arr2[l]) {
					bob++;
				}
				else if(arr1[k]==arr2[l]) {
					return;
				}
			}
		}
		System.out.print(alice+" "+bob);
	}

}
