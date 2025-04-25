package com.hwidong.lang_package;

public class MathDemo {
	
	public static void main(String[] args) {
		
		// ### 절대값 계산
		System.out.println("Absolute: ");
		System.out.println(Math.abs(-123));
		//-> 출력 결과: 123
		
		System.out.println("Absolute: ");
		System.out.println(Math.abs(123));
		//-> 출력 결과: 123
		
		// @@@StrictMath클래스도 존재
		//-> float value 등을 사용할 때, 모든 platform에서 동일한 결과를 얻기를 원한다면
		//-> 보통 그냥 일반적인 Math사용하는게 일반적으로 더 권고된다고 함... StrictMath의 경우 performance에 영향을 미칠 수 있음
		//-> Math는 네이티브 연산을 사용할 수 있어서 JVM 구현이나 CPU의 FPU(부동소수점 연산 장치)에 따라 연산 결과가 미세하게 달라질 수 있음
		// 참고: native 연산이란, 현재 실행중인 컴퓨터(CPU)가 제공하는 연산기능을 직접 활용하는 것임
		//-> StrictMath의 경우 Java 스펙에 정의된 방식으로 동작하기 때문에 어떤 환경에서도 동일한 결과를 보장
		//   StrictMath의 경우 C언어의 fdlim이라는 라이브러리를 기반으로 구현됨
		System.out.println("Absolute: ");
		System.out.println(StrictMath.abs(-123));

		
		// ### 루트 계산
		System.out.println("square root: ");
		System.out.println(Math.sqrt(2));
		//-> 출력 결과 1/4142135...
		
		
		// ### 세제곱근 계산
		System.out.println("Cute Root: ");
		System.out.println(Math.cbrt(27));
		//-> 출력 결과: 3
		
		
		// ### Exact Decrement
		//-> 입력받은 정수에서 -1을 한 결과를 리턴
		//-> 일반적인 -1과 다른게, underflow하면 Arithmatic exception을 던진다.
		System.out.println("Exact Decrement: ");
		System.out.println(Math.decrementExact(7));
		//-> 6리턴
		
		int i = Integer.MIN_VALUE;
		try {			
			System.out.println("Exact Decrement int의 최소값을 입력해봄 : ");
			System.out.println(Math.decrementExact(i));
			//-> throw Arithmatic exception
		} catch(ArithmeticException err) {
			System.out.println("Arithmatic Exception 발생");
		}
		
		System.out.println("Exact Decrement int의 최소값 -1 을 입력해봄 : ");
		System.out.println(Math.decrementExact(--i));
		//-> underflow되서 int 최댓값이 출력됨
		
		
		// ### Get Exponent
		//-> 2^n로 표현되는지 찾는 함수
		//-> 2의 몇 제곱"으로 표현되는지 찾는 함수
		// x가 대충 2의 몇 제곱인지 보고, 정수로 내림
		System.out.println("Exponent value in Floating Pont Rep. : ");
		System.out.println(Math.getExponent(12.3456));
		
		// ### floorDiv
		// x / y한 후 정수로 내림
		System.out.println("Round Division : ");
		System.out.println(Math.floorDiv(50, 9));
		//-> 출력 결과: 5
		
		
		// ### exp
		// 자연상수 e (약 2.71828)의 x 거듭제곱을 계산하는 메서드
		System.out.println("e power x: ");
		System.out.println(Math.exp(1));
		//-> 출력 결과: 2.718281828459045
		// e^1 = 2.718281828... 이기 때문에
		
		// ### log계산
		System.out.println("Log base 10: ");
		System.out.println(Math.log10(1000));
		//-> 출력 결과: 3.0
		
		// ### Maximum
		//-> x, y중 더 큰수를 리턴
		System.out.println("Maximum: ");
		System.out.println(Math.max(100,  50));
		//-> 출력 결과: 100
		
		
		// ### Tan
		//-> radius를 받음(degree 안 받음)
		System.out.println("Tan: ");
		System.out.println(Math.tan(45 * Math.PI / 180));
		//-> 출력 결과: 0.9999999999999999리턴
		
		
		// ### Convert to Radius
		System.out.println("Convert to Radians: ");
		System.out.println(Math.toRadians(90));
		//-> 출력 결과: 3.141592...
		
		
		// ### Convert to Degree
		System.out.println("Convert to Degree: ");
		System.out.println(Math.toDegrees(Math.atan(1)));
		//-> 출력 결과: 45.0
		
		
		// ### random
		//-> 0 <= n , 1사이의 random number를 리턴
		System.out.println("Random: ");
		System.out.println(Math.random());
		
		
		// ### power
		// x^y를 리턴
		System.out.println("Power : ");
		System.out.println(Math.pow(2,  3));
		//-> 출력 결과: 8.0
		
		
		// ### Exact Product
		//-> 결과가 overflow, 또는 underflow인 경우 숫자 순환하지 않고, Arithmetic Exception을 던짐
		System.out.println("Exact Product: ");		
		System.out.println(Math.multiplyExact(100, 200));
		
		
		// ### Next After
		//-> 주어진 두 실수 사이에서 "다음값"을 구하는 메서드		
		System.out.println("Next Float value: ");
		System.out.println(Math.nextAfter(12.5, 50000));
		//-> 출력 결과: 12.500000000000002
		//-> 이 경우 12.5에서 50000으로 향하는 다음 값을 리턴.
		// 즉, 12.5보다 아주 조금 큰 값을 리턴함
		
		System.out.println("Next Float value: ");
		System.out.println(Math.nextAfter(12.5, 11));
		//-> 출력 결과: 12.499999999999998
		//-> 이 경우 12.5에서 11로 향하는 다음 값을 리턴
		// 즉, 12.5보다 아주 조금 작은 값을 리턴함
		
		
	}
	
}
