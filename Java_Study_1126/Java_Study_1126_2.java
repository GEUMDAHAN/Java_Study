package Java_Study_1126;

public class Java_Study_1126_2 {

	public static void main(String[] args) {
		
		/*
		 *  배열(★★★★★)
		 *  #중요순서 : 배열 > for문 > if/else
		 *  
		 *  배열 : 같은 타입의 데이터들이 순차적으로 저장되는 공간
		 *  배열은 0부터 시작합니다.
		 *  (Why? → 미국놈들이 숫자를 0부터 세서..;)
		 */
		
		int [] array = {10, 20, 30, 40}; // 배열 초기화
		// array라는 int형 배열에 10, 20, 30, 40 총 4개의 데이터를 저장
		
		System.out.println("0 번째 배열 값 : "+array[0]);
		System.out.println("1 번째 배열 값 : "+array[1]);
		
		int sum = array[1] + array[3]; // 첫 번째 배열 값 + 세 번째 배열 값
		System.out.println("총 합은 : "+sum);
		
		// 순서 → 인덱스(프로그래밍에서는 순서를 인덱스라고 합니다.)
		
		
		int [] array2 = {10, 20, 30, 40, 10, 20, 30, 40, 10, 20, 30, 40};
		/*
		 *  배열에 들어있는 값이 많아질 때는 직접 인덱스 번호를 이용해서 조회하는게 한계가 있음..
		 *  배열 안에 있는 값을 효과적으로 가져오기 위해 '반복문' 을 사용해야합니다. (배열과 for문은 친구!)
		 */
		
		for (int i = 0; i < array2.length; i++) { // array2.length : 배열 길이
			System.out.println("배열 값 : "+array2[i]);
			}
		System.out.println("배열 길이는? : "+array2.length);
		
		
		/*
		 *  기습 문제 1.
		 *  for문을 이용해서 array3에 있는 값 중 짝수만 출력하기
		 */
		
		int [] array3 = {2, 3, 4, 5, 6};
		
		for (int i = 0; i < array3.length; i++) { // 배열 길이 만큼 for문을 돌린다!
			int num = array3[i]; // 배열 값을 num에 대입
			if (num % 2 == 0) {
				System.out.println("짝수 : " + num);
			}
		}
		
		
		/*
		 *  기습 문제 2.
		 *  array3있는 값 총합과 평균 값을 구하시오.
		 */
		
		int sum1 = 0; // 총 합
		
		for (int i = 0; i < array3.length; i++) {
			sum1 += array3[i];	
		}
		System.out.println("총 합은? : "+sum1);
		System.out.println("평균 값은? : "+sum1 / array3.length);
		
		
		/*
		 *  기습 문제 3.
		 *  for문을 이용해서 array4에 있는 3의 배수 총 합을 출력하세요.
		 */
		
		int [] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum3 = 0;
		
		for (int i = 0; i < array4.length; i++) {
			int num = array4[i]; // 배열 값을 num에 대입
			if (num % 3 == 0) {
				sum3 += array4[i];
			}
		}
		System.out.println("3의 배수의 총 합은? : " + sum3);
		

	}

}
