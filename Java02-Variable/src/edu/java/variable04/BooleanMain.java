package edu.java.variable04;

public class BooleanMain {

	public static void main(String[] args) {
		System.out.println("논리형(boolean) 자료 타입");
		// boolean : 참(true) 또는 거짓(false)만을 저장하는 타입

		boolean b1 = true; // b1은 참이다
		System.out.println("b1 = " + b1);
		
		boolean b2 = false; // b2는 거짓이다
		System.out.println("b2 = " + b2);
		
		boolean b3 = 1 < 0; // 관계 연산자
		// b3는 1 < 0은 참인가 거짓인가
		
		System.out.println("b3 = " + b3);
	} // end main()

} // end BooleanMain()
