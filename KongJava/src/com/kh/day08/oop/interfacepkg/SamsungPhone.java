package com.kh.day08.oop.interfacepkg;

// 1.The type PhoneInterface cannot be the superclass of SamsungPhone; 
// a superclass must be a class => extends 안됨
// 2. 오버라이딩 필수
public class SamsungPhone implements PhoneInterface{

	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야~");
	}

	@Override
	public void sendCall() {
		System.out.println("뚜루루루루루");
	}

	@Override
	public void printLogo() {
		System.out.println("===== SAMSUNG =====");
	}
	
}
