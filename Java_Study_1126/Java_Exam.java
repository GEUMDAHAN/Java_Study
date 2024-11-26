package Java_Study_1126;

import java.util.Random;

public class Java_Exam {

	public static void main(String[] args) {
		
		/*
		 * 문제 1.
		 * 10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
		 * 두 번째 인덱스와 다섯 번째 인덱스를 곱한 값을 출력하시오.
		 */
		
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int mul = array[2] * array[5];
		System.out.println("두 번째와 다섯 번째를 곱한 값은? : "+mul);
		
		
		/*
		 * 문제 2.
		 * 1번 문항 이어서,
		 * 배열에 저장된 값을 모두 더하는 프로그램을 작성하세요.
		 */
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("모두 더한 값은? : "+sum);
		
		
		/*
		 * 문제 3.
		 * 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		 * 배열의 요소들 중 짝수만 출력하는 프로그램을 작성하세요.
		 */
		
		int [] numbers = new int [10];
		
		Random random = new Random();
		numbers[0] = random.nextInt(100)+1;
		int evenNumber = 0; 
			if (evenNumber / 2 == 0) {
				System.out.println("이 중 짝수는? : "+numbers[0]);
			}
			
			
	   /*
		* 문제 4.
		* 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		* 최대 값을 구하는 프로그램을 작성하세요.
		*/
		
		int [] numbers2 = new int [10];
		
		for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = random.nextInt(100)+1; // 1~100 범위를 임의 값으로 초기화
            System.out.print(numbers2[i]+" ");
        }
		System.out.println();
		
		int maximum = numbers2[0]; // 첫 번째 배열을 최대 값으로 설정
		
		for (int i = 1; i < numbers2.length; i++) { // 1~100까지 쫙 반복시키고
			if (numbers[i] < maximum) { // 돌리다가 첫 번째 배열 값이 더 클 때
				maximum = numbers2[i]; // maximum에 대입시켜 붜리긔~
			}
		}
		System.out.println("여기서 최대 값은? : "+maximum);
		
			
			
	}

}
