package com.hwidong.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamFileReader {

	public static void main(String[] args) {
		
		try (
				FileInputStream fis = new FileInputStream("C:/Users/circh/OneDrive/바탕 화면/test.txt");
				FileReader fr = new FileReader("C:/Users/circh/OneDrive/바탕 화면/test.txt");
		) {
			
			// ### FileInputStream 사용
//			int available = fis.available();
//			System.out.println("available = " + available);
//			
//			byte b[] = new byte[available];
//			
//			fis.read(b);
//			String content = new String(b);
//			System.out.println(content);
			
			// 한글자씩 출력하는 방법
//			int x;
//			do {
//				x=fis.read();
//				if (x == -1) {
//					return;
//				}
//				System.out.print((char) x);
//			} while(x != -1);
			

			// ### FileReader사용
			System.out.println("============================== FileReader 사용 ==============================");
			int xForFR;
			while ((xForFR = fr.read()) != -1) {
				System.out.print((char) xForFR);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
