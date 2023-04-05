package programmers;

public class LetterDelete {
	  public String solution(String my_string, String letter) {
	        String answer = "";
	        for(int i = 0; i<my_string.length(); i++){
	            if(my_string.charAt(i) != letter.charAt(0)){
	                answer += my_string.charAt(i);
	            }
	        }
	       //repeat ,append
	        System.out.println(answer);
	        return answer;
	    }
    
	public static void main(String[] args) {
		LetterDelete a = new LetterDelete();
		String  n = "abcdef";
		String  m = "f";
		a.solution(n,m);
		

	}

}
