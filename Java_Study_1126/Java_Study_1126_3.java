package Java_Study_1126;

import java.util.Random;

public class Java_Study_1126_3 {

	public static void main(String[] args) {
		
		// 자바에서 배열을 만드는 방법은 총 2가지!
		
		// 첫 번째 : 처음부터 값이 들어있음.
		int [] array = {2, 3};
		// 두 번째 : 길이만 생성(안에 값 X)
		int [] array2 = new int [2];
		System.out.println("배열 길이는? : "+array2.length);
		
		// → 값 넣기
		array2[0] = 10;
		array2[1] = 20;
		// array2[2] = 30; 배열 길이는 2인데 세 번째에 값을 넣으려 하니 오류발생!
		System.out.println(array2[1]);
		
		
		// 배열에 임의 값 넣기(1~100 중 임의 값을 배열에 차례로 넣기)
		int [] numbers = new int [10]; // 10개의 공간을 가진 배열 생성!
		
		// 자바에서는 임의 값을 Random이라는 클래스를 이용합니다.
		Random random = new Random(); // 랜덤클래스 생성 → Ctrl + Shift + o
		numbers[0] = random.nextInt(100)+1; // 1부터 100까지의 임의 값을 0 번째 인덱스에 대입(뒤에 +1은 미국숫자는 0부터 시작하기 때문)
		System.out.println("0 번째 인덱스 값은? : "+numbers[0]);
		
		
		/*
		 * 기습 문제 1.
		 * 0 번째 ~ 9 번째 인덱스에 임의 값 넣기!
		 */
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1;
			System.out.println("0 ~ 9 번째 인덱스 값은? : "+numbers[i]);
		}
		
	}

}
