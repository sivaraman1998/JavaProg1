package com.string.org;

public class StringMethods {

	public static void main(String[] args) {
		String s="My name is Sivaraman";
		
		String s1="my name is sivaraman";
		
		int a = s.length();
		System.out.println(a);
		
		boolean b = s.equals(s1);
		System.out.println(b);
		
		boolean c =s.equalsIgnoreCase(s1);
		System.out.println(c);
		
		String d =s.toUpperCase();
		System.out.println(d);
		
		String e =s.toLowerCase();
	    System.out.println(e);
	    
	    boolean f =s.startsWith("M");
	    System.out.println(f);
	    
	    boolean g =s.endsWith("n]");
	    System.out.println(g);
	    
	    boolean h =s1.contains("ram");
	    System.out.println(h);
	    
	    int i =s.indexOf('s');
	    System.out.println(i);
	    
	    int j =s1.lastIndexOf("a");
	    System.out.println(j);
	    
	    String []s2=s.split(" ");
	    int k=s2.length-1;
	    while(k>=0) {
	    	System.out.println(s2[k]);
	    	k--;
	    }
	    
	    char charAt = s.charAt(4);
	    System.out.println(charAt);
	    
	    String replace = s.replace("i", "h");
	    System.out.println(replace);
	    
	    String substring = s.substring(4);
	    System.out.println(substring);
	    
	    boolean empty = s.isEmpty();
	    System.out.println(empty);
	    
	    String valueOf = s.valueOf(a);
	    System.out.println(valueOf);
	    
	    int compareTo = s.compareTo(s1);
	    System.out.println(compareTo);
	}

}
