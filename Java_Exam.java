package Java_Study_1114;

import java.util.Scanner;

public class Java_Exam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		// 문제 1. 정수형 변수 age를 선언하고 25를 할당하는 코드를 작성 후 출력하세요.
		int age = 25;
		
		
		/*
		 * 문제 2. OO은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한게 특징입니다.
		 * OO은 무엇일까요?
		 * ① 변수
		 * ② 실수
		 * ③ 상수
		 * ④ 정수
		 */
		
		// 답변 : ③ 상수
		
		// 문제 3. 문자열 "Hello, Java!" 를 출력하는 코드를 작성하세요.
		System.out.println("Hello Java!");
		
		// 문제 4. 두개의 정수 a와 b를 더한 결과를 출력하는 코드를 작성하세요.
		int a = 25;
		int b = 75;
		
		int sum = a + b;
		System.out.println("a+b는 : "+sum);
		
		// 문제 5. 실수형 변수 height로 선언하고 180.5를 할당(대입)하는 코드를 작성하세요.
		double height = 180.5;
		
		/*
		 *  문제 6. 사용자로부터 이름과 나이를 입력받아,
		 *  "안녕하세요, [이름]님! 당신은 [나이]세입니다." 라는 메시지를 출력하세요.
		 */
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.println("나이를 입력하세요 : ");
		int age2 = scan.nextInt();
		
		System.out.println("안녕하세요, "+name+"님! 당신은 "+age2+"세입니다.");
		
		
		/*
		 * 문제 7. 다음 각 데이터 타입에 맞는 변수를 선언하고 적절한 값으로 초기화하세요.
		 * ① 정수형(int)
		 * ② 실수형(double)
		 * ③ 문자형(char)
		 * ④ 논리형(boolean)
		 */
		
		int Heghit = 180;
		double weghit = 76.0;
		char p = 'p';
		boolean gravity= true;
		
		
		// 문제 8. 사용자로부터 두 새의 정수를 입력받아, 그 합을 출력하세요.
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int first = scan.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int second = scan.nextInt();
		
		int hap = first + second;
		System.out.println("두 정수의 합은 : "+hap+"입니다");
		
		// 문제 9. 문자형 변수 x를 선언하고 "10" 을 할당 후, 정수형 변수 y를 선언하고 x의 값을 y에 할당하세요.
		
		String x = "10";
		int y = Integer.parseInt(x);
		System.out.println("최종 값 : " + y);
		
		/*
		 * 문제 10. 다음 중 잘못된 식별자(변수명)은?
		 * ① monster3
		 * ② apple_13_pro
		 * ③ 3apple
		 * ④ AaaAAA
		 */
		
		// 답변 : ③ 3apple (변수명 앞에 숫자 있으면 X)
		
		// 문제 11. 아래와 같이 사용자로부터 3개의 정수를 입력받아, 평균을 출력하세요.(소수점 제외)
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		int q = scan.nextInt();
		System.out.println("두 번째 숫자를 입력하세요 : ");
		int w = scan.nextInt();
		System.out.println("세 번째 숫자를 입력하세요 : ");
		int e = scan.nextInt();
		
		int avg = (q + w + e) / 3;
		System.out.println("입력받은 세 숫자의 평균은  : "+avg+"입니다.");
		
		// 문제 12. 아래와 같이 사용자로부터 정수를 입력받고, 해당 정수의 10%를 출력하세요.
		System.out.println("마음에 드는 숫자를 입력하세요 : ");
		int love = scan.nextInt();
		
		double per = (love*10) / 100;
		System.out.println("해당 숫자의 10%는 : "+per+"입니다.");
		
	}

}
