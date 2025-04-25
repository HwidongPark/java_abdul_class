package com.hwidong.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) {
		
		try {			
			
			// FileOutputStream 생성자의 아규먼트로 어디에 저장하고 싶은지 파일명을 포함한 경로를 넣는다.
			// 윈도우도 backward slash 대신에 forward slash를 사용
			FileOutputStream fos = new FileOutputStream("/Users/hwidong/Desktop/test.txt");
			
			String content = "Learn Java Program";
			
			byte b[] = content.getBytes();
			
			// byte배열을 넣어도 작동함
			 fos.write(b);
			
//			for (byte x : b) {
//				// 이렇게 하나하씩 넣어도 작동함
//				fos.write(x);
//			}
			
			
			// ### offset, length를 사용해서 원하는 범위만 작성할 수도 있음
//			fos.write(b, 6, 4);
//			
//			fos.close();
			
			
			// try with resource사용해서 close 까먹을 걱정없이 resource사용 가능
			try (FileOutputStream fos2 = new FileOutputStream("/Users/hwidong/Desktop/test2.txt")) {
				fos2.write(b);
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found Exception 발생");
			System.out.println(e);
		} catch(IOException e) {
			System.out.println("IOException 발생");
			System.out.println(e);
		}
		
		// try with resource사용해서 close 까먹을 걱정없이 resource사용 가능
		try (FileOutputStream fos2 = new FileOutputStream("C:/Users/circh/OneDrive/바탕 화면/test2.txt")) {
			String text ="Hwidong";
			byte bb[] = text.getBytes();
			fos2.write(bb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
