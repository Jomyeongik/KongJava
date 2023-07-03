package com.kh.day06.oop.exercise;

public class Student {
	String name;
	int kor;
	int math;
	int eng;

	
	public Student() {
		name = "";
		kor = 0;
		math = 0;
		eng = 0;

	}
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student(String name,int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
	
	public double getAvg() {
		double avg = (this.kor + this.eng + this.math)/3;
		return avg;
	}
}
