package programmers;

public class Letterchange {
	 public String solution(String my_string) {
	        String answer = "";
	        for(int i=my_string.length()-1 ;i>0;i--){
	            answer+=(my_string.charAt(i));
	        }
	        return answer;
	    }
    
	public static void main(String[] args) {
		Letterchange a = new Letterchange();
		String  s = "abcdef";
		String  m = "f";
		a.solution(s);
		int n =1234;
		int answer = n/1000000 + n/100000 + n/10000 + n/1000 + n/100 + n/10 +n/1;
		System.out.println(answer);

	}

}
