package com.kh.day07.oop.polymorphism.overriding;

class SuperClass {
	void paint() {
		draw();
	}
	void draw() {
		System.out.println("Super Object");;
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}




public class SampleProgram {

	public static void main(String[] args) {
		SuperClass ex = new SubClass();
		ex.paint();
	}

}
