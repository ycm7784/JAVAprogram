package chap8;

import java.util.Comparator;
import java.util.Scanner;

class SimpleObject {

	String sno; // 회원번호
	String sname; // 이름

	public SimpleObject(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	// --- 문자열 표현을 반환 ---//
	public String toString() {
		return "(" + sno + ") " + sname;
	}

	// --- 회원번호로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject> NO_ORDER = new NoOrderComparator();

	private static class NoOrderComparator implements Comparator<SimpleObject> {
		public int compare(SimpleObject d1, SimpleObject d2) {
			return (Integer.parseInt(d1.sno) > Integer.parseInt(d2.sno) ? 1
					: (Integer.parseInt(d1.sno) < Integer.parseInt(d2.sno) ? -1 : 0));
		}
	}

	// --- 이름으로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject> NAME_ORDER = new NameOrderComparator();

	private static class NameOrderComparator implements Comparator<SimpleObject> {
		public int compare(SimpleObject d1, SimpleObject d2) {
			return d1.sname.compareTo(d2.sname);
		}

	}
}

class Node2 {
	SimpleObject data; // 데이터
	Node2 llink; // 좌측포인터(앞쪽 노드에 대한 참조)
	Node2 rlink; // 우측포인터(뒤쪽 노드에 대한 참조)

	// --- 생성자(constructor) ---//
	Node2(SimpleObject so) {
		this.data = so;
		llink = rlink = this;
	}

	Node2() {
		this.data = null;
		llink = rlink = this;
	}

	Node2(String sno, String sname) {
		data = new SimpleObject(sno, sname);
		llink = rlink = this;
	}

	public int compareNode(Node2 n2) {
		SimpleObject so1 = this.data;
		if (SimpleObject.NO_ORDER.compare(so1, n2.data) < 0)
			return -1;
		else if (SimpleObject.NO_ORDER.compare(so1, n2.data) > 0)
			return 1;
		else
			return 0;
	}
}

class DoubledLinkedList2 {
	private Node2 first; // 머리 포인터(참조하는 곳은 더미노드)

// --- 생성자(constructor) ---//
	public DoubledLinkedList2() {
		first = new Node2(); // dummy(first) 노드를 생성

	}

// --- 리스트가 비어있는가? ---//
	public boolean isEmpty() {
		return first.rlink == first;
	}

// --- 노드를 검색 ---//
	public boolean search(SimpleObject obj, Comparator<? super SimpleObject> c, Comparator<? super SimpleObject> d) {
		Node2 ptr = first.rlink; // 현재 스캔 중인 노드

		return true;
	}

// --- 전체 노드 표시 ---//
	public void show() {
		Node2 next = first;
		while (next.rlink != first) {
			System.out.println(next.rlink.data);
			next = next.rlink;
		}
	}

// --- 올림차순으로 정렬이 되도록 insert ---//
	public void add(SimpleObject obj, Comparator<? super SimpleObject> c, Comparator<? super SimpleObject> d) {
		Node2 temp = new Node2(obj);
		Node2 next = first;
		if (next.rlink == first) { // 아무것도 없을때
			next.rlink = temp;
			temp.llink = next;
			temp.rlink = next;
			next.llink = temp;
		} else {
			while (true) {
				if (c.compare(next.rlink.data, temp.data) > 0) { // next.rlink의no이 temp의no보다 클때
					temp.llink = next;
					temp.rlink = next.rlink;
					next.rlink.llink = temp;
					if (next == first) {// 첫번째 노드로 들어갈때
						first.rlink = temp;
						break;
					} else {// 가운데 들어갈때
						next.rlink = temp;
						break;
					}
				} else if (c.compare(next.rlink.data, temp.data) < 0) {// next.rlink의no이 temp의no보다 작을때
					next = next.rlink;
					if (next.rlink == first) { // 마지막 노드로 들어갈때
						next.rlink = temp;
						temp.llink = next;
						temp.rlink = first;
						first.llink = temp;
						break;
					}
				} else {
					if (d.compare(next.rlink.data, temp.data) >= 0) {// next.rlink의name이 temp의name보다 클때
						temp.llink = next;
						temp.rlink = next.rlink;
						next.rlink.llink = temp;
						if (next == first) {// 첫번째 노드로 들어갈때
							first.rlink = temp;
							break;
						} else {// 가운데 들어갈때
							next.rlink = temp;
							break;
						}
					} else {// next.rlink의name이 temp의name보다 작을때
						next = next.rlink;
						if (next.rlink == first) { // 마지막 노드로 들어갈때
							next.rlink = temp;
							temp.llink = next;
							temp.rlink = first;
							first.llink = temp;
							break;
						}
					}

				}
			}
		}

	}

// --- list에 삭제할 데이터가 있으면 해당 노드를 삭제 ---//
	public boolean delete(SimpleObject obj, Comparator<? super SimpleObject> c, Comparator<? super SimpleObject> d) {
		Node2 next = first;
		while (next.rlink != first) {
			if (c.compare(next.rlink.data, obj) == 0 && d.compare(next.rlink.data, obj) == 0) {
				next.rlink.rlink.llink = next;
				next.rlink = next.rlink.rlink;
				return true;

			} else {
				next = next.rlink;
			}
		}
		return false;
	}

	public void merge(DoubledLinkedList2 lst2, Comparator<? super SimpleObject> c, Comparator<? super SimpleObject> d) {
		// DoubledLinkedList2 lst3 = new DoubledLinkedList2();
		Node2 ai = this.first.rlink, bi = lst2.first.rlink;
		while (true) {
			if (ai.rlink == this.first) {// ai가 마지막 노드일때
				if (c.compare(ai.data, bi.data) > 0) {// bi번호가 ai 보다 작을경우
					bi.llink = ai.llink;
					ai.llink.rlink = bi;
					bi = bi.rlink; // bi를 다음 node로 이동
					bi.llink.rlink = ai;
					ai.llink = bi.llink;
					if (bi == lst2.first) {
						break;
					}
				} else {
					bi.llink = ai;
					ai.rlink.llink = bi;
					bi = bi.rlink; // bi를 다음 node로 이동
					bi.llink.rlink = ai.rlink;
					ai.rlink = bi.llink;
					if (bi == lst2.first) {
						break;
					}
				}
			} else if (c.compare(ai.data, bi.data) < 0 && c.compare(ai.rlink.data, bi.data) > 0) {// bi의 번호가 ai번호보다 크고
																									// ai의rlink의 번호보다
																									// 작은경우
				bi.llink = ai;
				ai.rlink.llink = bi;
				bi = bi.rlink; // bi를 다음 node로 이동
				bi.llink.rlink = ai.rlink;
				ai.rlink = bi.llink;

				ai = ai.rlink.rlink; // ai를 다음 노드로 이동
				if (bi == lst2.first) {
					break;
				}
			} else if (c.compare(ai.data, bi.data) > 0) {// bi번호가 ai 보다 작을경우
				bi.llink = ai.llink;
				ai.llink.rlink = bi;
				bi = bi.rlink; // bi를 다음 node로 이동
				bi.llink.rlink = ai;
				ai.llink = bi.llink;
				if (bi == lst2.first) {
					break;
				}
			} else if (c.compare(ai.rlink.data, bi.data) < 0) { // bi번호가 ai의rlink의번호보다 클경우
				ai = ai.rlink; // ai를 다음 노드로 이동
				if (bi == lst2.first) {
					break;
				}
			}
		}
	}
}

public class Chap8_Test_SimpleObjectCircularDList {
	enum Menu {
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Merge("병합"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc1 = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc1.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu; // 메뉴
		System.out.println("Linked List");
		DoubledLinkedList2 lst1 = new DoubledLinkedList2();
		DoubledLinkedList2 lst2 = new DoubledLinkedList2();
		String sno1 = null, sname1 = null;
		do {
			switch (menu = SelectMenu()) {
			case Add: // 머리노드 삽입
				Scanner sc = new Scanner(System.in);
				System.out.println(" 회원번호: ");
				sno1 = sc.next();
				System.out.println(" 회원이름: ");
				sname1 = sc.next();
				SimpleObject so = new SimpleObject(sno1, sname1);
				lst1.add(so, SimpleObject.NO_ORDER, SimpleObject.NAME_ORDER);
				break;
			case Delete: // 머리 노드 삭제
				Scanner sc2 = new Scanner(System.in);
				System.out.println(" 회원번호: ");
				sno1 = sc2.next();
				System.out.println(" 회원이름: ");
				sname1 = sc2.next();
				SimpleObject so2 = new SimpleObject(sno1, sname1);
				boolean result = lst1.delete(so2, SimpleObject.NO_ORDER, SimpleObject.NAME_ORDER);
				if (result)
					System.out.println("삭제된 데이터는 " + so2);
				else {
					System.out.println("데이터 없음");
				}

				break;
			case Show: // 꼬리 노드 삭제
				lst1.show();
				break;
			case Search: // 회원 번호 검색
				Scanner sc3 = new Scanner(System.in);
				System.out.println(" 회원번호: ");
				sno1 = sc3.next();
				System.out.println(" 회원이름: ");
				sname1 = sc3.next();
				SimpleObject so3 = new SimpleObject(sno1, sname1);
				boolean result1 = lst1.search(so3, SimpleObject.NO_ORDER, SimpleObject.NAME_ORDER);
				if (result1 == false)
					System.out.println("검색 값 = " + so3 + "데이터가 없습니다.");
				else
					System.out.println("검색 값 = " + so3 + "데이터가 존재합니다.");
				break;
			case Merge:
				while (true) {
					Scanner sc4 = new Scanner(System.in);
					System.out.println(" 회원번호: ");
					sno1 = sc4.next();
					System.out.println(" 회원이름: ");
					sname1 = sc4.next();
					SimpleObject so4 = new SimpleObject(sno1, sname1);
					lst2.add(so4, SimpleObject.NO_ORDER, SimpleObject.NAME_ORDER);
					System.out.println(" 그만입력하고싶으면 stop을 입력하세요 ");
					String start = sc4.next();
					if (start.equals("stop")) {
						break;
					}
				}

				lst1.merge(lst2, SimpleObject.NO_ORDER, SimpleObject.NAME_ORDER);
				break;
			case Exit: // 꼬리 노드 삭제
				break;
			}
		} while (menu != Menu.Exit);
	}
}
