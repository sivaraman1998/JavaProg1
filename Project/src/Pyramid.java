import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		for(int i=0;i<num;i++) { 
			for(int k=num;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
