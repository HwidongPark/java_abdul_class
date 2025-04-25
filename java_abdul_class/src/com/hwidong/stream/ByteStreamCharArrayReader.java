package com.hwidong.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCharArrayReader {

	public static void main(String[] args) {
		try {

			// 실제로는 같은 프로그램에서 정의된 byte array가 아니라, 다른 프로그램, 다른 thread 등에서 byte array를 받아올 때 사용한다.
			byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
			
			// @@@@@@@@@ ByteArrayInputStream
			ByteArrayInputStream bis = new ByteArrayInputStream(b);
			
			int x;
			
			// ### while문 사용해서 읽어오는 방법
			while((x = bis.read()) != -1) {
				System.out.print((char) x);
			}
			
			
			// ### 한번에 다 읽어오는 방법
			String str = new String(bis.readAllBytes());
			System.out.println(str);
			
			
			
			// ### mark, reset을 지원하는지 여부 확인하기
			System.out.println(bis.markSupported());
			
			
			bis.close();
			
			
			
			// @@@@@@@@@@ Byte Array Output Stream
			// array의 size를 constructor 아규먼트로 넣음
			ByteArrayOutputStream bos= new ByteArrayOutputStream(20);
			
			bos.write('a');
			bos.write('b');
			bos.write('c');
			bos.write('d');
			
			
			// ### bos에 담아놓은 값을 리턴하는 메서드
			byte bbos[] = bos.toByteArray();
			for (byte byteElement: bbos) {
				System.out.print((char) byteElement);
			}
			System.out.println();
			
			
			// ### writeTo 
			bos.writeTo(new FileOutputStream("C:/Users/circh/OneDrive/바탕 화면/byteArrary.txt"));
			
			
			
			// @@@@@@@@@@ CharArrayReader
			char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
			
			CharArrayReader cr = new CharArrayReader(c);
			
			int xChar;
			while((xChar = cr.read()) != -1) {
				System.out.print((char) xChar);
			}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
