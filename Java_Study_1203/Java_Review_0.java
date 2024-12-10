package Java_Study_1203;

import java.util.Scanner;

public class Java_Review_0 {

	public static void main(String[] args) {
		
		/*
		 * 문제 6.
		 * 사용자로부터 문자열을 입력받아 그 문자열의
		 * 첫 번째와 마지막 문자를 출력하는 프로그램을 작성하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("또! 문자열을 입력하세요. : ");
		String userString4 = scan.next();
		
		System.out.println("첫 번째 문자는? : "+userString4.substring(0, 1)); // 첫 번째 단어부터 ~ 두 번째 단어 전까지
		System.out.println("마지막 문자는? : "+userString4.substring(userString4.length() - 1, userString4.length())); // 전체 길이에서 -1 즉, 마지막 단어
		
		
		/*
		 * 문제 8. (뭔가 더 깔끔하게 할 수 있을 것 같은데..)
		 * String word = "aabbacccaaaaa";
		 * 위 문자열에서 "a" 가 몇 번 나타나는지 세는 프로그램을 작성하세요.
		 */
		
		String word = "aabbacccaaaaa";
		
		String[] wordArray = word.split("");
		int count = 0;
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].equals("a")) { // a랑 비교해서 같으면
				++count;
				}
		}
		System.out.println("a의 개수는 : "+count);
		/*
		 * for(String i : wordArray) { → 배열의 길이만큼 자동으로 반복(for-each문)
		 * i에 자동으로 wordArray(배열 값)이 대입되는 것
		 */
		
		
		/*
		 * 문제 10.
		 * 문자열 배열 strArr이 주어집니다.
		 * 배열 내의 문자열 중 "ad" 라는 부분 문자열을
		 * 포함하고 있는 모든 문자열을 제외하고 출력하세요.
		 * 
		 * String[] strArr = {"there", "are", "no", "a", "ds"};
		 * 
		 * 예) {"and", "notad", "abcd"} → {"and", "abcd"}
		 * 1번 인덱스의 문자열인 "notad" 는 부분 문자열로 "ad" 를 가집니다.
		 * 따라서 해당 문자열을 제외한 "and" 와 "abcd" 가 출력됩니다.
		 */
		
		String[] strArr = {"and", "notad", "abcd"};
		
		for (String i : strArr) {
			if (!i.contains("ad")) { // 만약 ad가 포함되어 있지 않다면?(!붙여서)
				System.out.println(i);
			}
		}
		
		
		/*
		 * 문제 11.
		 * 영어에서는 a, e, i, o, u 다섯가지 알파벳을 모음으로 분류합니다.
		 * 문자열 my_string이 변수로 주어질 때, 모음을 제거한 문자열을 출력하세요.
		 * 
		 * String my_string = "nice to meet you";
		 * 
		 * 예) "nice to meet you" 에서 모음 i, o, e, u를 제거한 "nc t mt y"를 출력합니다.
		 */
		
		String my_string = "nice to meet you";
		String[] vow = {"a", "e", "i", "o", "u"}; // ① 모음 배열 초기화(선언)
		
		for (String i : vow) { // ② 모음을 for-each로 돌린다.
			my_string.replaceAll(i, ""); // ③ replaceAll로 모음을 ""로 대체
		}
		System.out.println(my_string); // ④ 출력!
		
		
		/*
		 * 문제 12.
		 * 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		 * 문자열 numbers가 변수로 주어질 때, numbers를 정수로 바꿔 출력하세요.
		 * 
		 * String numbers = "onefourzerosixseven"; // 14067
		 * 
		 * 예) "onetwothreefourfivesixseveneightnine" 을 숫자로 바꾼 123456789를 출력합니다.
	     */
		
		String numbers = "onefourzerosixseven"; // Tip : 결과가 14067로 나와야한다.
		// ① 배열 초기화
		String[] matchNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for (int i = 0; i < matchNumbers.length; i++) { // ② 반복문 생성
			numbers = numbers.replaceAll(matchNumbers[i], Integer.toString(i)); // ③ replaceAll로 특정 단어 숫자로 교체(Integer.toString : 숫자 → 문자로 변환)
		}
		System.out.println("정답 : "+numbers);

		
	}

}
