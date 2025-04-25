package com.hwidong.lang_package;

// reflect는 lang의 하위 패키지
import java.lang.reflect.*;

class My {
	
	// attributes
	private int a;
	protected int b;
	public int c;
	int d;
	
	// constructors
	public My() {}
	public My(String a, String b) {}
	
	// methods
	public void display(String s1, String s2) {}
	public int show(int x, int y) { return 0; } 
}

public class ReflectDemo {

	public static void main(String[] args) {
		
		
		
		// ### class에 대한 데이터 얻는 방법
		My m = new My();
		
		// Class라고 불리는 class가 있음
		// Class는 특정 class의 definition에 대한 데이터를 담기 위한 클래스임
		Class c;
		
		
		// 1. 클래스의 .class 사용
		c = My.class;
		
		// 2. 객체의 .getClass()
		c = m.getClass();
		
		// ### Class객체가 담고 있는 클래스의 이름을 가져오는 방법
		System.out.println("Get Class Name: ");
		System.out.println(c.getName());
		//-> 출력 결과: com.hwidong.lang_package.My
		
		
		// ### 해당 클래스에서 선언한 fields 리스트를 가져오는 방법
		System.out.println("Get declared field: ");
		Field[] fields = c.getDeclaredFields();
		for (Field field: fields) {
			System.out.println(field.getName());
			// 참고로 field 이름 가져오는거말고도 많은 메서드들이 있다. 특정 객체가 field에 접근가능한지 여부 등
		}
		//-> 출력 결과:
		/*
		 * a
		 * b
		 * c
		 * d
		 */
	
		
		// ### 해당 클래스의 constructors에 대한 정보를 가져오는 방법
		System.out.println("Get constructors: ");
		Constructor[] constructors = c.getConstructors();
		for (Constructor constructor: constructors) {
			System.out.println(constructor);			
		}
		//-> 출력 결과:
		/*
		 * public com.hwidong.lang_package.My()
		 * public com.hwidong.lang_package.My(java.lang.String,java.lang.String)
		 */
		
		
		// ### 해당 클래스의 methods에 대한 정보를 가져오는 방법
		System.out.println("Get methods: ");
		Method[] methods = c.getDeclaredMethods();
		for (Method method: methods) {
			System.out.println(method);			
		}
		//-> 출력 결과:
		/*
		 * public int com.hwidong.lang_package.My.show(int,int)
		 * public void com.hwidong.lang_package.My.display(java.lang.String,java.lang.String)
		 */
		
		// 메서드의 파라미터정보도 가져올 수 있음
		System.out.println("Get parameters of a method: ");
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			Parameter[] parameters = method.getParameters();
			for (Parameter parameter : parameters) {
				System.out.print(parameter);
				System.out.print(" ");
			}
			System.out.println("");
		}
		//-> 출력 결과:
		/*
		 * int arg0 int arg1 
		 * java.lang.String arg0 java.lang.String arg1
		 */
	}

}
