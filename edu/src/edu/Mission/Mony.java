package edu.Mission;

public class Mony {
	/*
	public int sumit50000(int mony) {
	int korea50000 = mony/50000;
	return korea50000;
		}
	
	public int sumit10000(int mony) {
		int korea10000 = (mony%50000)/10000;
		return korea10000;
		}
	
	public int sumit5000(int mony) {
		int korea5000 = ((mony%50000)%10000)/5000;
		return korea5000;
		}
	public int sumit1000(int mony) {
		int korea1000 = (((mony%50000)%10000)%5000)/1000;
		return korea1000;
		}
	*/
/*	public int sumit50000(int mony) {
		int korea50000 = mony/50000;
		return korea50000;
			}
	public int sumit10000(int mony) {
		int korea10000 = (mony-50000*korea50000;
		return korea10000;
		}
*/
//	public void sumit(int mony) {
//		int korea50000 = mony/50000;
//		System.out.println("5만원권 "+korea50000+"장");
//		int korea10000 = (mony-50000*korea50000)/10000;
//		System.out.println("1만원권 "+korea10000+"장");
//		int korea5000 = (mony-50000*korea50000-10000*korea10000)/5000;
//		System.out.println("5천원권 "+korea5000+"장");
//		int korea1000 = (mony-50000*korea50000-10000*korea10000-5000*korea5000)/1000;
//		System.out.println("1천원권 "+korea1000+"장");
//	}
//	
//	public static void main(String[] args) {
//		double rnum = Math.random();
//		int num = (int) (rnum * 10000);
//		
//		Mony a = new Mony();
//		
//		a.sumit(123455);	
//	}

	public int sumit(int mony, int won) {
		int m = mony/won;
		System.out.println(won + "원권 " + m + "장");
		return (mony - won * m);
	}
	
	public static void main(String[] args) {

		Mony a = new Mony();
		
		int price = 152000;
		int[] wons = { 50000, 10000, 5000, 1000 };
		
		for (int won : wons) {
			price = a.sumit(price, won);
		}
	}
	
}
