package com.hwidong.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ByteArrayStreamAndCharArray {

	public static void main(String[] args) {
		
		try {
			byte[] b = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
			
			
			// ================================================== ByteArrayInputStream 시작
			
			// 보통은 byte array다룰때 for loop, for-each loop 등을 사용하여 byte elements들을 다룸
			// byte array는 stream으로 다를 수 있음.. 여기서는 byte array를 stream으로 다루는 demo를 할 것임
			
			
			//### byte array를 아규먼트로 받아서 ByteArrayInputStream 객체를 만듦
			ByteArrayInputStream bis = new ByteArrayInputStream(b);
			
			// 방법 1: while(또는 do-whil)문과 bis.read()로 byte 하나하나 읽어오는 방법
//			int x;
//			while ((x = bis.read()) != -1) {
//				System.out.print((char) x);
//			}
		
			// 방법 2: byte array를 한번에 다 읽어오는 방법
			//-> 위에 byte array를 선언하고 다 읽어오는게 무슨 의미냐 하겠지만,
			// "실제 환경"에서는 다른 thread에서 byte array를 읽어오거나, remote computer에서 읽어오는 등 여러 다른 환경에서 byte array를 받아올 수 있음을 생각해야 함
//			String str = new String(bis.readAllBytes());
//			System.out.println(str);
			
			
			
			// ### mark, reset를 support하는지 여부 확인하여 mark, reset을 안전하게 사용할 수 있음
			//-> mark support하는지 여부 확인은 ByteInputStream객체의 .markSupported(); 메서드를 사용
			// 참고: mark, reset에 대해 자세히 알고 싶으면 bufferedStream으로 가서 확인.. 거기서 설명해 놓음
			
			
			System.out.println(bis.markSupported());	//-> 여기서는 Array이기 때문에 mark가 support됨.. 파일 같은 경우 한번 가면 못 돌아와서 지원되지 않음
			bis.close();
			
			
			
			// ============================================================ ByteArrayOutputStream 설명 시
			// ByteArrayOutputStream을 생성할때 생성자 아규먼트로 byte array의 length를 아규먼트로 넣어줄 수 있음
			// 참고: 생성자에 아규먼트를 넣지 않으면 default size의 byte 배열을 만들어 사용함. (default size = 32)
			ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
			
			// bos.write( ... );를 하면 ByteArrayOutputStream에 데이터를 return함
			//-> 즉, output stream으로 데이터를 흘려보낸다는 의미. 
			bos.write('a');
			bos.write('b');
			bos.write('c');
			bos.write('d');
			
			
			byte b2[] = bos.toByteArray();
			
			// String 생성자에 byte array넣어서 문자열 확인 가능...
			//-> 이거 읽었다고 byte array stream에서 byte array가 사라지지는 않음 
			System.out.println(new String(b2));
			
			
			// for each 문으로 문자열 확인
//			for (byte byteElement : b2) {
//				System.out.print((char) byteElement);
//			}
			
			
			// BtyeArrayOutputStream을 다른 OutputStream에 넣을 수도 있음
			// ### byteArrayOutputStream 객체의 writeTo 메서드 아규먼트로 FileOutputStream객체를 넣으면 바로 파일을 작성함
			bos.writeTo(new FileOutputStream("/Users/hwidong/Desktop/byteArrayOutputTest.txt"));
			
			
			// ================================================== CharacterArrayReader 설명 시작
			char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };

			CharArrayReader cr = new CharArrayReader(c);
			
			int x;
			
			while ((x = cr.read()) != -1) {
				System.out.print((char) x);
			}
			
			
			// ================================================== CharacterArrayWriter 설명 시작
			CharArrayWriter cw = new CharArrayWriter();
			
			
			// char를 넣을 수도 있고, 그냥 char 배열을 write()의 아규먼트로 입력할 수 있음
			cw.write('g');
			cw.write('h');
			cw.write('i');
			cw.write('j');
			cw.write('k');

			// .write( ... )에 String을 넣을 수도 있음
//			cw.write("ghijk");
			
			FileWriter fw = new FileWriter("/Users/hwidong/Desktop/charArrayWriter.txt");
			cw.writeTo(fw);
			
			// 참고: FileWriter의 경우 반드시 close 해줘야 파일에 내용을 작성
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
