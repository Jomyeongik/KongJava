package com.kh.day02.condition.exercise;

import java.util.Scanner;
public class Exercise_If2 {
	public static void main(String [] args)
	{
		//switch 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 
		//에스프레소, 카푸치노, 카페라떼는 3500원이고, 아메리카노는 2000원이다.
		Scanner sc = new Scanner(System.in);
		System.out.print("커피종류를 선택하세요 : ");
		int price = 0;
		String menu = sc.next();
		switch(menu) {
			case "에스프레소" :
			case "카푸치노" :
			case "카페라떼" :
				price = 3500;
				break;
			case "아메리카노" :
				price = 2000;
				break;
			default :
				System.out.println("메뉴에 없습니다.");
		}
		System.out.println(menu + "의 가격은 " + price + "원 입니다.");
		
	}
}
