package chap6;

 class intStack {
	private int top;
	int [] data;
	
	public intStack(){
		top = 0;
		data = new int[100];
	}
	
	public void push(int p) {
		data[top++] =p;
	}
	
	public  int pop() {
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

public class Test_QuickSort {


//퀵 정렬(비재귀 버전)

	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 퀵 정렬(비재귀 버전)---//
	static void quickSort(int[] a, int left, int right) {

		intStack lstack = new intStack();
		intStack rstack = new intStack();
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty()!=true) {
			
		}
	
	}

	public static void main(String[] args) {
		int nx = 10;
		int[] x = new int[10];
		for (int ix = 0; ix < 10; ix++) {
			double d = Math.random();
			x[ix] = (int) (d * 20);
		}
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
		System.out.println();

		quickSort(x, 0, nx - 1); // 배열 x를 퀵정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
