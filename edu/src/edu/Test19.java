package edu;

public class Test19 {//if문

	public static void main(String[] args) {
		int score = 90;
		
		String result = "";//포인터
		
		if(score >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		
		System.out.println(result);
	}

}
