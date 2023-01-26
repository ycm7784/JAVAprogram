package edu.Mission;

public class Free {
	private double location;
	private double a =9.81;
	private double second;
	private double Fspeed;
	private double Flocation;
	
	public void get(double second,double Fspeed,double Flocation) {
		double result = Flocation-0.5*a*(second*second)+(Fspeed*second);
		System.out.println(result);
	}
	
	public double get1(double second,double Fspeed,double Flocation) {
		double sum = Flocation-0.5*a*(second*second)+(Fspeed*second);
	return sum;
	}
	public static void main(String[] args) {
		Free a = new Free();
		for(int i =1; i<=10 ;i++) {
			System.out.println(i+"초 후 위치");
			a.get(i,0,1000);
		}
		System.out.println("5초후 위치"+a.get1(5, 0, 1000));
		
	}
}
