package Chap_4stack_queue;

public class MyStack {
	private int top;
	Point [] data;
	
	public MyStack(){
		top = 0;
		data = new Point[100];
	}
	
	public void push(Point p) {
		data[top++] =p;
	}
	
	public  Point pop() {
		if(top<=0) {
			System.out.println("스택없음");
		}
		return data[top--];
	}
	public boolean isEmpty() {
        if (top == 0)
            return true;
        else
            return false;
    }
}
