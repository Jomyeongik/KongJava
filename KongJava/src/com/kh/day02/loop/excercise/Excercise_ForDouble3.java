package com.kh.day02.loop.excercise;

import java.util.Scanner;

public class Excercise_ForDouble3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int inputNumber = sc.nextInt();
		for(int i = 1; i <= inputNumber; i++) {
			for(int j=1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
