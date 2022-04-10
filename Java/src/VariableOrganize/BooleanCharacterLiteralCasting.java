package VariableOrganize;

public class BooleanCharacterLiteralCasting {

	public static void main(String[] args) {
		System.out.println("논리형(boolean) 자료 타입");
		// boolean : 참(true) 또는 거짓(false)만을 저장하는 타입

		boolean b1 = true; // b1은 참이다
		System.out.println("b1 = " + b1);
		
		boolean b2 = false; // b2는 거짓이다
		System.out.println("b2 = " + b2);
		
		boolean b3 = 1 < 0; // 관계 연산자
		// b3는 1 < 0은 참인가 거짓인가
		
		System.out.println("문자(char) 자료형");
		
		char ch1 = 'A'; // ch1은 문자 A이다
		System.out.println("ch1 = " + ch1);
		
		char ch2 = 65; // ch2는 '65'에 해당하는 문자이다
		System.out.println("ch2 = " + ch2);
		
		char ch3 = '1'; // ch3는 문자 '1'이다
		System.out.println("ch3 = " + ch3);
		
		char ch4 = 1; // ch4는 '1'에 해당하는 문자이다
		System.out.println("ch4 = " + ch4);
		
		char ch5 = '\n';
		
		System.out.println("ch5 = " + ch5);
		System.out.println("다음 줄");
		
		boolean b = '가' < '나';
		System.out.println("b = " + b);
		
		System.out.println("문자열(String) 자료형");
		System.out.println("안녕하세요");

		System.out.println("리터럴(Literal)");
		int integer1 = 1234; // 정수 리터럴은 기본적으로 int
		// interger1은 1234이다
		long integer2 = 12345678900L;
		// integer2는 12345678900이다
		// long 타입 뒤에 L 또는 l을 추가
		// long 타입의 리터럴로 선언 됨
		
		double decima11 = 3.1415; // 실수 리터럴은 기본적으로 double
		float decima12 = 3.14f; // float 타입은 뒤에 F또는 f를 추가
		System.out.println("interger1 = " + integer1);
		System.out.println("interger2 = " + integer2);
		System.out.println("decima11 = " + decima11);
		System.out.println("decima12 = " + decima12);
		
		char ch10 = 'A'; // 문자 리터럴은 기본적으로 char
		String str1 = "문자열"; // 문자열 리터럴은 기본적으로 String
		System.out.println("ch1 = " + ch1);
		System.out.println("str1 = " + str1);
		
		System.out.println("형 변환(Type Casting)");
		byte num1 = 123;
		int num2 = num1; // int > byte 이므로 자동 형 변환
		System.out.println("num2 = " + num2);
		
		int num3 = 123;
		byte num4 = (byte) num3; 
		// byte < int 이므로 자동 형 변환 불가능
		// 저장되는 사이즈로 강제로 형 변환 해야 함
		System.out.println("num4 = " + num4);
		
		//주의) num3에 저장된 값이 byte의 범위를 넘어가면
		// 형 변환은 가능하지만, 잘못된 값이 저장됨
		
		int num5 = Byte.MAX_VALUE + 1;
		System.out.println("num5 = " + num5);
		byte num6 = (byte)num5;
		System.out.println("num6 = " + num6);
		
		short num7 = 12345;
		// 12345는 리터럴(상수)이기 때문에 int 타입
		// 정수 리터럴을 byte나 short에 저장할 때
		// 해당 타입에 저장할 수 있는 범위만 넘지 않으면
		// 자동 형 변환을 해줌
		// int -> byte, int -> short 등
		
		// long 타입의 리터럴은 자동 형 변환을 하지 않음
//		int num8 = 100L;
		
		double num9 = 123; // int -> double 자동 형 변환
		System.out.println("num9 = " + num9);
		// 실수 타입 리터럴의 기본타입은 double
		// 1.23 -> double 취급
		int num10 = (int) 3.14; // double -> int 강제 형변환
		System.out.println("num10 = " + num10);
		
		char ch11 = 'A';
		System.out.println("ch11 = " + ch11); // 문자 자체 출력
		System.out.println("ch11 = " + (int) ch11);
		int num14 = (char) 'A';
		System.out.println("num14 = " + (char) num14);
		char ch12 = (char) (ch11 + 1);
		System.out.println("ch12 = " + ch12);
	} // end main()

} // end BooleanCharacterLiteral
