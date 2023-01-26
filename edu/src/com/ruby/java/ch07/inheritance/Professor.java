package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	public Professor(String name, int age, String subject) {
		super.setName(name);
		super.setAge(age);
		this.subject = subject;
		System.out.println("profesoor(name, age, subject) 생성자 실행");
	}
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Professor() {
		System.out.println("Professor 생성자 실행!");
	}
}