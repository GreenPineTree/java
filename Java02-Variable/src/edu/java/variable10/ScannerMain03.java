package edu.java.variable10;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ScannerMain03 {

	public static void main(String[] args) {
		System.out.println("문자열 입력 받기");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str1 = sc.nextLine();
		System.out.println(str1);
		
		//위의 방법으로 글자 하나를 입력 할 수는 있지만
		// 그것은 글자 하나가 아니라 문자열로 인식한다
		//입력받은 문자열에서 첫 번째 글자 저장하는 방법
		char ch1 = str1.charAt(0);
		System.out.println(ch1);
		
		// 입력받은 문자열에서 마지막 번째 글자 저장 하는 방법
		char ch2 = str1.charAt(str1.length() - 1);
		System.out.println(ch2);

		
	} // end main()

} // end ScannerMain03
