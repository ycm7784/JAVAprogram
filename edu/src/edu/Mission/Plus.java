package edu.Mission;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//		String str = br.readLine();
//		System.out.println(str);
//		String[] arr = new String[100];
//		String[] arr2 = new String[100];
//		arr = str.split("");
//		for(int i=0;i< arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
public class Plus {
	public static ArrayList<String>  made(){ 
	try (BufferedReader br = new BufferedReader(new FileReader("num.txt"));) {
		
		ArrayList<String> list = new ArrayList<String>();
		String str;
			while ((str = br.readLine()) != null) {
				//System.out.printf(str);
				list.add(str);
			}
			return list;
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public static ArrayList<Integer> reversemade(String i){
			String p[]= i.split("");
			
			ArrayList<Integer> re = new ArrayList<>();
			for(int i1 = p.length -1 ; 0 <= i1 ; i1--) {
				re.add(Integer.parseInt(p[i1]));
			}
			
			return re;
			
	}
		
	
	public static void main(String[] args)  {
		
		//택스트 데이터를 배열안에 넣는다.
		ArrayList<String> strArr = made();
		if (strArr == null) {
			System.out.println("Error");
			return;
		}
		System.out.print("2수");
		System.out.println(strArr);
		//배열을 역순으로 만든다
		ArrayList<Integer> arr1 = reversemade(strArr.get(0));
		System.out.print("arr1의 배열");
		System.out.println(arr1);
		ArrayList<Integer> arr2 = reversemade(strArr.get(1));
		System.out.print("arr2의 배열");
		System.out.println(arr2);
		
		
		//계산 
		// arr1를크게 만든다
		if (arr1.size() < arr2.size() ) {
			ArrayList<Integer> temp = arr1;
			arr1 = arr2;
			arr2 = temp;	
		}
		// 둘의 크기가 같을 경우
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		int add = 0;
		int z = arr2.size()-1;
		for(int i =0; i< arr2.size();i++){ 
			int sum =arr1.get(i)+arr2.get(i) +add;
			
			if(sum>=10) {
				sum=sum%10;
				add= 1;
			}else {
				add =0;
			}
			arr3.add(sum);
		}
		// 한쪽을 숫자자리가 더클경우 
		if(arr1.size() > arr2.size()) {
			for( int j=arr2.size(); j<= arr1.size()-1;j++){ 
				arr3.add(arr1.get(j)+add);
				add=0;
			}
		}
		
		//출력
		System.out.print("계산결과:");
		for (int i = arr3.size() -1 ;0 <= i ; i--) {
			
			System.out.print(arr3.get(i));
			
		}
	}
		

}
