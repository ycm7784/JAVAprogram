package com.ruby.java.test1;
import com.ruby.java.test1.Armor;

/*class Armor2 {
	private String name;
	private int height;
	public int take0ff(int value) {
		System.out.println("엔진 시동: value = "+ value);
		return value -50;}
}*/
public class TestArmor {
	static void text(int ... v) {
		System.out.println(v.length + " : ");
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
		
	}
	public static void main(String[] args) {
		int n;
		int [][]arr = new int[3][4];
		Armor a = new Armor();
		n = a.takeOff(100);
		a.speedup(11.12);
		System.out.println("n ="+ n);
		
		//a.Height =10;
		
	}

}
