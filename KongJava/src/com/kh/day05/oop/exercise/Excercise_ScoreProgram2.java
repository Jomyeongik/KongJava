package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Excercise_ScoreProgram2 {
	static Scanner sc = new Scanner(System.in);
	static int sum = 0;
	static boolean isRunning = true;
	public static void main(String[] args) {		
		//finish :
		while(isRunning) {
			printMenu();
			int input = sc.nextInt();
			switch(input) {
			case 1 : 
				Student.inputScore();
				break;
				
			case 2 :
				Student.printScore();
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
	


	
	public static void showGoodBye() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못입력하셨습니다. 메뉴를 선택해주세요.");
	}
	
	
	
	
	
	
	
}
