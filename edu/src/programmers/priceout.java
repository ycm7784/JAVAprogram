package programmers;

public class priceout {
	 public int solution(int price) {
		 int answer = (int) (price >= 500000 ? price*0.8 : price >= 300000 ? price*0.9 : price >= 100000 ? price*0.95 :price);
	     System.out.println(answer);
         answer-=answer%10;
         System.out.println(answer);
         return answer ;
	    }
	public static void main(String[] args) {
		priceout a = new priceout();
		a.solution(10);

	}

}
