package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버 소켓 생성");
			System.out.println("클라이언트 대기");
			Socket socket = serverSocket.accept();
			System.out.println("연결 완료");
			while(true) {
				// 데이터 받기
				is = socket.getInputStream();
				byte[] bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				String message = new String(bytes,0,readByteNo);
				System.out.printf("클라이언트 : %s\n", message);
				// 데이터 전송
				os = socket.getOutputStream();
				System.out.print("서버 : ");
				message = sc.nextLine();
				bytes = message.getBytes();
				os.write(bytes);
				os.flush();		
				if(message.equals("bye")) {
					System.out.println("연결 종료");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
