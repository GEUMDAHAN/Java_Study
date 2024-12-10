package Java_Study_1128;

public class Java_Study_1128 {

	public static void main(String[] args) {
		
		
		// ★★★length : 문자열 길이 출력
		String text = "홍길동";
		System.out.println(text.length()); // 문자열 길이 출력
		
		String userId = "홍길동";
		if (userId.length() >= 10) { // 문자열 길이가 10 이상이라면?
			System.out.println("아이디는 10글자 미만으로 작성해주세요.");
		} else {
			System.out.println("사용 가능한 아이디입니다.");
		}
		
		// concat : 두 문자열을 합친다.(거의 안 씀)
		String a = "apple";
		String b = "watch";
		System.out.println("문자열 합치기 : "+a.concat(b));
		
		// ★substring : 부분 문자열 추출(많이 씀)
		String text1 = "Hello, World!";
		System.out.println(text1.substring(0, 5)); // Hello(5 번째 전까지만 출력)
		
		/*
		 *  기습 문제 1.
		 *  Wor ← substring으로 해당 단어 출력하세요.
		 */
		System.out.println(text1.substring(7, 10));
		
		// indexOf : 문자열 검색(해당 문자가 몇 번째 위치하는지 조회)
		System.out.println(text1.indexOf("l")); // l은 2 번째 위치
		System.out.println(text1.indexOf("W")); // W는 7 번째 위치
		
		// ★★★replace : 문자열 대체
		String word = "순대국밥";
		System.out.println(word.replaceAll("순대", "돼지")); // 순대를 돼지로 변경
		
		// ★toUpper, toLower : 소문자 → 대문자, 대문자 → 소문자 변경
		String code = "abcd00";
		System.out.println(code.toUpperCase()); // 소문자 → 대문자 변경
		
		// ★★trim : 공백 제거
		String word2 = "	안녕하세요?	";
		System.out.println(word2.trim()); // 앞뒤 공백 제거
		
		// ★★★split : 문자 분할(실무에서 데이터분석 or 코딩테스트 단골손님)
		String word3 = "토트넘, 아스널, 리버풀";
		String[] result = word3.split(", "); // 해당 문자를 콤마로 나눈다.
		System.out.println(result[0]);
		System.out.println(result[2]);
		
		// ★★contains : 특정 문자열이 포함되어 있는지 여부 확인
		String word4 = "Secretto@gmail.com";
		System.out.println(word4.contains("@")); // 있으면 true, 없으면 false
		System.out.println(word4.contains("b")); // 있으면 true, 없으면 false
		
		// ★★★equals : 문자열 비교(자바 특징)
		String food = "등심 돈까스";
		String food2 = "등심 돈까스";
		String food3 = "치즈 돈까스";
		// ==(비교연산자) : 자바에서 문자열 비교는 equals로 합니다.
		System.out.println(food.equals(food2)); // 두 문자가 동일한 지 비교
		System.out.println(food.equals(food3)); // 두 문자가 동일한 지 비교
		
	}

}