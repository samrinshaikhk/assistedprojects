package com.Inheritance;

class Employee {
	float salary = 40000;
}

class Programmer extends Employee {
	int bonus = 10000;
	
	public void printSalary() {
		System.out.println("Base salary (From parent)"+ salary);
		System.out.println(bonus);
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.printSalary();
	}

}
