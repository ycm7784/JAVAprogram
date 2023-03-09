package programmers;

public class SumNumbers {
	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int a = total/num;
        int b =(num/2);
        // num 짝수
        if(num%2==0) {
        	for(int i = 0;i< num; i++ ) {
        		answer[i] = a-b+1+i;
        		System.out.println(answer[i]);
        	}
        }else {// 홀수
        	for(int i = 0;i< num; i++ ) {
        		answer[i] = a-b+i;
        		System.out.println(answer[i]);
        	}
        }
        return answer;
    }

	public static void main(String[] args) {
		SumNumbers a = new SumNumbers();
		a.solution(3, 12);
		
	}

}
