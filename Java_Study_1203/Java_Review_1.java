package Java_Study_1203;

public class Java_Review_1 {

	public static void main(String[] args) {
		
		
		/*
		 * 문제 1.
		 * 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램을 작성하세요.
		 * 
		 * 1부터 100까지 범위 → for(반복문)
		 * 반복문 종류 : ① for, ② while, ③ do-while(잘 안씀)
		 */
		
		for (int i = 1; i <= 100; i++) { // 1부터 100까지 1씩 더하라는 의미
			if (i % 2 == 0) { // if를 이용해 짝수 판단(% : 나머지 값 구하기, == : 비교연산자)
				System.out.println("짝수는 : "+i); // if 안에 코드가 한줄일 때, 중괄호 생략 가능
			}
		}
		
		
		/*
		 * 문제 2.
		 * 1부터 10까지의 합을 구하세요.
		 */
		
		int sum = 0; // 합을 저장할 변수
		
		for (int i = 1; i <=10; i++) { // 1부터 10까지 반복
			sum += i; // 합을 구하는 공식?
		}
		System.out.println("1부터 10까지의 합은? : "+sum);
		
		
		/*
		 * 문제 3.
		 * apple이 총 몇 개인지 출력하세요.
		 * 
		 * 총 몇개? count (증감연사자 사용 확률 높음)
		 */
		
		String[] array = {"apple", "apple", "apple", "banana"};
		
		int count = 0;
		
		for (String i : array) {
			if (i.equals("apple")) { // 자바에서 문자 비교는 'equals'
				++count;
			}
		}
		System.out.println("apple의 총 개수는? : "+count);
		
		
		/*
		 * 문제 4.
		 * OO옷가게는 10만원 이상 구매하면 5%, 30만원 이상 구매하면 10%,
		 * 50만원 이상 구매하면 20% 할인해줍니다.
		 * 구매한 옷의 가격 price변수에 580,000원이 주어질 때,
		 * 지불해야할 금액을 출력하도록 코드를 작성하세요.
		 */
		
		double price = 580000;
		
		if (price >= 500000) {
			price *= 0.8; // 20% 할인
		} else if (price >= 300000) {
			price *= 0.9; // 10% 할인
		} else if (price >= 100000) {
			price *= 0.95; // 5% 할인
		} else if (price < 100000) {
			price *= 1.00;
		}
		System.out.println("지불해야할 금액은? : "+price);
		
		
		/*
		 * 문제 5.
		 * 문자열 my_string에 "Hello"가 주어질 때,
		 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 출력하세요.
		 * 
		 * n에 3이 주어짐
		 * 결과 : "HHHeeellllllooo"
		 * 힌트 : for문 → 이중 for문
		 */
		
		String my_string = "Hello";
		
		int n = 3;
		
		String result = "";
		
		for (int i = 0; i < my_string.length(); i++) {
			String word = my_string.substring(i, i + 1);
			for (int j = 0; j < n; j++) { // 이중 for문
				// n만큼 반복
				result += word;
			}
		}
		 System.out.println("결과 : " + result);
		 
		 // repeat : 특정 문자를 반복하다.
		 String s = "Hello";
		 System.out.println(s.repeat(3));
		 
		 // repeat 활용해서 위 문제 다시 풀어보기
		 String[] strArray = my_string.split("");
		 String result2 = "";
		 for(String i : strArray) {
			 result2 += i.repeat(n); // repeat 활용
		 }
		 System.out.println(result2);
		 
		 
	    /*
		 * 문제 6.
		 * [배열] 짝수, 홀수 개수 구하기
		 * 정수형 배열 num_list가 주어질 때, num_list의 원소 중
		 * 짝수와 홀수의 개수를 담은 정수형 배열 answer_list를 완성하세요.
		 * 
		 * answer_list : 결과
		 * [0, 4] 즉, 0번째 인덱스엔 짝수, 1번째 인덱스엔 홀수 개수가 옴
		 */
		 
		 int[] num_list = {1, 3, 5, 7};
		 int[] answer_list = new int[2];
		 
		 int 짝수카운트 = 0;
		 int 홀수카운트 = 0;
		 
		 for (int i :num_list) {
			 if (i % 2 == 0) { // 짝수라면?
				 ++짝수카운트;
				 answer_list[0] = 짝수카운트; // 0번째 인덱스(순서)에 값 대입
			 } else { // 홀수라면?
				 ++홀수카운트;
				 answer_list[1] = 홀수카운트; // 1번째 인덱스(순서)에 값 대입
			 }
		 }
		 System.out.println(짝수카운트+홀수카운트);
		 
		 
		 /*
		  * 문제 7.
		  * 상원이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
		  * 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
		  * 
		  * 정수 n1과 k가 변수로 주어졌을 때, 양꼬치 n1인분과 음료수 k개를 먹었다면
		  * 총 얼마를 지불해야 하는 지 출력하세요.
		  */
		 
		 int 양꼬치가격 = 12000; // 양꼬치 가격
		 int 음료수가격 = 2000; // 음료수 가격
		 
		 int 인분 = 10;
		 int 병 = 3;
		 
		 int 총액 = 양꼬치가격*인분 + 음료수가격*병; // 총 액 변수 설정
		 int 무료음료수 = 인분 / 10; // 10인분 당 1개니까 그냥 10으로 나눠버리면 음료수 개수가 나옴(?)
		 
		 int 유료음료수 = 병 - 무료음료수; // 음료수 값은 전체 병 수에서 서비스 빼면 됨
		 
		 총액 = 양꼬치가격 * 인분 + 음료수가격 * 유료음료수; // 총 정리
		 
		 System.out.println("총 액은? : "+총액);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
