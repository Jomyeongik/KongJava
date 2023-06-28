package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args)
	{
		// 단항 연산자
		int a1 = 1;
		System.out.println(a1++); // 후위연산 (나중연산)
		// a가 2인 상태임
		System.out.println(++a1); // 전위연산 (먼저연산)
		// a가 3인 상태임
		System.out.println(a1);
		
		//문제1
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b=(--a)+b;
		c=(a++)+(--b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		// 문제2
		boolean flag = true;
		System.out.print(!!!!flag);
		
		// 문제3
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
