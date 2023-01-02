import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsAll {

	public static void main(String[] args) {

		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println(arr[2]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*************************");
		for (int j : arr) {
			System.out.println(j);
		}
		
		List<Integer> l=new ArrayList<>();
		l.add(100);
		l.add(101);
		l.add(102);
		l.add(103);
		
		System.out.println("*************************");
		System.out.println(l.get(2));
		System.out.println(l);
		
		System.out.println("*************************");
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			Integer values = (Integer) iterator.next();
			System.out.println(values);
			
		}
		
		Set<Object> s=new HashSet<>();
		s.add(200);
		s.add(201);
		s.add(202);
		s.add(203);
		
		System.out.println("*************************");
		System.out.println(s);
		
		for (Iterator iterator = s.iterator(); iterator.hasNext();) {
			Object values1 = (Object) iterator.next();
			System.out.println(values1);
			
		}
		
		Map<Object, Object> m=new TreeMap<>();
		m.put(1, "Java");
		m.put(2, "Selenium");
		m.put(3, "Maven");
		
		System.out.println("*************************");
		System.out.println(m.get(3));
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());	//same
		System.out.println(m);				//same
		
		
		
		
	}

}
