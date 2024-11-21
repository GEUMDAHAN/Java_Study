package Java_Study_1121;

import java.util.Scanner;

public class Java_Exam_2 {

	public static void main(String[] args) {
		
		/*
		 * 문제 1.
		 * if의 설명 중 틀린 것은?
		 * 
		 * ① 조건문은 프로그램에서 특정 조건에 따라 다른 행동을 한다.
		 * ② false의 경우 if문을 빠져나온다.
		 * ③ if-else문에서 else는 항상 작성해야한다.
		 * ④ 중첩 if문 마지막에는 else를 작성해야한다.
		 */
		
		// 답변 : ④ (반드시 적을 필요는 없다.)
		
		
		/*
		 * 문제 2.
		 * int 용돈 = 3000;
		 * boolean 편의점오픈여부 = true;
		 * 
		 * if(용돈 >= 3000 && 편의점오픈여부) {
		 * [ → A 코드 실행]
		 * } else {
		 * [ → B 코드 실행]
		 * }
		 * [객관식] 위 코드를 해석하고 if와 else 둥 중 어느 구문이 실행될까요?
		 * ① A 코드
		 * ② B 코드
		 * ③ 오류 발생
		 */
		
		// 답변 : ① A 코드(AND 연산자 : 두 조건 모두 참일 때 true)
		
		
		/*
		 * 문제 3.
		 * 두 정수를 입력받아 큰 수를 출력하는 프로그램을 작성하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("둘 중 더 큰 정수는 "+num1+"입니다.");
		} if (num1 < num2) {
			System.out.println("둘 중 더 큰 정수는 "+num2+"입니다.");
		} else {
			System.out.println("같은 숫자입니다.");
		}
		
		
		/*
		 * 문제 4.
		 * 사용자의 나이를 입력받아 미성년자(19세 미만)인지 성인인지 판별하는 프로그램을 작성하세요.
		 */
		
		System.out.println("당신은 몇 살 입니까? : ");
		int age = scan.nextInt();
		
		if (age > 18) {
			System.out.println("당신은 성인입니다.");
		} else {
			System.out.println("당신은 미성년자입니다.");
		}
		
		
		/*
		 * 문제 5.
		 * 입력된 수가 5의 배수인지 판별하는 프로그램을 작성하세요.
		 */
		
		int x = 5;
		if ( x % 5 == 0) {
			System.out.println("5의 배수입니다.");
		} else {
			System.out.println("5의 배수가 아닙니다.");
		}
		
		
		/*
		 * 문제 6.
		 * 숫자를 입력받아 짝수인지 홀수인지 판변하는 프로그램을 작성해주세요.
		 */
		
		System.out.println("숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		
		if (num % 2 != 0) {
			System.out.println("입력된 숫자는 홀수입니다.");
		} else {
			System.out.println("입력된 숫자는 짝수입니다.");
		}
		
		
		/*
		 * 문제 7.
		 * 숫자를 입력받아 3의 배수, 5의 배수, 3과 5의 공배수,
		 * 또는 [해당 없음]을 출력하는 프로그램을 작성하세요.
		 */
		
		System.out.println("숫자를 또! 입력해주세요 : ");
		int number = scan.nextInt();
		
		if (number % 3 == 0 && number % 5 != 0) {
			System.out.println("3의 배수입니다.");
		} else if (number % 5 == 0 && number % 3 != 0) {
			System.out.println("5의 배수입니다.");
		} else if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("3과 5의 공배수입니다.");
		} else {
			
			System.out.println("해당 없음");
		}
		
		
		/*
		 * 문제 8.
		 * 세 과목(국어, 수학, 영어)의 점수를 입력받아 평균을 계산하고,
		 * 평균이 90점 이상이면 "A", 80점 이상이면 "B", 70점 이상이면 "C",
		 * 60점 이상이면 "D", 그 미만이면 "F"를 출력하는 프로그램을 작성하세요.
		 */
		
		System.out.println("국어 점수를 입력하세요 : ");
		int point1 = scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int point2 = scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int point3 = scan.nextInt();
		
		int avg = (point1 + point2 + point3) / 3;
		
		if (avg >= 90 && avg <= 100) {
			System.out.println("A 학점입니다.");
		} else if (avg < 90 && avg >= 80) {
			System.out.println("B 학점입니다.");
		} else if (avg < 80 && avg >= 70) {
			System.out.println("C 학점입니다.");
		} else if (avg < 70 && avg >= 60) {
			System.out.println("D 학점입니다.");
		} else {
			System.out.println("F 학점입니다.");
		}
		
		
		/*
		 * 문제 9.
		 * 두 정수를 입력받아 둘 중 하나라도 음수면 "음수가 포함되어 있습니다.",
		 * 둘 다 양수면 "모두 양수입니다." 를 출력하는 프로그램을 작성하세요.
		 */
		
		System.out.println("첫 번째 숫자를 입력하세요. : ");
		int number1 = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요. : ");
		int number2 = scan.nextInt();
		
		if (number1 > 0 && number2 > 0) {
			System.out.println("두 숫자 모두 양수입니다.");
		} else {
			System.out.println("음수가 포함되어 있습니다.");
		}
		
		
		/*
		 * 문제 10.
		 * 사용자로부터 1 ~ 5까지의 숫자를 입력받아,
		 * 해당하는 과일 이름을 출력하는 프로그램을 작성하세요.
		 * (① 사과, ② 바나나, ③ 오렌지, ④ 포도, ⑤ 복숭아)
		 * #switch 이용해서 풀 것.
		 */
		
		System.out.println("1 ~ 5 중 원하는 숫자를 입력하세요 : ");
		int fruit = scan.nextInt();
		
		switch(fruit) {
			case 1 :
				System.out.println("사과");
				break;
			case 2 :
				System.out.println("바나나");
				break;
			case 3 :
				System.out.println("오렌지");
				break;
			case 4 :
				System.out.println("포도");
				break;
			case 5 :
				System.out.println("복숭아");
				break;
			default :
				System.out.println("잘못된 슷자입니다.");
		}
				
				
		/*
		 * 문제 11.
		 * 길동이네 피자가게는 피자를 일곱 조각으로 잘라줍니다.
		 * 피자를 나눠먹을 사람의 수 n이 주어질 때,
		 * 모든 사람이 피자 한 조각 이상 먹기 위해 필요한 수를 출력하세요.
		 * 
		 * int n = 15; // (사람의 수)
		 * 
		 * 예) 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
		 * n이 15라고 가정하면 피자는 3판이 필요합니다.
		 */
		
		int n = 15; // 사람 수(즉, 필요한 조각 갯수)
		int 피자조각 = 7; // 피자 한 판당 조각 수
		
		int 필요한피자조각 = n / 피자조각;
		
		if (n % 피자조각 != 0) { // 나머지가 있다면(즉, 한 판 더 필요하다면)
			++필요한피자조각;
		}
		System.out.println(n+"명이 최소 한 조각씩 먹기 위해 필요한 피자 판 수는 "+필요한피자조각+"판입니다.");
		
			
		/*
		 * 문제 12.
		 * 길동이네 옷가게는 10만원 이상 구매하면 5%, 30만원 이상 구매하면 10%,
		 * 50만원 이상 구매하면 20%를 할인해줍니다.
		 * 구매한 옷의 가격 price가 주어질 때, 지불해야할 금액을 출력하세요.
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("금액을 입력하세요 : ")
		 * int price = scan.nextInt();
		 * 
		 * 예) 580,000원에서 20%를 할인한 464,000원을 출력합니다.
		 * 150,000원에서 5%를 할인한 142,000원을 출력합니다.
		 */
		
		System.out.print("금액을 입력하세요 : ");
		int price = scan.nextInt(); 
		
		double discountRate = 0.0;
		
		if (price >= 500000) {
			discountRate = 0.2;
		} else if (price >= 300000) {
			discountRate = 0.1;
		} else if (price >= 100000) {
			discountRate = 0.05;
		} else {
			discountRate = 0.00;
			System.out.print("좀 더 쓰셔야 할인됩니다.");
		}
		
		double discountRatePrice = price * (1 - discountRate);
		System.out.print("할인된 금액은 "+discountRatePrice+"원입니다.");
			
	}
}
