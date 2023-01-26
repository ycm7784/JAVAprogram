package edu;

public class Test32 {//배열

	public static void main(String[] args) {
		
		int[] arr =new int[10];
		
		for(int i=0 ;i <arr.length ; i++)
			arr[i] = (i+1)*10;
			
		
		
		/*
		 * arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
		 */
		 
		/* for(int i=0 ;i <arr.length ; i++)	System.out.println(arr[i]); */
		for (int num: arr)
			System.out.println(num);
	
		for(int i=0 ;i <arr.length  ; i++)
		System.out.print(" "+ arr[i]);
	
	/*
	 * System.out.println(arr[0]); System.out.println(arr[1]);
	 * System.out.println(arr[2]); System.out.println(arr[3]);
	 * System.out.println(arr[4]);
	 * 
	 */
		
		
	}

}
