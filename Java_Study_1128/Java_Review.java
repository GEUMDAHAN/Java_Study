package Java_Study_1128;

import java.util.Random;

public class Java_Review {

	public static void main(String[] args) {
		
		// 1차원 배열
		int [] array = {1, 2, 3}; // 배열 선언과 동시에 값 초기화
		
		// 2차원 배열
		int [][] array2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
		// 2차원 배열 출력해보기
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.println("2차원 배열 출력 : "+array2[i][j]);
			}
		}
		
		// 배열 형변환
		int [] array3 = new int[3]; // 정수형 배열
		String [] array4 = new String[4]; // 문자열 배열
		
		array3[0] = 3; // 0 번째 인덱스에 3 대입
		array4[0] = "apple"; // 0 번째 인덱스에 문자열 대입
		
		// array4 첫 번째 인덱스에 3 넣기
		// array4[1] =3; → 오류발생 : why? array4는 문자열 배열이기 때문에 숫자 대입 불가능
		array4[1] = Integer.toString(array3[0]); // 인덱스 요소를 형변환해서 대입해야한다.
		// ★Integer.toString : 숫자에서 문자로 형변환(실무에서 많이 사용)
		// Integer.parseInt() : 문자에서 숫자로 형변환
		
		
		// 저번 배열 문제 다시보기
		
		/*
		 * 문제 1.
		 * 10개의 정수를 저장하는 배열을 선언하고 1부터 10까지의 값으로 초기화한 후,
		 * 두 번째 인덱스와 다섯 번째 인덱스를 곱한 값을 출력하시오.
		 */
		
		int [] array5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 1 번째 방법
		int [] array6 = new int[10]; // 2 번째 방법
		
		for (int i = 0; i < array6.length; i++) { // for문 이용해서 값 초기화
			array6[i] = i + 1;
			System.out.println(array6[i]);
		}
		int result = array6[2] * array6[5]; // 2 번째 인덱스 * 5 번째 인덱스
		System.out.println("1번 정답 : "+result);
		
		
		/*
		* 문제 4.
		* 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		* 최대 값을 구하는 프로그램을 작성하세요.
		*/
		
		Random random = new Random(); // Ctrl + Shift + o
		
		int [] numbers2 = new int [10]; // 크기가 10인 정수 배열을 선언
		
		for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = random.nextInt(100)+1; // 1~100 범위를 임의 값으로 초기화
            System.out.print(numbers2[i]+" ");
        }
		System.out.println();
		
		int maximum = numbers2[0]; // 첫 번째 배열을 최대 값으로 설정
		
		for (int i = 0; i < numbers2.length; i++) { // 1~100까지 쫙 반복시키고
			if (numbers2[i] > maximum) { // 돌리다가 첫 번째 배열 값이 더 클 때
				maximum = numbers2[i]; // maximum에 대입시켜 붜리긔~
			}
		}
		System.out.println("여기서 최대 값은? : "+maximum);
		

	}

}