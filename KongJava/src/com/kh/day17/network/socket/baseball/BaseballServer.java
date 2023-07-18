package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class BaseballServer {

	public static void main(String[] args) {
		int numberOfNumbers = 3;
		int min = 1;
		int max = 9;
		
		ArrayList<Integer> randomNumbers 
		= generateRandomNumbers(numberOfNumbers, min, max);			
		Date date = new Date();
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate1 = trans.format(date);
		ServerSocket serverSocket = null;
		int port = 8888;		
		InputStream is = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
				
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("서버소켓을 생성하였습니다.");
			System.out.println(transDate1);
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			System.out.print("서버 숫자 -> ");
			System.out.printf("%d %d %d\n",
					randomNumbers.get(0)
					,randomNumbers.get(1)
					,randomNumbers.get(2));
			System.out.println("서버 준비 완료");
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			while(true) {
				// 데이터 받기
				String answer = dis.readUTF();
				System.out.print("받기 : ");
				System.out.println(answer);				
				String[] check = answer.split(" ");
				// 오류메시지 보내기
				if(check.length != 3) {
					String errMsg = "end"; 
					dos.writeUTF(errMsg);
					continue;
				}
				
				boolean invalidInput = false;
				for(int i = 0; i < check.length; i++) {
					if(Integer.parseInt(check[i]) > 9) {
						String errMsg = "end"; 
						dos.writeUTF(errMsg);
						invalidInput = true;
						break;
					}
				}
				
				if(invalidInput) {
					continue;
				}
				
				
				// 받은 데이터 배열에 넣고 스트라이크 볼 판정 
				int strike = 0;
				int ball = 0;
				for(int i = 0; i < randomNumbers.size(); i++) {
					int guess = Integer.parseInt(check[i]);
					if(randomNumbers.get(i) == guess) {
						strike++;
					}else if(randomNumbers.contains(guess)) {
						ball++;
					}
				}
				System.out.printf("%d스트라이크 %d볼\n", strike,ball);
				String message = strike + "스트라이크 " + ball + "볼";
				
				// 데이터 보내기
				if(strike == 3) {
					System.out.println("아웃! 게임종료");
					dos.writeUTF(message);
					dos.flush();
					break;
				}

				dos.writeUTF(message);
				dos.flush();				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 랜덤 숫자 생성
	public static ArrayList<Integer> generateRandomNumbers(int numberOfNumbers, int min, int max){
		ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        while (randomNumbers.size() < numberOfNumbers) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
	}

}
