package com.hwidong.stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile rf = new RandomAccessFile("C:/Users/circh/OneDrive/바탕 화면/test.txt", "rw");
			
			
			System.out.println((char) rf.read());
			System.out.println((char) rf.read());
			System.out.println((char) rf.read());
			System.out.println((char) rf.read());
			System.out.println((char) rf.read());
			System.out.println((char) rf.read());
			System.out.println((char) rf.read());
			System.out.println((char) rf.read());
//			rf.write('G');
			
			rf.skipBytes(3);
			System.out.println((char) rf.read());
			System.out.println(rf.getFilePointer());
			
			rf.seek(rf.getFilePointer() + 2);
			System.out.println((char) rf.read());
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

