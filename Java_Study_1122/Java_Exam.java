package Java_Study_1122;

import java.util.Scanner;

public class Java_Exam {

	public static void main(String[] args) {
		
		/*
		 * 문제 1.
		 * 1부터 10까지의 숫자를 출력하는 프로그램을 작성하세요.
		 */
		
		for (int i = 1; i <= 10; i++) { // 1부터 10까지 1씩 더하라는 의미
			System.out.println(i);
		}
		
		
		/*
		 * 문제 2.
		 * 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.
		 */
		
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 1씩 더하라는 의미
			if (i % 2 == 0) { // 짝수인지 확인
				System.out.println(i); // 출력
			}
		}
		
		
		/*
		 * 문제 3.
		 * 1부터 100까지의 숫자 중 짝수 개수를 구하는 프로그램을 작성하세요.
		 */
		
		int evenNumber = 0; // 짝수 개수를 저장할 변수

        for (int i = 1; i <= 100; i++) { // 1부터 100까지 반복
            if (i % 2 == 0) { // 짝수인지 확인
            	evenNumber++; // 짝수일 경우 1씩 증가해서 evenNumber에 저장
            	}
        }
        System.out.println("1부터 100까지의 숫자 중 짝수의 개수는 : "+evenNumber+"개");
		
		
		/*
		 * 문제 4.
		 * 사용자로부터 입력받은 숫자의 구구단을 출력하는 프로그램을 작성하세요.
		 */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단을 출력할 숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) { // 1부터 9까지 반복
			System.out.println(number+" x "+i+" = "+(number * i)); // 입력받은 숫자+" x "+1부터 9까지 반복+" = "(입력받은 숫자*i)
			}
		
		
		/*
		 * 문제 5.
		 * 1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요.
		 */
		
		int multiple = 0; // 3의 배수를 저장할 변수
		
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 반복
			if (i % 3 == 0) { // 3의 배수인지 확인
				multiple = multiple + i; // 3의 배수의 합 구하기
				}
		}
		System.out.println("1부터 100까지의 숫자 중 3의 배수의 합은 "+multiple+"입니다.");
		
	
		/*
		 * 문제 6.
		 * 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램을 작성하세요.
		 * #팩토리얼 : 5! = 5 * 4 * 3 * 2 * 1
		 */
			
		System.out.print("팩토리얼을 계산할 숫자를 입력하세요. : ");
		int num = scan.nextInt();
		
		int factorial = 1; // 팩토리얼을 저장할 변수(0은 안되니까 1로)
		
		for (int i = 1; i <= num; i++) { // 1부터 입력받은 수까지 반복
			factorial = factorial * i; // 팩토리얼 계산법이래.. 잘 모르겠지만 그냥 Ctrl+C Ctrl+V
		}
		System.out.println(num+"! = "+factorial);
			
		
		/*
		 * 문제 7.
		 * 1부터 100까지의 숫자 중 3의 배수는 "Fizz", 5의 배수는 "Buzz",
		 * 3과 5의 공배수는 "FizzBuzz"를 출력하고,
		 * 나머지 숫자는 그대로 출력하는 프로그램을 작성하세요.
		 */
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 != 0) { // 3의 배수만 추리기(AND연산자)
				System.out.println("Fizz");
			} else if (i % 5 == 0 && i % 3 != 0) { // 5의 배수만 추리기(AND연산자)
				System.out.println("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) { // 5의 공배수만 추리기(AND연산자)
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i); // 나머지 숫자는 그대로 출력
			}
		}
		
		
		/*
		 * 문제 8.
		 * 1부터 10까지의 합을 구하는 프로그램을 작성하세요.
		 */
		
		int sum = 0; // 합을 저장할 변수

		for (int i = 1; i <= 10; i++) { // 1부터 10까지 반복
			sum = sum + i; // 합을 구하는 공식?
		}
		System.out.println("1부터 10까지 총 합은? : " +sum);
		
		
		/*
		 * 문제 11.
		 * 어떤 세균은 1시간에 두 배 만큼 증식한다고 합니다.
		 * 처음 세균의 마리 수 n과 경과한 시간 t가 변수로 주어질 때,
		 * t시간 후 세균의 수를 출력하세요.
		 * 
		 * int n = 2;
		 * int t = 10;
		 * 
		 * 예) 처음엔 2마리, 1시간 후엔 4마리, 2시간 후엔 8마리...
		 * 10시간 후엔 2048마리가 됩니다. 따라서 2048을 출력합니다.
		 */
		
		int n = 2; // 처음 세균 수
		int t = 10; // 경과 시간
		
		int 세균 = n; // 세균 수 초기값 설정
		
		for (int i = 1; i <= t; i++) { // 1시간 씩 증가
			세균 = 세균 * 2; // 2배 씩 증가
		}
		System.out.println(t+"시간 후 세균의 수는? : "+세균);
		
		
		/*
		 * 문제 12.
		 * 1937년 Collatz란 사람에 의해 제기된 이 추측은,
		 * 주어진 수가 1이 될 때까지 다음 작업을 반복하면,
		 * 모든 수를 1로 만들 수 있다는 추측입니다.
		 * 작업은 다음과 같습니다.
		 * 
		 * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
		 * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
		 * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
		 * 
		 * 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1
		 * 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야 하는 지 출력하세요.
		 * 
		 * int m = 6; // 주어진 수
		 */
		
		int m = 6;
		
		for (int i = 1; i == 1; i++) {
			if (i % 2 == 0) {
				m = m / 2;
			} else if (i % 2 != 0) {
				m = m * 3 + 1;
			} if(m == 0) break;
					System.out.println(m);
		}
		
		// 이거 모르겠어 그냥 오류는 안 뜸ㅋ
		
		
	}
}

