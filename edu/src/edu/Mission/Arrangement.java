package edu.Mission;

class Multiplication{
	public	Multiplication(int [][]a,int [][]b,int [][]c){
		for(int m = 0;m < a.length; m++) {
			for(int n = 0;n < b[0].length;n++) {
				for(int v = 0;v < a[0].length; v++) {
					c[m][n] += a[m][v]*b[v][n];
					System.out.print(c[m][n] + " ");
				}
				System.out.println();
			}
		}
	}
	
}

public class Arrangement {
	public static void main(String[] args) {
		int [][]i = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int [][]j = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][]k = new int [5][5];
		Multiplication q = new Multiplication(i, j, k);
		
		
	}
}
