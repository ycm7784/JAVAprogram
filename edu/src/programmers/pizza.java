package programmers;

public class pizza {
	   public int solution(int slice, int n) {
	        int answer = 0;
	        answer = n%slice==0 ?  n/slice :  n/slice +1;
	       
	        return answer;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
