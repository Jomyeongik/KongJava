package com.kh.day11.iostream.exercise;

import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 입력 : ");
		String fileName = sc.next();
		
		// 경로 입력 및 파일명으로 파일 생성해줌
		Writer writer = null;
		// 무한반복하여 입력받는데 exit를 입려하면 빠져나오는 코드
		System.out.println("종료는 EXIT");
		for(int i = 1;; i++) {
			System.out.print(i + "");
			String input = sc.nextLine();
			// exit입력하면 무한반복 빠져나오기
			if(input.equals("exit")) break;
		}
		
	}

}
