package com.ruby.java.ch06;

class Count{
	public static int totalConunt;
	int count;
}

public class CountTest {	
	public static void main(String[] args) {
		Count C1 = new Count();
		Count C2 = new Count();
		Count C3 = new Count();
		
		C1.count++;
		Count.totalConunt++;
		C2.count++;
		Count.totalConunt++;
		C3.count++;
		Count.totalConunt++;
		
		System.out.println(Count.totalConunt + " : " +C1.count);
		System.out.println(Count.totalConunt + " : " +C2.count);
		System.out.println(Count.totalConunt + " : " +C3.count);
		
		/*
		 * Count.count++; C1.totalConunt++;
		 */
		


	}

}
