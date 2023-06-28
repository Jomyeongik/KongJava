package com.kh.day01;

public class Hello {
	public static int sum(int num1, int num2) {
		// This method must return a result of type int
		return num1+num2;
	}
	
	public static void main(String [] args)
	{
		int i = 20;
		int s;
		char a;

//		주석은 Ctrl + Shift + C
//		줄삭제는 Ctrl + D
//		실행 취소를 취소 Ctrl + Y
		
		a = '?';
		s = sum(i, 10);
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
	}
}