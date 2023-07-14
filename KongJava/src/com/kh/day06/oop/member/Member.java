package com.kh.day06.oop.member;

public class Member {
	// 입력받을거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	String name;
	int FirstScore;
	int SecondScore;
	int ThirdScore;
	
	public Member() {
		
	}
	
	public Member(String name, int FirstScore, int SecondScore, int ThirdScore) {
		this.name = name;
		this.FirstScore = FirstScore;
		this.SecondScore = SecondScore;
		this.ThirdScore = ThirdScore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstScore() {
		return FirstScore;
	}
	public void setFirstScore(int firstScore) {
		this.FirstScore = firstScore;
	}
	public int getSecondScore() {
		return SecondScore;
	}
	public void setSecondScore(int secondScore) {
		this.SecondScore = secondScore;
	}
	public int getThirdScore() {
		return ThirdScore;
	}
	public void setThirdScore(int thirdScore) {
		this.ThirdScore = thirdScore;
	}
	
	public double getAvg() {
		double avg = (this.FirstScore + this.SecondScore +this.ThirdScore)/3;
		return avg;
	}
}
