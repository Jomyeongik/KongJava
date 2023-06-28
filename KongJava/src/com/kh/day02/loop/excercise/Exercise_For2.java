package com.kh.day02.loop.excercise;

import java.util.Scanner;

public class Exercise_For2 {

	public static void main(String[] args) {
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

}
