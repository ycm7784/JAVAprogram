package chap8;

import java.util.Comparator;
import java.util.Scanner;


class SimpleObject1 {
	private String no; // 회원번호
	private String name; // 이름
	public SimpleObject1(String s1, String s2) {
		this.no = s1;
		this.name = s2;
	}
	// --- 문자열 표현을 반환 ---//
	public String toString() {
		return "(" + no + ") " + name;
	}

	// --- 회원번호로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject1> NO_ORDER = new NoOrderComparator();

	private static class NoOrderComparator implements Comparator<SimpleObject1> {
		public int compare(SimpleObject1 d1, SimpleObject1 d2) {
			return (Integer.parseInt(d1.no) > Integer.parseInt(d2.no)) ? 1 : (Integer.parseInt(d1.no)  < Integer.parseInt(d2.no)) ? -1 : 0;
		}
	}

	// --- 이름으로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject1> NAME_ORDER = new NameOrderComparator();

	private static class NameOrderComparator implements Comparator<SimpleObject1> {
		public int compare(SimpleObject1 d1, SimpleObject1 d2) {
			return d1.name.compareTo(d2.name);
		}
	}
}
class Node1 {
	SimpleObject1 data;
	Node1 link;
	public Node1(SimpleObject1 element) {
		link = null;
	}
}

class LinkedList1 {
	Node1 first;
	public LinkedList1() {
		first = null;
	}
	public boolean Delete(String num1) //delete the element
	{
		
		
		return true;
	}
	public void Show() { // 전체 리스트를 순서대로 출력한다.

	}
	public void Add(SimpleObject1 element, Comparator<? super SimpleObject1> c) //임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다 
	{
		
		Node1 newnode = new Node1(element);
		Node1 p = first , q= null;
		if(p == null) {
			first = newnode;
		}else{
			while(p != null) {
			if(c.compare(element, p.data) <= 0) {
				newnode.link = p;
				 if (q== null){
						first = newnode;
						break;
					}else {
						q.link = newnode;
						break;
						}
			} 
			else {
				q = p;
				p = p.link;
				if( p == null) {
					q.link = newnode;
					break;
					}
				}
			}
		}
	}
	public boolean Search(SimpleObject1 data) { // 전체 리스트를 순서대로 출력한다.
		return true;
	}
}
public class Test8_Test_SimpleObjectList {

	 enum Menu {
	        Add( "삽입"),
	        Delete( "삭제"),
	        Show( "인쇄"),
	        Search( "검색"),
	        Exit( "종료");

	        private final String message;                // 표시할 문자열

	        static Menu MenuAt(int idx) {                // 순서가 idx번째인 열거를 반환
	            for (Menu m : Menu.values())
	                if (m.ordinal() == idx)
	                    return m;
	            return null;
	        }

	        Menu(String string) {                        // 생성자(constructor)
	            message = string;
	        }

	        String getMessage() {                        // 표시할 문자열을 반환
	            return message;
	        }
	    }

	    //--- 메뉴 선택 ---//
	    static Menu SelectMenu() {
			Scanner sc = new Scanner(System.in);
	        int key;
	        do {
  	            for (Menu m : Menu.values()) {
	                System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
	                if ((m.ordinal() % 3) == 2 &&
	                      m.ordinal() != Menu.Exit.ordinal())
	                    System.out.println();
	            }
	            System.out.print(" : ");
	            key = sc.nextInt();
	        } while (key < Menu.Add.ordinal() || 
	                                            key > Menu.Exit.ordinal());
	        return Menu.MenuAt(key);
	    }

	public static void main(String[] args) {
       Menu menu;                                // 메뉴 
		System.out.println("Linked List");
		LinkedList1 l = new LinkedList1();
		Scanner sc = new Scanner(System.in);
		SimpleObject1 data = null;
    System.out.println("inserted");
	     l.Show();		
	        do {
	            switch (menu = SelectMenu()) {	             
	             case Add :                           // 머리노드 삽입
	            	String sno1 =  sc.next();
	            	String sname1 =  sc.next();
	            	//l.add(sno1, sname1);
	            	data = new SimpleObject1(sno1, sname1);
	            	l.Add(data, SimpleObject1.NAME_ORDER);
	    	                   
	                     break;
	             case Delete :                          // 머리 노드 삭제
	            	 String num = sc.next();
	            	 boolean result =l.Delete(num);
	            	 if(result)
	                  	 System.out.println("삭제된 데이터는 " + num);
	                  	 else {
	                  		 System.out.println("데이터 없음");
	                  	 }
	                    break;
	             case Show :                           // 꼬리 노드 삭제
	                    l.Show();
	                    break;
	             case Search :                           // 회원 번호 검색
	            	 String sno2 =  sc.next();
		             String sname2 =  sc.next();
		            	data = new SimpleObject1(sno2, sname2);
	                boolean result1 = l.Search(data);
	                    if (result1 == false)
	                        System.out.println("검색 값 = " + data + "데이터가 없습니다.");
	                    else
	                        System.out.println("검색 값 = " + data + "데이터가 존재합니다.");
	                     break;
	             case Exit :                           // 꼬리 노드 삭제
	                    break;
	            }
	        } while (menu != Menu.Exit);
	    }
}

