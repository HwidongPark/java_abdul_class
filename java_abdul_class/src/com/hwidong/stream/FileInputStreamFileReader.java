package com.hwidong.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamFileReader {

	public static void main(String[] args) {
		try {
			
			// ============================================ FileInputStream 사용
			FileInputStream fis = new FileInputStream("/Users/hwidong/Desktop/test123.txt");
			
			// fis.available()을 사용하여 file의 길이를 알 수 있
			byte b[] = new byte[fis.available()];
//			fis.read(b);
			
			System.out.println("================ 방법 1 시작");
			// 방법 1: String생성자에 byte array를 아규먼트로 넣어서 String으로 읽을 수 있음
//			String str = new String(b);
//			System.out.println(str);
			System.out.println("================ 방법 1 끝");
			
			
			// 방법 2: while문 사용
			//-> 다 읽으면 -1을 리턴하는 것을 이용!
			System.out.println("========== 방법 2 시작");
			int x;
			do {
				x = fis.read();
				if (x != -1) {					
					System.out.print((char) x);
				}
			} while(x != -1);
			System.out.println("");
			System.out.println("========== 방법 2 끝");
			
			fis.close();
			
			// ============================================ FileReader 사용
			// FileInputStream과 사용법은 똑같은데 byte가 아닌 character로 받음
			
			System.out.println("================ 이번엔 FileReader 사용 시");
			FileReader fr = new FileReader("/Users/hwidong/Desktop/test123.txt");
			
			int readInt;
			// 이런식으로 readInt변수에 할당하는 동시에 값과 비교할 수 있
			while ((readInt = fr.read()) != -1) {
				System.out.print((char) readInt);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Error in reading file" + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error Io in reading file." + e.getMessage());
			e.printStackTrace();
		}
		

	}

}
