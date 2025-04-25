package com.hwidong.generics;

// Generic사용하려면 Class를 Generic으로 만들어야 함
public class ObjectVsGenerics<T> {
	
	// Generic을 사용하면 받는 type을 유연하게 받을 수 있지만, 배열내 요소들을 모두 같은 타입으로 만들 수 있음
	T data[] = (T[]) new Object[3];
	
	public static void main(String[] args) {
		Object obj = new String("hello");
		obj = Integer.valueOf(10);
//		String str = (String)obj;
		
		// 어떤 클래스의 객체든지 Object 타입의 변수에 할당 가능
		// Object타입 변수를 String과같은 다른 타입의 변수에 할당하려면 type casting을 해야 함
		//-> Object에서 type casting할 때 Object타입의 변수에 다른 타입의 객체가 할당되어 있어도 컴파일러가 못 잡아줌
		//   이 경우, ClassCastException 발생
		
		
		// Object타입의 배열로 하면, 배열 내의 타입이 짬뽕이 될 수 있음
		//-> 안 좋음
		Object obj2[] = new Object[3];
		obj2[0] = "Hi";
		obj2[0] = "Bye";
		obj2[0] = Integer.valueOf(10);
		
		String str;
		
		
//		for (int i = 0; i < obj2.length; i++) {
//			str = (String) obj2[i];
//			System.out.println(str);
//		}
		

		// ### generic사용 시
		// generics으로 정의해서 배열 내 타입이 안 맞는 경우 compiler가 에러 알려줌
		ObjectVsGenerics<String> gd = new ObjectVsGenerics();
		// gd.data[0] = Integer.valueOf(10); //-> 컴파일러 에러
		
		gd.data[0] = "Hi";
		gd.data[1] = "Bye";
		
		String str2 = gd.data[0];
		
		
		 
				
	}
	
}
