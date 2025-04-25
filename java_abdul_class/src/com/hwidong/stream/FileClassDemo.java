package com.hwidong.stream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileClassDemo {

	public static void main(String[] args) {
		
		File f = new File("C:/Users/circh/OneDrive/바탕 화면/test.txt");
		File directoryExample = new File("C:/Users/circh/OneDrive/바탕 화면/박휘동");
		
		System.out.println("==== File로 한번");
		// ### directory인지 확인하는 방법
		System.out.println(f.isDirectory());
		System.out.println(f.list());
		
		
		
		// ### 파일을 read only로 만들 수도 있음
		// file, directory모두 read only로 만들기 가능
//		f.setReadOnly();
		
		
		System.out.println("===== Directory로 한번");

		System.out.println(directoryExample.isFile());
		// ### directory라면 해당 directory안에 어떤 파일들이 있는지 확인할 수 있음
		// ** 하위 directory리스트까지 같이 출력됨 
		for (String s : directoryExample.list()) {
			System.out.println(s);
		}
		
		// ### String으로 하위 파일, 디렉토리 이름 뿐 아니라 File리스트로 받을수도 있음
		for (File subFile : directoryExample.listFiles()) {
			System.out.println("--------- 파일 포문");
			System.out.println(subFile.getName());
			System.out.println(subFile.getPath());
			System.out.println(subFile.getAbsolutePath());
			try {
				// Canonical 은 shortcut파일인 경우에 사용 가능함..
				System.out.println(subFile.getCanonicalPath());
			} catch (IOException e) {
				System.out.println("Canonical 에러");
			}
			System.out.println(subFile.getParent());
		}
		
		
	}

}
