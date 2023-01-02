import java.util.Scanner;

public class PairsOfColors {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int ar=scan.nextInt();
        int arr[]=new int[ar];
        int i,j,x,k=0;
        boolean flag=false;
        
        for(x=0;x<ar;x++) {
            arr[x]=scan.nextInt();
        }
        for(i=0;i<arr.length;i++) {
            for(j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    k++;
                    flag = true;
            
                    if(k>2){
                        flag = false;
                    }
                }
            }
        }
        if(flag==true){
            System.out.println(k);
        }
	}
}
