package edu.java.variable05;

//char: 문자 하나를 저장하는 데이터 타입, 2바이트
// - 문자의 유니코드 값(0 또는 양의 정수)를 저장하는 타입


public class CharacterMain {

	public static void main(String[] args) {
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
		
		
	} // end Main()

} // end CharacterMain()
