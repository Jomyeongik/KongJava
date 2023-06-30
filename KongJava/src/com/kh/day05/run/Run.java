package com.kh.day05.run;

import java.util.Scanner;

import com.kh.day05.oop.Book;
import com.kh.day05.oop.Circle;
import com.kh.day05.oop.exercise.Rectangle;

public class Run {
	public static void main(String[] args) {
//		Circle circle = new Circle();
//		Circle circle2 = new Circle();
//		Circle circle3 = new Circle();
//		Circle circle4 = new Circle();
//		
//		circle.radius = 100;
//		circle2.radius = 1000;
//		circle3.radius = 10000;
//		
//		System.out.println(circle.getArea());
//		System.out.println(circle2.getArea());
//		System.out.println(circle3.getArea());
		
//		Circle pizza;
//		pizza = new Circle(10,"청년피자");
//		double area = pizza.getArea();
//		System.out.println(pizza.name + "의 면적은 " + area);
//		
//		Circle donut = new Circle(2,"청년도넛");
//		area = donut.getArea();
//		System.out.printf("%s의 면적은 %.2f",donut.name, area);
		
		
		
//		Scanner sc = new Scanner(System.in);
//		Rectangle rectangle = new Rectangle();
//		System.out.print("높이 입력 : ");
//		rectangle.height = sc.nextInt();
//		System.out.print("너비 입력 : ");
//		rectangle.width = sc.nextInt();
//		int area = rectangle.getArea();
//		System.out.println("넓이는 " + area);
		
//		Book littlePrince = new Book();
//		littlePrince.title = "어린왕자";
//		littlePrince.author = "생텍쥐페리";
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		
		Book loveStory = new Book("춘향뎐");
		System.out.println(littlePrince.title + ", " + littlePrince.author);
		System.out.println(loveStory.title + ", " + loveStory.author);
		
		
		
		
	}
}
