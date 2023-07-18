package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		Socket socket = null;
		String address = "127.0.0.1";
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket(address,port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			System.out.println(address);
			System.out.println("게임 준비 완료");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);	
			dis = new DataInputStream(is);
			while(true) {
				// 데이터 보내기
				System.out.print("--> ");
				String answer = sc.nextLine();
				dos.writeUTF(answer);
				dos.flush();
				
				// 데이터 받기
				String message = dis.readUTF();
				if(message.equalsIgnoreCase("end")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				if(message.startsWith("3")) {
					System.out.println(message);
					System.out.println("축하합니다. 아웃입니다.!");
					break;
				}else {
					System.out.println(message);					
				}
			}
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
