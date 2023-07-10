package com.kh.day11.iostream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		// 입력 스트림
		InputStream is = null;
		// 출력 스트림
		OutputStream os = null;
		
		try {
			is = new FileInputStream("C:\\Users\\user1\\Desktop\\scscs\\salad.jpg");
			os = new FileOutputStream("D:\\tempworkspace\\salad.jpg");
			byte [] readBytes = new byte[1024];
			int readByteCount;
			// 파일 복사 -> 읽어 들인 후 원하는 경로에 출력하기
			while((readByteCount = is.read(readBytes)) != -1) {
//				System.out.println(readBytes);
				os.write(readBytes,0,readByteCount);
				os.flush();
			};
			System.out.println("복사가 완료되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
