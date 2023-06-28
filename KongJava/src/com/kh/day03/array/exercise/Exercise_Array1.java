package com.kh.day03.array.exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_Array1 {
	
	public void exercise1() {
	//양수 5개를 입력받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램을 작성하라.
	Scanner sc = new Scanner(System.in);
	//int num = sc.nextInt();
	int [] nums = new int[5];
	int max = 0;
	for(int i = 0; i < nums.length; i++) {
		nums[i] = sc.nextInt();
		if(nums[i]>max) {
			max = nums[i];
		}
	}
	System.out.println("가장 큰 수는 " + max + "입니다.");
	}
	
	public void exercise2() {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고
		// 평균을 구하는 프로그램을 작성하라.(단 배열의 크기는 5이다.)
		Scanner sc = new Scanner(System.in);
		int [] arrs = new int[5];
		int sum = 0;
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("평균 : " + (double)sum/arrs.length);
		
		// 배열에 저장된 값을 이용하여 평균 구하기!
		// for, arrs.length, typeTrans, 누적합
	}
	
	public void arrayCopyExercise() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		// 230515-1231514 -> 230515-1******
		// 231026-1231515 -> 231026-1******
		char [] origin = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 : ");
		String memberNum = sc.next();
		for(int i = 0; i < origin.length; i++) {
			origin[i] = memberNum.charAt(i);
		}
		char [] copy = new char[14]; // 깊은 복사 시작
		for(int i = 0; i < origin.length; i++) {
			if(i <8) {
			copy[i] = origin[i]; // 성별자리 전까지 차례대로 값을 대입
			}else {
				copy[i] = '*'; // 성별자리 이후엔 *로 값 대입
			}
		}
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}


		
	}
	
	public void practice1() {
		//1번
	    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		if(input >= 1) {
			for(int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice2() {
		//2번
	    //사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	    //단, 입력한 수는 1보다 크거나 같아야 합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
			if(input >= 1) {
				for(int i = input; i >=1 ; i--) {
					System.out.print(i + " ");
				}
			}
	}

	public void practice3() {
		//3번
	    //1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요. 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= input; i++) {
			sum += i;
		}
		System.out.println("합 : " + sum);
	}
	
	public void practice4() {
		//4번  
	    //사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	    //만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 값 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 <1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}else {
			if(num1>=num2) {
				for(int i = num2+1; i<num1; i++) {
					System.out.print(i + " ");
				}
			}else {
				for(int i = num1+1; i<num2; i++) {
					System.out.print(i + " ");
				}
			}
		}
	}
	
	public void practice5() {
		//5번
	    // 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		for(int i= 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + i*dan);
		}
	}
	
	public void practice6() {
		//6번  
	    //사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	    //단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		if(dan>9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}else {
			for(int i = dan; i<10; i++) {
				System.out.println(i + "단");
				for(int j = 1; j<10; j++) {
					System.out.println(i + " * " + j + " = " + i*j);
				}
				System.out.println();
			}
		}
		

	}
	
	
	
	public void lottoExcercise() {
		// 로또 번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 정렬
		// 로또 번호는 6개. 로또 번호의 범위는 1 ~ 45
		Random rand = new Random();
		int lotto[] = new int[6];
		for(int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(45)+1;
			for(int j = 0; j < 6; j++) {
				if(lotto[i] == lotto[j]) {
					while(lotto[i] != lotto[j]) {
						lotto[i] = rand.nextInt(45)+1;
					}
				}
			}
		}
		Arrays.sort(lotto);
		for(int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
	}
	
	public void RockScissorsPaper() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("==== 가위 바위 보 게임 ====");
		while(true) {
			System.out.print("숫자를 선택하세요.(1.가위 / 2.바위/ 3.보) : ");
			int choice = sc.nextInt();
			int computer = rand.nextInt(3)+1;
			
			if(choice <1 || choice >3) {
				System.out.println("1, 2, 3 중 하나를 입력하세요");
				continue;
			}
			
			if(computer == 1) {
				if(choice == 1) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 가위를 냈습니다.");
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("====================");
					System.out.println("무승부");
				}else if(choice == 2) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 바위를 냈습니다.");
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("====================");
					System.out.println("당신이 이겼습니다 ^^*");
				}else if(choice == 3) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 보를 냈습니다.");
					System.out.println("컴퓨터는 가위를 냈습니다.");
					System.out.println("====================");
					System.out.println("컴퓨터가 이겼습니다 ^^*");
				}
			}else if(computer == 2) {
				if(choice == 1) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 가위를 냈습니다.");
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("====================");
					System.out.println("컴퓨터가 이겼습니다 ^^*");
				}else if(choice == 2) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 바위를 냈습니다.");
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("====================");
					System.out.println("무승부");
				}else if(choice == 3) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 보를 냈습니다.");
					System.out.println("컴퓨터는 바위를 냈습니다.");
					System.out.println("====================");
					System.out.println("당신이 이겼습니다 ^^*");
				}
			}else if(computer == 3) {
				if(choice == 1) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 가위를 냈습니다.");
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("====================");
					System.out.println("당신이 이겼습니다 ^^*");
				}else if(choice == 2) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 바위를 냈습니다.");
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("====================");
					System.out.println("컴퓨터가 이겼습니다 ^^*");
				}else if(choice == 3) {
					System.out.println("======= 결과 =======");
					System.out.println("당신은 보를 냈습니다.");
					System.out.println("컴퓨터는 보를 냈습니다.");
					System.out.println("====================");
					System.out.println("무승부");
				}
			}
		}
	}
	
	public void practice2_1() {
		// 1번
	    // 1부터 사용자에게 입력 받은 수까지 중에서
	    // 1) 2와 3의 배수를 모두 출력하고
	    // 2) 2와 3의 공배수의 개수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		System.out.print("2와 3의 배수 : ");
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if(i % 6 == 0) {
				count++;
			}
		}
		System.out.println();
		System.out.println("2와 3의 공배수의 갯수 : " + count);
		
	}
	
	public void practice2_2() {
		// 2번
	    /*
	     * 다음과 같은 실행 예제를 구현하세요.
	     *
	     * ex. 정수 입력 : 3
	     *
	     **
	     ***
	     **
	     *
	     */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= input; i++) {
			for(int j = input; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice2_3() {
		// 3번
	    /*
	     * 다음과 같은 실행 예제를 구현하세요.
	     *
	     * ex. 정수 입력 : 4
	     *
	     ***
	     *****
	     *******
	     */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i <= input; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void UpDownGame() {
		
	}
	
	public static void main(String [] args) {
		
	}
}
