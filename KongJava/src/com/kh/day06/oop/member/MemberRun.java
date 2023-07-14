package com.kh.day06.oop.member;

import java.util.Scanner;

public class MemberRun {

	public static void main(String[] args) {
		
		Member [] memArrs = new Member[3];
		finish :
			while(true) {
				int choice = printMenu();
				switch(choice) {
				case 1 : 
					inputScore(memArrs);
					break;
				case 2 :
					printScore(memArrs);
					break;
				case 3 : 
					checkPass(memArrs);
					break;
				case 4 : 
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				default :
					System.out.println("해당 메뉴는 존재하지 않습니다.");
					break;
				}
			}

	}

	private static void checkPass(Member[] memArrs) {
		// 1번 종목 80이상 필수
		// 2번 3번종목 50점이상 필수
		// 1,2,3평균 75이상 합격
		for(int i = 0; i < memArrs.length; i++) {
			int mem1 = memArrs[i].getFirstScore();
			int mem2 = memArrs[i].getSecondScore();
			int mem3 = memArrs[i].getThirdScore();
			double avg = memArrs[i].getAvg();
			System.out.print(memArrs[i].name + "의 결과 : ");
			if(mem1 < 80) {
				System.out.println("탈락! - 1번종목 점수 미달");
			}else{
				if(mem2 >= 50 && mem3 >= 50 && avg >= 75 ) {
					System.out.println("합격!");
				}else if(mem2 < 50 && mem3 >= 50 && avg >=75){
					System.out.println("탈락! - 2번종목 점수 미달");
				}else if(mem3 < 50 && mem2 >= 50 && avg >=75) {
					System.out.println("탈락! - 3번종목 점수 미달");
				}else {
					System.out.println("탈락! - 평균점수 미달");
				}
				
				
			

			}
		}
	}		
		
	

	private static void printScore(Member[] memArrs) {
		System.out.println("===== 점수 확인 =====");
		for(int i = 0; i < memArrs.length; i++) {
			System.out.println(memArrs[i].getName() + "의 점수");
			System.out.println("1번 종목 : " + memArrs[i].getFirstScore());
			System.out.println("2번 종목 : " + memArrs[i].getSecondScore());
			System.out.println("3번 종목 : " + memArrs[i].getThirdScore());
		}
	}

	private static void inputScore(Member[] memArrs) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < memArrs.length; i++) {
			System.out.println("===== 점수 입력 =====");
			System.out.print("사용자 이름 입력 : ");
			String name = sc.next();
			System.out.print("1번 종목 점수 : ");
			int FirstScore = sc.nextInt();
			System.out.print("2번 종목 점수 : ");
			int SecondScore = sc.nextInt();
			System.out.print("3번 종목 점수 : ");
			int ThirdScore = sc.nextInt();		
			memArrs[i] = new Member();
			memArrs[i].setName(name);
			memArrs[i].setFirstScore(FirstScore);
			memArrs[i].setSecondScore(SecondScore);
			memArrs[i].setThirdScore(ThirdScore);			
		}
		
		
	}

	private static int printMenu() {
		System.out.println("===== 종합 프로그램 =====");
		System.out.println("1. 점수 입력");
		System.out.println("2. 점수 출력");
		System.out.println("3. PASS 확인");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		return choice;
	}

}
