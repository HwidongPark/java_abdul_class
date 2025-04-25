package com.hwidong.generics;


/**
 * Generic으로 동적으로 타입 설정하고, 데이터 set, get할 수 있는 클래스
 * @param <T>
 */
class Data<T> {
	private T obj;
	
	public void setData(T value) {
		obj = value;
	}
	
	public T getData() {
		return obj;
	}
}



class MyArray<T> {
	T[] arr = (T[]) new Object[10];
	int length = 0;
	
	
	// 배열에 값 추가하는 메서드
	public void append(T value) {
		arr[length++] = value;		
	}
	
	
	public void display() {
		for (int i = 0; i < this.length; i++) {
			System.out.println(arr[i]);
		}
	}
}


class A {}
class B extends A{}
class C extends B{}

class MyArray2 extends MyArray<A> {
	
}


interface D{}
class E implements D{}
class F implements D{}



/**
 * Generic에서 bounded types
 * extends키워드를 사용하여 Generic parameter로 받을 수 있는 타입들을 제한할 수 있음
 * @param <T>
 */
class MyArray3 <T extends Number> {
	T[] arr = (T[]) new Number[10];
	int length = 0;

	// 배열에 값 추가하는 메서드
	public void append(T value) {
		arr[length++] = value;		
	}
	
	
	public void display() {
		for (int i = 0; i < this.length; i++) {
			System.out.println(arr[i]);
		}
	}
}


/**
 * Generic에서 bounded types
 * interface의 경우도 extends키워드를 해당 interface를 구현한 클래스들만 받도록 제한할 수 있음
 * @param <T>
 */
class MyArray4 <T extends D> {
	T[] arr = (T[]) new D[10];
	int length = 0;
	
	// 배열에 값 추가하는 메서드
	public void append(T value) {
		arr[length++] = value;		
	}
	
	
	public void display() {
		for (int i = 0; i < this.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

public class GenericDemo {
	
	public static void main(String[] args) {
		
		// ### Data동적으로 설정하여 사용
		Data<Integer> d = new Data<>();
		d.setData(10);
		// d.setData("Hi");    //-> compiler 에러 발생
		
		System.out.println(d.getData());
		
		
		// ### Array의 요소 타입 동적으로 정해서 배열 만들어 사용
		MyArray<Integer> ma = new MyArray<>();
		ma.append(10);
		ma.append(20);
		ma.append(30);
		
		ma.display();
		
		
		
		// ### Generic에 아무것도 지정하지 않으면 default로 Object가 지정됨
		MyArray ma2 = new MyArray();
		ma2.append("HI");
		ma2.append(20);
		ma2.append(30);
		
		ma2.display();
		
		
		// ### Generic을 상속하는 클래스를 사용할 때
		MyArray2 ma3 = new MyArray2();
		ma3.append(new A());
		ma3.append(new B());
		ma3.append(new C());    //-> 에러.. C가 B를 상속하고 B가 A를 상속하는데도 C를 넣으면 compiler error 발생
		
		
		// ### Generic에서 bounded types
		MyArray3 ma4 = new MyArray3();
		ma4.append(Integer.valueOf(2));
		ma4.append(Double.valueOf(1.4));
		// ma4.append("Hello World!");    //-> compiler error 발생
		
		
		
		// ### 특정 interface를 구현한 class type들만 받도록 제한하는 경우
		MyArray4 ma5 = new MyArray4();
		ma5.append(new E());
		ma5.append(new F());
		
		
		show(new String[] {"Hi", "Go", "Bye"});
		show(new Integer[] {10, 20, 30});
		
		show2("Hi", "Go", "Bye");
		show2(10, 20, 30);
		
		System.out.println("===========================================================");
		
		MyArray<String> ma6 = new MyArray<>();
		MyArray<Integer> ma7 = new MyArray<>();
		
		fun(ma6);
		fun(ma7);
		
		System.out.println("===========================================================");
		
		MyArray<String> ma8 = new MyArray<>();
		MyArray<Integer> ma9 = new MyArray<>();
		
		fun2(ma8);
		fun2(ma9);
		
		
	}
	
	
	// ### generic method
	public static <T> void show(T[] list) {
		for (T x: list) {
			System.out.println(x);
		}
	}
	
	
	public static <T> void show2 (T... list) {
		for (T x: list) {
			System.out.println(x);
		}
	}
	
	// ### method argument에서의 generic
	// MyArray가 Generic을 사용하는 클래스인데 메서드 파라미터에 그냥 MyArray라고 타입정의하면, MyArray의 Generic parameter에 Object가 할당됨 
	public static void fun(MyArray obj) {
		obj.display();
	}
	

	
	// Method argument에서의 generic에서 ? wildcard
	//-> 모든 타입이 다 들어갈 수 있다는 wildcard임
	public static void fun2(MyArray<?> obj) {
		obj.display();
	}
	
	
	// Method argument에서의 generic에서 ? wildcard
	//-> method argument에서 extends키워드를 쓰면 bounded type처럼 해당 타입으로 제한
	public static void fun3(MyArray<? extends Number> obj) {
		obj.display();
	}
	
	
	// Method argument에서의 generic에서 ? wildcard
	//-> method argument에서 super 키워드를 쓰면 해당 타입의 super type만 사용가능.. 해당 클래스의 부모, 조상 클래스만 사용 가능하다는 의미
	public static void fun4(MyArray<? super Number> obj) {
		obj.display();
	}
	
	
}
