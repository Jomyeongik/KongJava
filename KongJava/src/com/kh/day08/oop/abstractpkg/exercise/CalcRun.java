package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
//		Calculator calc = new Calculator(); 
		//추상클래스는 객체 생성 안됨.
		Calculator calc = new GoodCalc(); // 업캐스팅
		int [] a = {1,2,3,4,5,354,15,487,524,45,123};
		System.out.println("더하기: " +calc.add(5, 3));
		System.out.println("빼기: " +  calc.substract(5, 3));
		System.out.printf("평균 : %.2f",calc.average(a));
	}

}
