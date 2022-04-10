package VariableOrganize;

import java.util.Scanner;

public class ScannerOrg {

	public static void main(String[] args) {
		System.out.println("변수 입력");
		// 입력을 받기 위한 변수는 Scanner 선언

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("국어 점수 : " + kor);

		// nextInt() : 정수를 입력받는 메소드
		// nextDouble() : 실수를 입력받는 메소드
		// nextLine() : 문자열 한줄을 입력받는 메소드

		System.out.println();
		System.out.println("평균 입력 : ");
		double x = sc.nextDouble();
		System.out.println("평균 = " + x);

		sc.close(); // 스캐너 사용을 종료

		// Scanner 사용시 주의할 점

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("age = " + age);

		sc.nextLine();
		// 나이를 입력하고 엔터를 치면
		// 엔터를 문자로 인식해서 뒤에 이름 입력 부분에 저장됨
		// 따라서 엔터를 제거해주는 코드가 필요함

		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("이름 입력 = " + name);

		System.out.println("문자열 입력 받기");

		System.out.println("문자열 입력 : ");
		String str1 = sc.nextLine();
		System.out.println(str1);

		// 위의 방법으로 글자 하나를 입력 할 수는 있지만
		// 그것은 글자 하나가 아니라 문자열로 인식한다
		// 입력받은 문자열에서 첫 번째 글자 저장하는 방법
		char ch1 = str1.charAt(0);
		System.out.println(ch1);

		// 입력받은 문자열에서 마지막 번째 글자 저장 하는 방법
		char ch2 = str1.charAt(str1.length() - 1);
		System.out.println(ch2);
		
		sc.close();

	} // end main()

} // end ScannerMain01
