package com.ruby.java.ch09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test20 {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat f1 = new SimpleDateFormat("hh 'o' 'clock' a, zzzz");
		SimpleDateFormat f2 = new SimpleDateFormat("k:mm a ,z");
		SimpleDateFormat f3 = new SimpleDateFormat("yy년 MM월 dd일 E요일 hh시 mm분 ss초 a");
		SimpleDateFormat f4 = new SimpleDateFormat("EEE, MMM d ''yy", new Locale("en"));
		SimpleDateFormat f5 = new SimpleDateFormat("yyyy MMMM dd hh : mm aaa", new Locale("en"));
		System.out.println(f1.format(date));
		System.out.println(f2.format(date));
		System.out.println(f3.format(date));
		System.out.println(f4.format(date));
		System.out.println(f5.format(date));
		
		SimpleDateFormat f6 = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = f6.parse("2022 -03-19");
		System.out.println(f4.format(date2));
	}

}
