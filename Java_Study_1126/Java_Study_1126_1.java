package Java_Study_1126;

public class Java_Study_1126_1 {

	public static void main(String[] args) {
		
		/*
		 * #이중 for문(중첩 반복)
		 * 
		 * 반복문이 다른 반복문을 내포하는 구조.
		 * 
		 * 이론적으로 2중 3중 4중 ...  n중까지 가능하나,
		 * 너무 많은 중첩은 프로그램 구조를 복잡하게 한다.
		 * 그래서 2중 중첩이 적당하다.
		 */
		
		for (int i = 0; i < 3; i++) { // 아우터 for문
			//System.out.println("아우터 for문");
			for (int j = 0; j < 3; j++) { // 이너 for문
				//System.out.println("이너 for문");
			}
		}
		// 아우터 for문이 먼저 실행 → 이너 for문 모두 실행 → 아우터 for문 다시 실행...
		
		// 구구단 출력(이중 for문 이용)
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);	
			}
		}
		
		
		// 직사각형 출력(이중 for문)
		int a = 5; // 가로 길이
		int b = 3; // 세로 길이
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*"); // ln 아님!
			}
			System.out.println(); // 단순 공백 출력
		}
		
		
		/*
		 *  기습 문제 1.
		 *  다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		
		int x = 0;
		int y = 5;
		for (int i = 0; i < 5; i++) { // ① 5번 돌게하기
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 *  기습 문제 2.
		 *  다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
		 *  *****
		 *  ****
		 *  ***
		 *  **
		 *  *
		 */
		
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
