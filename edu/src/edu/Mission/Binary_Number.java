package edu.Mission;

class Change{
//	private int num;
//	public int getNum() {
//		return num;
//	}
//
//	public void setNum(int num) {
//		this.num = num;
//	}
//	

	public void changeNum(int num) {
		int i[]= new int[100];
		int j = 0;
		while(true) {
			i[j]= num%2;
			num =num/2;
			j++;
			if(num<1)break;
		}
		for(j--;j>=0;j--) {
			System.out.print(i[j]);
		}
	}
}

public class Binary_Number {

	public static void main(String[] args) {
		Change cg = new Change();
		cg.changeNum(13);
		
	}

}
