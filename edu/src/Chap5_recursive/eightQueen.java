package Chap5_recursive;

import java.util.Stack;

public class eightQueen {
public static void SolveQueen(int[][] d, int a, int b) {
	 
	Stack stack = new Stack<>();
//	d[a,b]=1;
//	stack.push(d[a,b]);
		
	}
public int checkRow(int x) {
	
	return 0;
}
	public static void main(String[] args) {
		int [][]data = new int[8][8];  //배열초기화
		SolveQueen(data,0,0);
		for(int i = 0; i<=7;i++) {
			  for(int j = 0;j<= 7 ; j++) {
				  data[i][j]=0;
				  System.out.print(data[i][j]);
			  }
			  System.out.println();
			}
		}

	

}
