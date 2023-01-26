package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	public Employee(String name, int age, String dept) {
		super.setName(name);
		super.setAge(age);
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행");
	}
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	///public String toString() {
//		return  name":"+age+":"+dept;
	//	return super.toString() +dept;
	//	}
	public Employee() {
		super();
		System.out.println("Employee 생성자 실행!");
	}
}