package com.hwidong.lang_package;

public class WrapperDemo {

	public static void main(String[] args) {
		
		// ### wrapper class객체 만드는 방법
		// 1. Wrapper class의 constructor를 사용해서 만드는 방법
		//-> deprecated된 방법이라 사용하지 않는 것이 좋음
		Integer i = new Integer(10);
		
		// 2. static method인 valueOf 메서드를 사용해서 만드는 방법
		Integer a = Integer.valueOf(10);
		
		// 3. 그냥 바로 값 할당하는 방법;
		Integer b= 10;
		
		Byte c = 15;
		// valueOf 메서드에 해당 숫자 타입의 String값을 넣어도 됨
		Byte d = Byte.valueOf("15");
		
		// Byte의 경우 아래와 같이 넣으면 에러남
		//-> 15가 byte타입이 아니라 int타입이기 때문에...
//		Byte e = Byte.valueOf(15);
		
		// ### Byte의 경우
		byte bb = 15;
		Byte e = Byte.valueOf(bb);
		Byte f = Byte.valueOf((byte) 15);
		
		
		// ### Float의 경우
		Float g = 12.3f;		
		Float h = Float.valueOf("123.5");
		Float j = Float.valueOf(g);
		
		
		// ### Double의 경우
		Double k = Double.valueOf(123.456);
		
		// ### Character의 경우
		Character l = Character.valueOf('A');
		
		// ### Boolean의 경우
		Boolean m = Boolean.valueOf("true");
		Boolean n = Boolean.valueOf(false);
		
		float x = h;
		float y = h.floatValue();
		
	}

}
