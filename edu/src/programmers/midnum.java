package programmers;

public class midnum {
	public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i=0; i < strlist.length;i++) {
        	answer[i] = strlist[i].length();
        }
        return answer;
		}
    
	public static void main(String[] args) {
		midnum a = new midnum();
		String [] n = {"We", "are", "the", "world!"};
		a.solution(n);
		

	}

}
