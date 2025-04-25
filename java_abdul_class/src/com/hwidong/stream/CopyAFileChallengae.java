package com.hwidong.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class CopyAFileChallengae {

	public static void main(String[] args) {
		
		try (
				FileInputStream fis = new FileInputStream("C:/Users/circh/OneDrive/바탕 화면/source.txt");
//				FileOutputStream fos = new FileOutputStream("C:/Users/circh/OneDrive/바탕 화면/copiedSource.txt");
				FileInputStream fis2 = new FileInputStream("C:/Users/circh/OneDrive/바탕 화면/copiedSource.txt");
				SequenceInputStream sis = new SequenceInputStream(fis, fis2);
				FileOutputStream fos2 = new FileOutputStream("C:/Users/circh/OneDrive/바탕 화면/copiedSource2.txt");
		) {
			
			// ### 소스 파일 읽어오기
			int intRead;
			
//			while ((intRead = fis.read()) != -1) {
//				if (intRead >= 65 && intRead <= 90) {
//					fos.write(intRead + 32);
//				} else {
//					fos.write(intRead);
//				}
//			}
			
			while((intRead = sis.read()) != -1) {
				fos2.write(intRead);
			}
						
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
