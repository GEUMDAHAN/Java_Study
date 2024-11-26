package Java_Study_1122;

import java.util.Scanner;

public class Java_Review {

	public static void main(String[] args) {
		
		/*
		 * 문제 11.
		 * 길동이네 피자가게는 피자를 7조각으로 잘라줍니다.
		 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를
		 * 한 조각 이상 먹기 위해 필요한 조각 수를 출력하세요.
		 */
		
		int n = 15; // 인원
		int slice = 7; // 7조각
		int pizzaCount = 0; // 피자 수
		
		pizzaCount = n / slice; // 나머지 값이 존재함.
		if (n % slice != 0) { // 나머지 값이 존재한다면? → if 실행
			++pizzaCount; // 증감연산자 이용해서 피자 한 판 추가!
		}
		System.out.println("pizzaCount : " + pizzaCount);
		
		
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
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		int price = scan.nextInt();
		// 다중 if : 만족하는 조건만 실행 후 종료
		if (price >= 500000) {
			price *= 0.8; // 20% 할인
		} else if (price >= 300000) {
			price *= 0.9; // 10% 할인
		} else if (price >= 100000) {
			price *= 0.95; // 5% 할인
		}
		System.out.println("price : " + price);

	}

}
