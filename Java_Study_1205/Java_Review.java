package Java_Study_1205;

public class Java_Review {

	public static void main(String[] args) {
		
		// 문제 1. 사칙연산(거스름돈)
		
		int money = 74900;
		// 결과 → 오만원 1장, 만원 2장, 천원 4장, 5백원 1개, 백원 4개
		
		int fiftyThousand = 50000;
		int tenThousand = 10000;
		int oneThousand = 1000;
		int fiveHundred = 500;
		int oneHundred = 100;
		
		int change = 0;
		
		change = money / fiftyThousand;
		int change2 = (money % fiftyThousand) / tenThousand;
		int change3 = (money % tenThousand) / oneThousand;
		int change4 = (money % oneThousand) / fiveHundred;
		int change5 = (money % fiveHundred) / oneHundred;
		
		System.out.println("오만원 : " +change+"개");
		System.out.println("만원 : " +change2+"개");
		System.out.println("천원 : " +change3+"개");
		System.out.println("백원 : " +change4+"개");
		System.out.println("오백원 : " +change5+"개");
		
		/*
		 * 그리드(탐욕) 알고리즘 : 예) 거스름돈
		 * 
		 * 선택의 순간마다 당장 눈 앞에 보이는 최적의 상황만을 쫓아
		 * 최종 답에 도달하는 방법
		 */
		
		/*
		 *  상수 : 변경 불가능
		 *  프로그래밍에서 상수 표현은 데이터타입 앞에 'final' 키워드가 붙는다.
		 *  (상수를 표현할 때 변수명은 대문자로 적어야 한다.(개발자 약속)
		 */
		final double PI = 3.14;
		
		/*
		 * 문제 2.
		 * 원의 반지름이 주어졌을 때, 원의 면적을 계산하는 프로그램을 작성하세요.
		 * double radius = 5.0; // 원의 반지름
		 * 원의 면적은 PI * 반지름 * 반지름 입니다.
		 */
		
		double radius = 5.0;
		System.out.println(PI * radius * radius);
		
		
		/*
		 * 문제 3. (피타고라스의 정의)
		 * 직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가
		 * 변수로 주어질 때, 다른 한 변의 길이의 제곱, b를 출력하세요.
		 */
		
		int a = 3;
		int c = 5;
		int b = c*c - a*a; // b 구하기(16)
		
		System.out.println(b);
		
		int[] array = {1, 3, 5}; // 배열 선언
		System.out.println(array[0]); // 0번째 인덱스 출력
		System.out.println(array[array.length-1]); // 맨 마지막 인덱스 출력
		
		// 기습 문제 : 1번 인덱스 값과 2번 인덱스 값 서로 교환하기
		int temp = array[1]; // temp('임시공간' 이라는 의미)에 3 대입
		array[1] = array[2]; // 1번 인덱스에 5대입
		array[2] = temp; // 2번 인덱스에 3대입
		// → swap
		
		// 배열 문제가 나오면 for문
		for (int i : array) { // for-each문(배열 길이만큼 자동으로 반복)
			System.out.println("i : "+i);
		}
		
		
		
		
		

	}

}
