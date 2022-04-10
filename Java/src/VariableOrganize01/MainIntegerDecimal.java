package VariableOrganize01;

public class MainIntegerDecimal {
	// 프로그램의 시작점 : main() 메소드
	public static void main(String[] args) {
		System.out.println("MAIN");
		int x; // 변수를 선언 - 정수 x를 선언한다
		x = 10; // 변수 초기화(값을 저장함) - x는 10이다
		// '=' 저장 , int 숫자변수
		int y = 15; // - 정수 y는 15이다
		
		x = 12; // 이미 선언된 변수의 값을 변경 
		// -> 코드는 위에서 아래로 읽게 되므로 위의 x는 10이며 지금부터는 12이다
		System.out.println("x = " + x);
		System.out.println(x + y);
		x = 12 + y; // 다른 변수를 연산할 수 있음
		System.out.println(x + y);
		y = 10;
		System.out.println(x + y);
		
		
		System.out.println("INTEGER");
		
		byte n1 = 5;
//		n1 = 128;
		// byte 타입에 저장할 수 있는 범위를 넘는 수는 저장할 수 없음
		
		short n2 = 1234;
//		n2 = 32768;
		// short 타입에는 -32768 ~ 32767까지만 저장 가능
		
		// 각 타입의 최대/ 최소를 구하는 방법
		int n3 = Integer.MAX_VALUE;
		long n4 = Long.MAX_VALUE;
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);
		byte n5 = Byte.MAX_VALUE;
		System.out.println("n5 = " + n5);
		
		System.out.println("DECIMAL");
		//double 타입은 float 타입보다 더 크고,
		// 더 정밀한(소수점 이하 자리수가 더 큼) 수를 표현할 수 있음
		float a = 3.14f; // 실수 y는 3.14이다
		System.out.println("y = " + y);
		a = Float.MAX_VALUE;
		System.out.println("y = " + y);
				
		double b = 3.14; // 실수 x는 3.14이다
		System.out.println("x = " + x);
		b = Double.MAX_VALUE;
		System.out.println("x = " + x);
		// 자바에서 실수 리터럴은 double로 취급하기 때문에
		// float 타입으로 명시하기 위해서는 F 또는 f를 숫자 뒤에 붙여줌
				
		
	} // end main()
	
} // end MainIntegerDecimal
