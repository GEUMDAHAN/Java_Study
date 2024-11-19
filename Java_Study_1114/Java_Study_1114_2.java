package Java_Study_1114;

public class Java_Study_1114_2 {

	public static void main(String[] args) {
		
		int number = 10; // 항상 오른쪽에서 왼쪽으로 대입됨(10 → number로)
		
		System.out.println("안에 있는 숫자는 뭘까? : " + number);
		
		/*
		 * int : 데이터 타입(정수형)
		 * number : 식별자(변수명)
		 * = : 대입
		 * 10 : 정수형 데이터
		 * ; : 문단 종료
		 */
		
		 // 자바는 기본 데이터타입(8개) + 레퍼런스타입(1개) = 총 9개
		
		int x = 10;
		System.out.println("정수형 데이터타입 : " + x);
		double y = 10.5555;
		System.out.println("실수형 데이터타입 : " + y);
		boolean z = true; //true(참) 혹은 false(거짓)만 올 수 있다.
		System.out.println("논리형 데이터타입 : " + z);
		char a = 'a'; //문자 데이터타입(문자열 X)
		System.out.println("문자 데이터타입 : " + a);
		String s = "Hello World";
		System.out.println("문자열 데이터타입 : " + s);
		
		/*
		 * 문자와 문자열 차이
		 * 문자 : 한단어만 입력 가능
		 * 문자열 : 여러단어 입력 가능
		 */
		
		// double PI = 3.14; // 원주율(파이)은 3.14 → 변하지 않는 숫자(상수)
		final double PI = 3.14;
		// 상수는 데이터타입 앞에 'final' 이라는 키워드를 작성
		// 상수에 식별자(변수명)은 대문자로 입력
		
		
		// 형변환(자동 형변환, 강제 타입변환)
		
		int num = 10; // int는 4바이트(2의 31승)
		double num2 = num; // double은 8바이트
		// 위의 코드설명 : 정수형 변수 num에 10을 대입
		// 실수형 변수 num2에 num을 대입
		// 작은 크기(바이트)에서 큰 크기로 대입할 때 자동으로 형변환 됩니다.
		// 즉, int num이 double로 변환됨
		
		System.out.println("최종 값 : " + num2);
		
		// 큰 크기(바이트)에서 작은 크리로 변환할 때는 개발자가 의도적으로 변환해야 됩니다.
		
		double num3 = 100.45;
		int num4 = (int)num3; // 정수형 변수 nmu4에 num3를 대입 (강제 타입변환)
		System.out.println("최종 값 : " + num4); // 뒤에 소수가 없어짐
		
		// 그 외 변환
		
		// 1. 문자형을 숫자로 변환
		String s1 = "123"; // 숫자가 아니라 문자임!
		int num5 = Integer.parseInt(s1); // 문자 "123"을 숫자 123으로 변환
		System.out.println("최종 값 : " + num5);
		
		// 2. 숫자를 문자로 변환
		int num6 = 8000;
		String s2 = Integer.toString(num6); // 숫자 8000을 문자 "8000"으로 변환
		
		/*
		 * 문자형태인 숫자 "123"과 숫자 123 차이
		 * 문자형태인 숫자는 사칙연산이 불가능!
		 */
		
	}

}
