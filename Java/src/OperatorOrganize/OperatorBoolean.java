package OperatorOrganize;

// 비교 연산자
// - 두 값을 범위적으로 비교할 때 사용
// - 연산 결과로 true, false를 리턴
// - <, >, <=, >=, ==, !=

// 논리 연산자
// - A && B : AND(논리곱) 연산
//		A와 B 모두 true일 때만 true, 나머지는 false
// - A || B : OR(논리합) 연산
//		A 또는 B가 true이면 true이고, A, B 모두 false일 때는 false
// - !A : NOT(논리 부정) 연산
//		A가 true면 false, A가 false이면 true
public class OperatorBoolean {

	public static void main(String[] args) {
		System.out.println("비교 연산자");
		
		System.out.println(10 > 20); // 10이 20보다 큰가?
		System.out.println(10 < 20); // 10이 20보다 작은가?
		System.out.println(123 == 100); // 123이 100과 같은가?
		System.out.println(123 != 100); // 123이 100과 다른가? 
		
		System.out.println();
		System.out.println("논리 연산자");
		boolean A = true;
		boolean B = false;
		System.out.println(A && B);
		System.out.println(A || B);
		System.out.println(!B);
		
		System.out.println((10 > 0) && (10 < 100));
		System.out.println((10 > 0) || (10 < 100));
		System.out.println((10 <= 0) || (10 <= 100));
		System.out.println(!(111 < 100));
		

	} // end main()

} // end OperatorMain04
