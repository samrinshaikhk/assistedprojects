package com.Encapsulation;


public class Student {

	private String name;
	private String age;
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Samrin");
	}
}
