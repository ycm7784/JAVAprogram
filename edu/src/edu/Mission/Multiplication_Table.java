package edu.Mission;

class Count1{
	public void mutl(int m){
		for(int n=2;n<=9;n+=m) {
				for(int i =1;i <=9;i++) {
					for(int j=1;j<=m;j++) {
			System.out.print(n +"*"+ i+"="+ (n*i)+"\t");
						}
					System.out.println("\t");
				}
		}System.out.println();
	}
}


public class Multiplication_Table {
	public static void main(String[] args) {
		Count1 n = new Count1();
		 
				n.mutl(4);
				
			
	}
	
	
}
