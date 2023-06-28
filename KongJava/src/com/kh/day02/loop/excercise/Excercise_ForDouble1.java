package com.kh.day02.loop.excercise;

public class Excercise_ForDouble1 {
	public static void main(String [] args) {
		// 구구단 출력
//		for(int k = 2; k < 10; k++) {
//			System.out.println(k + "단");
//			for(int h = 1; h < 10; h++) {
//				System.out.println(k + " * " + h + " = " + k*h);
//			}
//			System.out.println();
//		}
//		System.out.println("3단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("3 * " + h + " = " + 3*h);
//		}
//		System.out.println("4단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("4 * " + h + " = " + 4*h);
//		}
//		System.out.println("5단");
//		for(int h = 1; h < 10; h++) {
//			System.out.println("5 * " + h + " = " + 5*h);
//		}
		
		for(int k = 2; k <10; k++) {
			System.out.print("     "+k + "단" + "\t");
		}
		System.out.println();
		for(int j = 1; j <10 ; j++) {
			for(int i = 2; i < 10; i++) {
//				System.out.print(i + " * " + j +" = " + i*j + "\t");
				System.out.printf("%2d * %2d = %2d \t", i,j,i*j);
			}
			System.out.println();
		}
	}
}
