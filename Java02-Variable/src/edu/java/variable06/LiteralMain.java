package edu.java.variable06;

public class LiteralMain {

	public static void main(String[] args) {
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
		
		char ch1 = 'A'; // 문자 리터럴은 기본적으로 char
		String str1 = "문자열"; // 문자열 리터럴은 기본적으로 String
		System.out.println("ch1 = " + ch1);
		System.out.println("str1 = " + str1);

	} // end main()

} // end LiteralMain()
