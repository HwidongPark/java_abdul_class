package com.hwidong.stream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

class Student1 {
	int rollno;
	String name;
	String dept;
}

public class PrintStreamDemo {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/circh/OneDrive/바탕 화면/printStream.txt");
			
			PrintStream ps = new PrintStream(fos);
			
			
			Student1 s = new Student1();
			s.rollno = 10;
			s.name = "John";
			s.dept = "CSE";
			
			// ### print stream 으로 file작성
			ps.println(s.rollno);
			ps.println(s.name);
			ps.println(s.dept);
			
			
			ps.close();
			fos.close();
			
			
			FileReader fis = new FileReader("C:/Users/circh/OneDrive/바탕 화면/printStream.txt");
			BufferedReader br = new BufferedReader(fis);
			
			Student1 s2 = new Student1();
			s2.rollno = Integer.parseInt(br.readLine());
			s2.name = br.readLine();
			s2.dept = br.readLine();
			
			System.out.println(s2.rollno);
			System.out.println(s2.name);
			System.out.println(s2.dept);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
