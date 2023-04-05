package programmers;

public class arrays {
	 public int solution(String[] s1, String[] s2) {
	        int answer = 0;
	        for(int i = 0; i< s1.length; i++){
	            for(int j = 0; j < s2.length; j++){
	                if(s1[i].equals(s2[j])){
	                    answer++;
	                    System.out.println(answer);
	                }
	            }
	        }
	        System.out.println(answer);
	        return answer;
	    }
    
	public static void main(String[] args) {
		arrays a = new arrays();
		String [] n = {"a", "b", "c"}	;
		String []  m ={"com", "b", "d", "p", "c"};
		a.solution(n,m);
		

	}

}
