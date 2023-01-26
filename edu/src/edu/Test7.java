package edu;

public class Test7 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		b--;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		System.out.println(++c); //더하고 실행 이줄에서
		System.out.println(d++);//실행하고 더함 담줄부터 적용 
		System.out.println(d);
	}
}
