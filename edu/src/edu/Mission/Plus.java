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
		ArrayList<String> list = new ArrayList<>();
		String str;
			while ((str = br.readLine()) != null) {
				System.out.printf(str);
				list.add(str);
			}
			return list;
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) throws FileNotFoundException,
IOException {
		
		//택스트 데이터를 배열안에 넣는다.
		made();
			
		
		
		//배열을 역순으로 만든다
		//계산 
		//출력
	
	}

}
