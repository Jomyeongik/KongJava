package com.kh.day02.loop.excercise;

import java.util.Scanner;

public class Excercise_Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count < 3) {
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char operator = sc.next().charAt(0);
			int result=0;
			switch(operator) {
			case '+' : 
				result = num1+num2;
				break;
			case '-' :
				result = num1-num2;
				break;
			case '*' :
				result = num1*num2;
				break;
			case '/' :
				result = num1/num2;
				break;
			case '%' :
				result = num1%num2;
				break;
			default :
				System.out.println("잘못입력");
				operator= '^';
				break;
			}
			if(operator != '^') {
			System.out.println(num1 + " " +operator +" "+ num2 + " = " + result);
			count++;
			}
		}
		
		
	}
}
