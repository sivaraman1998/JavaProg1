import java.util.Scanner;

public class SumofArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size : ");
        int ar=scan.nextInt();
        int arr[]=new int[ar];
        int sum=0;
        
        System.out.println("Enter array elements");
        for(int i=0;i<ar;i++){
            arr[i]=scan.nextInt();
        }
        for(int j=0;j<ar;j++){
            sum += arr[j];
        }
        System.out.println("Sum : "+sum);
	}

}
