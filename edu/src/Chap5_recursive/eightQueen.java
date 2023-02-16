package Chap5_recursive;

public class eightQueen {
public static void SolveQueen(int[][] d) {
	  for(int i = 0; i<=7;i++) {
		  for(int j = 0;j<= 7 ; j++) {
			  d[i][j]=0;
			  System.out.print(d[i][j]);
		  }
		  System.out.println();
	  }
		
	}
	public static void main(String[] args) {
		int [][]data = new int[8][8];  //배열초기화
		SolveQueen(data);
		
	}

	

}
