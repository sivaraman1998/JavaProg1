
public class DuplicateElements {

	public static void main(String[] args) {
		int arr[]= {2,6,6,3,4,5,5,5,6,7};
		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					k++;
				}
			}
		}
		System.out.println(k);
	}
}
