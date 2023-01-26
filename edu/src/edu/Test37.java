package edu;

public class Test37 {

	public static void main(String[] args) {
		int[]score = {90,98,66,77,33,44};
		int sum =0;
		double avg =0.0;
		int max = 0;
		int min = 999;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if(max < score[i])
				max =score[i];
			if(min > score[i])
				min =score[i];
		}
		System.out.println("총점 = " +sum);
		System.out.println("최댓값 : "+ max);
		System.out.println("최솟값 : "+ min);
		
		

	}

}
