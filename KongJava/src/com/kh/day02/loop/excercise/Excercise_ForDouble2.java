package com.kh.day02.loop.excercise;

public class Excercise_ForDouble2 {
	public static void main(String [] args) {
		for(int i = 0; i<24; i++) {
			for(int j = 0; j<60; j++) {
				System.out.printf("%2d시 %2d분\n",i, j);
			}
		}
	}
}
