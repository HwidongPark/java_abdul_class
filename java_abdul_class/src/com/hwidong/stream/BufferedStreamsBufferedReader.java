package com.hwidong.stream;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamsBufferedReader {
	public static void main(String[] args) {
		
		try (
				// file input stream은 file에 연결되어 작업함
			FileInputStream fis = new FileInputStream("C:/Users/circh/OneDrive/바탕 화면/test.txt");
				// buffered input stream은 input stream에 붙음
			BufferedInputStream bis = new BufferedInputStream(fis);
		) {
			
			int x;
//			while((x = bis.read()) != -1) {
//				
//				System.out.print((char) x);
//			}
			
			System.out.println();
			
			// File은 mark가 supported 되지 않음
			System.out.println("File " + fis.markSupported());
			// buffered stream은 mark가 supported됨
			System.out.println("Buffered " + bis.markSupported());
			
			System.out.println();
			
			// ### mark사용
			System.out.println((char) bis.read());
			System.out.println((char) bis.read());
			System.out.println((char) bis.read());
			bis.mark(10);	// mark
			System.out.println((char) bis.read());
			System.out.println((char) bis.read());
			bis.reset();	// mark한 부분으로 다시 돌아감
			System.out.println((char) bis.read());
			System.out.println((char) bis.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// @@@@@@@@@@ FileReader와 BufferedReader사용
		System.out.println("======================================== File Reader & Buffered Reader");
		try (
				// file input stream은 file에 연결되어 작업함
				FileReader fr = new FileReader("C:/Users/circh/OneDrive/바탕 화면/test.txt");
				// buffered input stream은 input stream에 붙음
				BufferedReader br = new BufferedReader(fr);
				) {
			
			int x;
//			while((x = br.read()) != -1) {
//				System.out.print((char) x);
//			}
			
			System.out.println();
			
			// File은 mark가 supported 되지 않음
			System.out.println("File " + fr.markSupported());
			// buffered stream은 mark가 supported됨
			System.out.println("Buffered " + br.markSupported());
			
			System.out.println();
			
//			// ### mark사용
			System.out.println((char) br.read());
			System.out.println((char) br.read());
			System.out.println((char) br.read());
			br.mark(10);	// mark
			System.out.println((char) br.read());
			System.out.println((char) br.read());
			br.reset();	// mark한 부분으로 다시 돌아감
			System.out.println((char) br.read());
			System.out.println((char) br.read());
			
			// reader에만 있는 readLine();
			//-> 스트링으로 값을 리턴함
			System.out.println("String " + br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
