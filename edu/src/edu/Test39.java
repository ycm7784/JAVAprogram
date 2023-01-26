package edu;

public class Test39 {//행열

	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] c = new int[5][5];
		int[][] d = new int[5][5];
		int num;
		System.out.println("A배열");
		for(int i =0;i <a.length; i++) {
			for(int j = 0; j< a[i].length;j++) {
				double rnum = Math.random();
				num = (int)(rnum * 10);
				a[i][j] = num; 
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("b배열");
		for(int i =0;i <b.length; i++) {
			for(int j = 0; j< b[i].length;j++) {
				double rnum = Math.random();
				num = (int)(rnum * 10);
				b[i][j] = num; 
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
//		행열더하기
		System.out.println("c배열");
		for(int i =0;i <c.length; i++) {
			for(int j = 0; j< c[i].length;j++) {
				c[i][j] = a[i][j] + b[i][j]; 
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
//		행열곱하기
		System.out.println("d배열");
		for(int i =0;i <a.length; i++) {
			for(int j = 0; j< b[i].length;j++) {
				for(int k= 0; k< a[i].length;k++) {
				
				d[i][j] += a[i][k] * b[k][j];
	
				}
				System.out.print(d[i][j]);
				System.out.print("\t");	
			}		
			System.out.println("\n");
		}
		
	}

}
