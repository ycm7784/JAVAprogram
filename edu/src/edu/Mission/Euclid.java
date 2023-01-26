package edu.Mission;
class Count0{
	
	public void Countmax(int a, int b) {
		int max = 0;
		int min = 0;
		int rem = 0;
		int maxsum = 0;
		int minsum = 0;
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		while(true) {
			rem = max%min;
				if(rem == 0) {
					maxsum = min;
					minsum = (a*b)/maxsum;
					break;
					}
			max = min;
			min =rem;
			}
		System.out.println("입력 : "+a+","+b+"->" +"최대공약수 : "+maxsum+" 최소공배수 : "+minsum);
		}
	}
		
public class Euclid {

	public static void main(String[] args) {
		Count0 a = new Count0();
		int b =12;
		int c =18;
		a.Countmax(b, c);
		
		

	}

}
