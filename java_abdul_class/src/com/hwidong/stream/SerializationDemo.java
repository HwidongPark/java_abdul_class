package com.hwidong.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student3 implements Serializable {
	int rollno;
	String name;
	String dept;
	float avg;
	
	public static int Data=10;
	// transient는 serialization에서 제외됨
	public transient int t;
	
	
	// ### object를 deserialization하려면 반드시 non-parameter constructor가 있어야 함
	public Student3() {
		
	}
	
	public Student3(int r, String n, float a, String d) {
		rollno = r;
		name = n;
		avg = a;
		dept = d;
		Data = 500;
		t = 500;
	}
	
	
	public String display() {
		return "\nStudent Details\n" +
				"\nRoll " + rollno +
				"\nName " + name + 
				"\nAverage " + avg +
				"\nDept " + dept +
				"\nData " + Data +
				"\nTransient " + t + "\n";
	}
}



public class SerializationDemo {
	
	public static void main(String[] args) {
		
		try {

			// @@@@@@@@@@ file 읽어오기
			FileOutputStream fos = new FileOutputStream("C:/Users/circh/OneDrive/바탕 화면/serialization.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			
			Student3 s = new Student3(10, "John", 89.9f, "CSE");
			oos.writeObject(s);
			
			fos.close();
			oos.close();
			
			// @@@@@@@@@ object 읽어오기
			FileInputStream fis = new FileInputStream("C:/Users/circh/OneDrive/바탕 화면/serialization.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// ### ObjectInputStream으로 읽어오면 반드시 type casting해줘야 함
			Student3 s2 = (Student3) ois.readObject();
			
			System.out.println(s2.display());
			
		} catch (IOException | ClassNotFoundException e) {		
			e.printStackTrace();
		}
	}
	
}
