package Chap_4stack_queue;

//int형 고정 길이 큐

public class IntQueue {
 private int[] que;            // 큐용 배열
 private int capacity;         // 큐의 크기
 private int front;            // 맨 처음 요소 커서
 private int rear;             // 맨 끝 요소 커서
 //private int num;              // 현재 데이터 개수
 private boolean Isempty;
// private boolean lspull;
 //--- 실행시 예외: 큐가 비어있음 ---//
 public class EmptyIntQueueException extends RuntimeException {
     public EmptyIntQueueException() { }
 }

 //--- 실행시 예외: 큐가 가득 찼음 ---//
 public class OverflowIntQueueException extends RuntimeException {
     public OverflowIntQueueException() { }
 }

 //--- 생성자(constructor) ---//
 public IntQueue(int maxlen) {
     front = rear = 0;
     capacity = maxlen;
     Isempty =true;
     //lspull =false;
     try {
         que = new int[capacity];          // 큐 본체용 배열을 생성
     } catch (OutOfMemoryError e) {        // 생성할 수 없음
         capacity = 0;
     }
 }
//(rear+1) % capacity
 
 //--- 큐에 데이터를 인큐 ---//
 public int enque(int x) throws OverflowIntQueueException {
	 System.out.println("front = " + front + ", rear = " + rear);
// if ((rear+1) % capacity == front && !Isempty)
	 //if((rear+1) % capacity == front) lspull =true;
     if (front == rear && !Isempty)
    	 throw new OverflowIntQueueException();            // 큐가 가득 찼음
	 Isempty = false;
     que[rear++] = x;
     rear %= capacity;
		
		//     num++;
		    return x;
 }

 //--- 큐에서 데이터를 디큐 ---//
 public int deque() throws EmptyIntQueueException {
	 System.out.println("front = " + front + ", rear = " + rear);
	 
     if (front == rear&& Isempty)
         throw new EmptyIntQueueException();            // 큐가 비어있음
       	
     int x = que[front];
	 front = (++front) % capacity; 
	 if(front == rear)Isempty = true;  
    	 //num--;
     return x;
 }

 //--- 큐에서 데이터를 피크(프런트 데이터를 들여다봄) ---//
 public int peek() throws EmptyIntQueueException {
     if (Isempty==true)
         throw new EmptyIntQueueException();            // 큐가 비어있음
     return que[front];
 }

 //--- 큐를 비움 ---//
 public void clear() {
     front = rear = 0;
 }

 //--- 큐에서 x를 검색하여 인덱스(찾지 못하면 –1)를 반환 ---//
 
}