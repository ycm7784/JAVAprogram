package edu.Mission;
class Count{
	public void CountSum(int []m,int []n,int[]v) {
		for(int i=0;i < m.length;i++) {
			v[2*i]=m[i];
			v[2*i+1]=n[i];
		}
	}
	public void print(int []q) {
		for(int h = 0; h<q.length; h++) {
			System.out.print(q[h]+" ");
		}
		
	}
}


public class Merge {

	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		int [] b = {5,6,7,8};
		int [] c = new int [a.length*2];
		Count t = new Count();
		t.CountSum(a,b,c);
		t.print(c);
		
	}

}
