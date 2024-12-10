package Java_Study_1210;

public class Java_Review {

	public static void main(String[] args) {
		
		/*
		 * 연산자
		 * 
		 * 가장 많이 사용하는 연산자
		 * ① 대입연산자
		 * ② 사칙연산자(+, -, /, %)
		 * ③ 증감연산자
		 * 
		 */
		
		int x = 10; // 초기 선언식
		x = 30; // 재활용
		System.out.println("x의 최종 값은? : "+x); // 답변 : 30(기존의 값을 무시하고 덮어씌워버림)
		
		String s = "123"; // "" 안에 있게되면 숫자가 아닌 문자로 인식
		String s2 = "456";
		
		String result = s + s2; // 문자가 합쳐짐
		System.out.println("결과 : "+result); // 문자 "123456" 출력
		
		int num = Integer.parseInt(result); // 문자 → 숫자로 변환됨
		System.out.println("결과 : "+num); // 똑같은 결과로 보이지만 사실 숫자로 변환됨
		
		int count = 0;
		++count; // 1씩 증가됨
		count++;
		++count;
		System.out.println("결과 : "+count);
		
		
		/*
		 * 제어문
		 * 
		 * ① if문 (95% 사용)
		 * ② switch문 (5% 사용)
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * if(조건문) : 특정 조건을 평가하여 그 결과에 따른 다른 코드를 실행
		 * 
		 * if(조건식) { <= true or false
		 * 	// 조건이 참(true)일 때 실행할 코드
		 * }
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * if-else문 : 조건이 참일 때와 거짓일 때 각각 다른 코드를 실행
		 * 
		 * if(조건식) {
		 * 
		 * } else {
		 * 	// 조건이 거짓(false)일 때 실행할 코드
		 * }
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * else-if문 : 여러 개의 조건을 평가
		 * 
		 * if(조건식1) {
		 * 	// 조건식1이 참(true)일 때 실행
		 * } else if(조건식2) {
		 * 	// 조건식2이 참(true)일 때 실행
		 * } else if(조건식3) {
		 * 	// 조건식3이 참(true)일 때 실행
		 * } else {
		 * 	// 모든 조건이 거짓일 때 실행할 코드
		 * }
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * if문, if-else문, else-if문 중 if문을 가장 많이 사용하라(심플 이즈 베스트)
		 */
		
		// 무엇이 출력되고 그 이유는 무엇인지 작성하기
		// 답 : 출력 A → '!'연산자 때문에 false가 true로 변함
		boolean isData = false; // bool타입 변수는 앞에 'is'로 먼저 시작(규칙)
		if (!isData) {
			System.out.println("출력 A");
		} else {
			System.out.println("출력 B");
		}
		
		// 두 비밀번호 비교하기
		String password = "123"; // 비밀번호
		String rePassword = "456"; // 비밀번호 재입력
		// '==' : 비교연산자
		// 자바에서는 문자를 비교할 땐 비교연산자가 아니라 equals를 사용!
		// if (password == rePassword) { → password와 rePassword의 타입이 'S'tring 이어서 클래스로 해석됨(문자와 문자 비교를 못하게 됨)
		if (password.equals(rePassword)) { // 문자열 함수(equals)로 문자를 비교
			System.out.println("비밀번호가 일치합니다.");
		}
		// 아래에 비밀번호가 일치하지 않다를 if로 나타내보세요.
		if (!password.equals(rePassword)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		if (10 != 5) { // 10하고 5가 같지 않다면?
			System.out.println("A 출력");
		} else {
			System.out.println("B 출력");
		}
		
		
		/*
		 * 반복문
		 * 
		 * 반복문 : 특정 블록의 코드를 여러 번 반복해서 실행
		 * 
		 * ① for : 반복 횟수가 정해져 있을 때 사용
		 * ② while : 조건이 참인 동안 반복 실행(반복 횟수 X)
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * for (초기화(①); 조건식(②); 증감식(④) {
		 * 	// 반복할 코드(③)
		 * }
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 * while (조건식(①)) {
		 * 	// 반복할 코드(②)
		 * }
		 * ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		 */
		
		// 1부터 10까지의 숫자를 출력하고자 합니다.
		for (int i = 1; i <= 10; i++) {
			// 1부터 10까지의 숫자 중 짝수만 출력
			if (i % 2 == 0) { // 2로 나눠서 나머지가 0이라면?(짝수)
				System.out.println("짝수 : "+i);
			}
		}
		
		
		/*
		 * 배열
		 * 
		 * 배열 : 동일한 데이터타입의 여러 데이터를 하나의 변수로 관리할 수 있게 해주는 자료구조
		 * 쉽게 말해, 같은 종류의 데이터들을 한 줄로 나열해 놓은 것!
		 * +for문하고 절친!
		 */
		
		// ① 배열 선언 및 초기화
		int [] array = {1, 2, 3, 4}; // 첫 번째 방법({1, 2, 3, 4}를 array에 넣음)
		int [] array2 = new int[4]; // 두 번째 방법(값은 없고 4개의 칸 생성)
		
		// ② 배열 요소(아이템) 접근 및 조작({1, 2, 3, 4}를 요소(아이템)이라고 부름)
		System.out.println("0번 index : "+array[0]+"요소(아이템)");
		System.out.println("1번 index : "+array[1]+"요소(아이템)");
		System.out.println("2번 index : "+array[2]+"요소(아이템)");
		System.out.println("3번 index : "+array[3]+"요소(아이템)");
		// 인덱스 번호로 배열 요소 출력(사용) 가능
		for (int i = 0; i < array.length; i++) { // 'i < array.length;'에서 '=<'가 아닌 '<'를 쓰는 이유는 인덱스가 0번 부터 시작하기 때문! 
			System.out.println(i+"번 index : "+array[i]+"요소(아이템)");
		}
		
		// 배열 요소 값 변경하기
		System.out.println("2번 index : "+array[2]+"요소(아이템)");
		array[2] = 50; // 2번째 요소에 50값 대입(기존의 값은 없어짐)
		System.out.println("2번 index : "+array[2]+"요소(아이템)");
		
		/*
		 *  기습 문제 1.
		 *  score보다 점수 높은 사람 카운트하기
		 */
		int [] score = {50, 80, 100, 100, 90}; // 점수 배열
		int myScore = 77; // 내 점수
		
		int scoreCount = 0; // 카운트
		
		for (int i = 0; i < score.length; i++) {
			int temp = score[i];
			System.out.println("배열에서 가져온 점수 : "+temp);
			if (temp > myScore) { // if로 비교하기
				++scoreCount; // 증감연산자 이용
			}
		}
		System.out.println("최종 값 : "+scoreCount);
		
		/*
		 *  기습 문제 2.
		 *  배열에서 최대 값 찾기
		 */
		int [] numbers = {12, 45, 7, 23, 56, 89, 34}; // 89가 최댓값!
		int max = 0; // 최댓값 담을 변수
		
		for (int i = 0; i < numbers.length; i++) { // 배열 길이만큼 반복
			int temp = numbers[i]; // 요소를 temp변수에 대입
			if (temp > max) { // max 변수보다 크다면?
				max = temp;
			}
		}
		System.out.println("가장 큰 값은? : "+max);
		
		/*
		 *  기습 문제 3.
		 *  닉네임 중복 체크하기
		 */
		String [] nickNames = {"사과", "바나나", "오렌지", "포도", "키위"};
		String userNickName = "사과"; // 입력받은 닉네임	
		// nickNames 배열에 입력받은 닉네임이 있다면 "닉네임이 중복됩니다" 라는 메세지를 출력하세요.
		boolean isFlag = false; // 플래그값(0 아니면 1을 의미함) → 깃발(Flag)은 앞과 뒤만 있으니까
		for (int i = 0; i < nickNames.length; i++) {
			String temp = nickNames[i]; // 배열 요소 temp에 대입
			if (temp.equals(userNickName)) { // 동일하다면?
				isFlag = true;
			}
		}
		// 플래그를 활용한 코딩
		if (isFlag) { // 처음에 false였는데 true로 변했다면 중복된 닉네임이 있다는 것!
			System.out.println("닉네임이 중복됩니다.");
		}
		
		/*
		 * 기습 문제 4.
		 * 배열의 모든 요소의 합 구하기(for-each로 풀기)
		 */
		int [] numbers2 = {5, 10, 15, 20, 25};
		int sum = 0;
		
		for (int i : numbers2) { // for-each(향상된 for문)
			System.out.println("배열 요소 출력 : "+i);
			sum += i; // 요소 총합 구하기
		}
		System.out.println("요소 총 합 : "+sum);
		
		

	}

}
