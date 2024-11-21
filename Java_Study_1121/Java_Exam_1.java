package Java_Study_1121;

import java.util.Scanner;

public class Java_Exam_1 {

	public static void main(String[] args) {
		
		// 문제 1. 3의 배수 판단
		
		int x = 15;
		// == : 같다, % : 나머지
		// if와 else 안에 코드가 한 주리면 중괄호 생략 가능!(실무에선 안씀)
		if( x % 3 == 0) { // 3으로 나눈 나머지 값이 0이라면?
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		// 문제 2. 변수 y가 5의 배수인지 판단하는 프로그램 작성하기
		int y = 5;
		if ( y % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
		// 문제 3. 두 정수를 입력받아 큰 수 출력하기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a의 값을 입력하세요. : ");
		int a = scan.nextInt();
		System.out.println("b의 값을 입력하세요. : ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("a값이 더 커요!");
		} else if (a < b) {
			System.out.println("B값이 더 커요!");
		} else {
			System.out.println("값이 동일합니다.");
		}
		
		// 문제 4. 짝수 구하기
		int 짝수 = 4;
		if (짝수 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 문제 5. 홀수 구하기
		int 홀수 = 9;
		if (홀수 % 2 != 0) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		// 문제 6. 3과 5의 공배수 판단
		// 공배수란? : 해당 숫자가 3의 배수, 5의 배수 둘 다 만족할 때(예 : 15)
		int number = 15;
		if (number % 3 == 0 && number % 5 == 0); {
			System.out.println(number+"는 공배수입니다.");
		}
		
		scan.close(); // Scanner 닫기
	}
}
