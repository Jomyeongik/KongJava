package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	public void exercise1() {
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs[i].length-1; j >= 0; j--) {
				System.out.printf("%2d\t",arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void exercise2() {
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length ; j++) {
				System.out.printf("%2d \t",arrs[i][j]);
			}
			System.out.println();
		}
		
	}
	public void exercise3() {
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs[i].length-1; j >= 0 ; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length ; j++) {
				System.out.printf("%2d \t",arrs[i][j]);
			}
			System.out.println();
		}
		
	}
		
	
	public void exercise4() {
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length ; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		
		for(int i = 0; i < arrs.length; i++) {
			if(i%2 ==0) {
				for(int j = 0; j < arrs[i].length ; j++) {
					System.out.printf("%2d \t",arrs[i][j]);
				}	
			}else {
				for(int j = arrs[i].length-1; j >= 0; j--) {
					System.out.printf("%2d\t",arrs[i][j]);
				}
			}
			System.out.println();
		}
		
	}
	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3.3, 3.4), (3.5, 3.6), (3.7, 4.0), (4.1, 4.2)
		
		double [][] score = { {3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//		score[1][0] = 3.5;
//		score[1][1] = 3.6;
//		score[2][0] = 3.7;
//		score[2][1] = 4.0;
//		score[3][0] = 4.1;
//		score[3][1] = 4.2;
//		System.out.println(score.length);  
//		System.out.println(score[0].length);
		
		double sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("평균 : %.2f\n", result);
		
	}
	
	public static void main(String[] args) {
		
	}
}
