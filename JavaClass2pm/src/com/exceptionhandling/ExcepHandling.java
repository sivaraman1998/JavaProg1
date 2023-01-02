package com.exceptionhandling;

public class ExcepHandling {

	public static void add() throws Exception {
		int i = 10;

		try {
			System.out.println(i / 0);
		} 
		catch (Exception e) {
			throw new Exception();
		}
		finally {
			System.out.println("Process Completed");
		}
	}

	public static void main(String[] args) throws Exception {
		add();
	}
}
