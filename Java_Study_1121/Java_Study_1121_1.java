package Java_Study_1121;

import java.util.Scanner;

public class Java_Study_1121_1 {

	public static void main(String[] args) {
		
		// 예제 → 시험 점수가 80점이 이상이면 합격 판별하는 프로그램을 작성하세요.
		Scanner scan = new Scanner(System.in); // Ctrl + Shift + o
		
		System.out.print("점수를 입력하세요 : ");
		int 점수 = scan.nextInt();
		System.out.print("입력한 점수는 " + 점수);
		// >= : 비교연산자
		if(점수 >= 80) { // 만약에 입력받은 점수가 80점 이상이라면?
			// true면 {if 코드}가 실행됨.
			System.out.println("시험에 합격했습니다!");
		} else { // 만약에 입력받은 점수가 80점 이상이 아니라면?
			// false면 else 코드가 실행됨.
			System.out.println("시험에 불합격했습니다.");
		}
		
		// else는 단독으로 사용할 수 없으나, if 다음에 작성할 수 있습니다.(옵션)
		/*
		 * else {
		 * 
		 * }
		 */
		
		// 중접 if문 : 조건이 여러가지일 때 사용
		System.out.print("점수2를 입력하세요 : ");
		int 점수2 = scan.nextInt();
		// && : AND 연산자(두 조건이 모두 true여야 함)
		if (점수2 >= 90 && 점수2 <= 100) { // 점수가 90이상 100이하라면...
			System.out.println("A등급");
		} else if (점수2 < 90 && 점수2 >= 80) { // 점수가 90미만 80이상이라면...
			System.out.println("B등급");
		} else if (점수2 < 80 && 점수2 >= 70) { // 점수가 80미만 70이상이라면...
			System.out.println("C등급");
		} else {
			System.out.println("F등급");
		}
	}

}
