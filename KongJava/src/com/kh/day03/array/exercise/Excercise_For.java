package com.kh.day03.array.exercise;

import java.util.Scanner;

public class Excercise_For {
	public void ExcerciseFor1() {
		// 1부터 10까지의 덧셈을 표시하고 합도 구하시오.
		// 1+2+3+4+5+6+7+8+9+10=55
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum +i;
			if(i == 10) {
			System.out.print(i);
			}else {
			System.out.print(i + "+");
			}
		}
		System.out.println("=" + sum);
	}
	public void ExcerciseFor2() {

		// 1부터 10까지의 
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면 "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력해주세요 : ");
		int inputNumber = sc.nextInt();
		if(inputNumber > 0 && inputNumber < 10) {
			for(int j = 1; j < 10; j++) {
				System.out.println(inputNumber + " * " + j + " = " + inputNumber*j);
			}
		}else {
			System.out.println("1 ~ 9사이의 양수를 입력하여야 합니다.");
		}
	}
	public void ExcerciseForDouble1() {
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
	public void ExcerciseForDouble2() {

		for(int i = 0; i<24; i++) {
			for(int j = 0; j<60; j++) {
				System.out.printf("%2d시 %2d분\n",i, j);
			}
		}
	}
	public void ExcerciseForDouble3() {
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
	public void ExcerciseWhile1() {
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면
		// 입력한 수의 합을 출력하시오.
		// 정수하나 입력 : 3
		// 정수하나 입력 : 4
		// 정수하나 입력 : 7
		// 정수하나 입력 : -1
		// 입력하신 수의 합은 14입니다.
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while(num != -1) {
			System.out.print("정수 하나 입력 : ");
			num = sc.nextInt();
			if(num != -1) {
				sum += num;
			}
		}
		System.out.println("입력하신 수의 합은 " + sum + " 입니다.");
	}
	public void ExcerciseWhile2() {

		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		int i = 0 ;
		int sum = 0;
		while(i<=100) {
			if(i % 2 == 1) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("1 ~ 100사이의 홀수의 합 = " + sum);
	}
	public static void main(String[] args) {
		
	}
}
