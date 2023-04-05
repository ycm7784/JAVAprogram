package programmers;

public class maxsum {
	public int solution(int[] numbers) {
        for(int i = 0 ;i<numbers.length; i++) {
        	for(int j = i ;j<numbers.length; j++) {
        		int temp = 0;
        		if(numbers[i]<numbers[j]) {
        			temp = numbers[i];
        			numbers[i] = numbers[j];
        			numbers[j] = temp;
        		}
        	}
        }
        int answer = numbers[0]*numbers[1];
		return answer;
    }

	public static void main(String[] args) {
		maxsum a = new maxsum();
		int [] b = {1, 2, 3, 4, 5};
		a.solution(b);
		
	}

}
