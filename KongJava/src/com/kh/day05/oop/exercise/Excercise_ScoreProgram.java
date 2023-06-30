package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Excercise_ScoreProgram {
	static Scanner sc = new Scanner(System.in);
	static int korean = 0;
	static int math = 0;
	static int english = 0;
	static int sum = 0;
	static boolean isRunning = true;
	public static void main(String[] args) {		
		//finish :
		while(isRunning) {
			printMenu();
			int input = sc.nextInt();
			switch(input) {
			case 1 : 
				inputScore();
				break;
				
			case 2 :
				printScore();
				break;
			
			case 3 :
				showGoodBye();
				isRunning = false;
				break;
				// break finish;
			
			default : 
				printException();
				break;
			}
		}		
	}
	public static void printMenu() {
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		korean = sc.nextInt();				
		System.out.print("영어 : ");
		english = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();		
	}
	
	public static void printScore() {
		System.out.println("===== 성적 출력 =====");
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		sum = korean + english + math;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double)(sum/3));
	}
	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
	
	
	
	
	
	
	
}
