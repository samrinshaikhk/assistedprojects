package com.Abstraction;

abstract class Shape {
	abstract void draw();
	
	void test() {
		System.out.println("Hello Test!!");
	}
}

class Rectangle extends Shape {

	void draw() {
		System.out.println("Ractangle draw");
	}

}

class Circle extends Shape {
	void draw() {
		System.out.println("Circle draw");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Shape shape = new Rectangle();
		shape.draw();
		shape.test();
		
		Shape shape1 = new Circle();
		shape1.draw();
		}
}
