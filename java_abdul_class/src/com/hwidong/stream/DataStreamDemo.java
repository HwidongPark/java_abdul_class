package com.hwidong.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Student2 {
	int rollno;
	String name;
	String dept;
	float avg;
}

public class DataStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/circh/OneDrive/바탕 화면/dataStream.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			Student2 s = new Student2();
			s.rollno = 1;
			s.name = "John";
			s.dept = "CSE";
			s.avg = 80.5f;
			
			dos.writeInt(s.rollno);
			dos.writeUTF(s.name);
			dos.writeUTF(s.dept);
			dos.writeFloat(s.avg);
			
			fos.close();
			dos.close();
			
			FileInputStream fis = new FileInputStream("C:/Users/circh/OneDrive/바탕 화면/dataStream.txt");
			DataInputStream dis = new DataInputStream(fis);
			
			Student2 s2 = new Student2();
			s2.rollno = dis.readInt();
			s2.name = dis.readUTF();
			s2.dept = dis.readUTF();
			s2.avg = dis.readFloat();
			
			
			// 읽어올 땐 반드시 같은 순서로 읽어와야 함
			System.out.println(s2.rollno);
			System.out.println(s2.name);
			System.out.println(s2.dept);
			System.out.println(s2.avg);
			
					
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
