package Java_Study_1119;

public class 복습 {

	public static void main(String[] args) {
		
		// 자바는 8개 기본타입과 레퍼런스타입 총 9개의 데이터타입을 가지고 있음.
		/*
		 * 가장 많이 사용하는 데이터타입
		 * ① int : 정수
		 * ② double : 실수
		 * ③ Stiring : 문자열
		 * ④ boolean : 참 혹은 거짓
		 */
		
		int x = 10; // 10이라는 정수를 x라는 변수(식별자)에 대입한 것.
		/*
		 * int : 데이터타입(정수형)
		 * x : 변수명(식별자)
		 * = : 대입 연산자
		 * 10 : 데이터
		 */
		
		int y = 20; // 변수명은 중복될 수 없음.
		// int y = 20; → 오류 발생 : 변수명이 중복됨
		
		int a =20; // y → a로 변경해줘야 함.
		a = 10; // 추가 작성 : a 라는 변수로 재활용은 가능(재활용할 때 앞에 데이터타입 작성 x)
		System.out.println("a의 최종 값은 : " + a);
		// 기존에 있던 20을 무시하고 10을 대입하게 됨.
		
		int b = 20; // b라는 변수를 생성 → 선언문(또는 초기화)
		b = 40; // b를 재활용하다.
		
		// 문제 11(변수 활용하기)
		int n1 = 100;
		int n2 = 90;
		int n3 = 70;
		int avg = 0; // 평균을 구할 변수(초기화)
		
		avg = (n1 + n2 + n3) / 3; // 평균 구한 값을 avg에 대입
		System.out.println("평균 : " + avg);
		
		// 문제 12
		int money = 800;
		double percent = money * 0.1;
		System.out.println("800의 10%는 : " + percent);
		
	}

}
