package edu.java.variable01;

public class VariableMain {

	// 프로그램의 시작점 : main() 메소드
	public static void main(String[] args) {
		// println() : 데이터를 console 창에 보여주는 함수
		System.out.println("변수(Variable)");
		// Ctrl + Space bar : 자동완성 단축키
		System.out.println();
		// Ctrl + F11 : 자동실행 단축키 
		
		int x = 10; // 변수 x에 10을 저장
		 // '=' 저장 , int 숫자변수
		System.out.println("x = 10");
		System.out.println(x);
		System.out.println("x = " + x); // x의 값을 출력
		
		int y; // 변수 선언
		y = 20; //변수 초기화(값을 저장)
		System.out.println("y = " + y);
		
		x = 12; // 이미 선언된 변수의 값을 변경
		System.out.println("x = " + x);
		System.out.println(x + y);
		x = 12 + y; // 다른 변수를 연산할 수 있음
		System.out.println(x + y);
		y = 10;
		System.out.println(x + y);

	} // end main()

} // end VariableMain
