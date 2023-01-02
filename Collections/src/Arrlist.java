import java.util.*;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[8];
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		for(int i=1;i<=12;i++) {
			alist.add(i);
		}
		System.out.println(alist);
		
		alist.add(100);
		System.out.println(alist);
		
		alist.remove(4);
		System.out.println(alist);
		
		Iterator<Integer> i=alist.iterator();
		System.out.println("Using Iterator");
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
