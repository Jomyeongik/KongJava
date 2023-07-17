package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientServer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		OutputStream os = null; 
		InputStream is = null;
//		String address = "192.168.60.228";
		String address = "127.0.0.1";
		int port = 7777;
		try {
			System.out.println("연결 요청");
			socket = new Socket(address,port);
			System.out.println("연결 완료");
			
			while(true) {
				// 데이터 전송
				os = socket.getOutputStream();
				System.out.print("클라이언트 : ");
				String message = sc.nextLine();
				byte[] bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				if(message.equals("bye")) {
					System.out.println("연결 종료");
					break;
				}
				
				// 데이터 받기
				is = socket.getInputStream();
				bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				message = new String(bytes,0,readByteNo);
				System.out.printf("서버 : %s\n", message);
				
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
