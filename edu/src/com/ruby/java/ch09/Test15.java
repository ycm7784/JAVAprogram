package com.ruby.java.ch09;

import java.util.Random;

public class Test15 {

	public static void main(String[] args) {
		
		Random r1 = new Random();
		for(int i = 0; i < 5 ; i ++) {
			System.out.println(r1.nextInt()+"\t");
			System.out.println(r1.nextInt(10)+"\t");
			System.out.println(r1.nextBoolean()+"\t");
			System.out.println(r1.nextDouble()+"\t");
			System.out.println();
		}
		Random r2 = new Random(46);
		for(int i = 0; i < 5 ;i++) {
			System.out.println(r2.nextInt(10));
		}
	}

}
