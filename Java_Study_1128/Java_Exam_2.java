package Java_Study_1128;

import java.util.Scanner;

public class Java_Exam_2 {

	public static void main(String[] args) {
		
		/*
		 * 문제 1.
		 * 사용자로부터 문자열을 입력받아 문자 길이를 출력하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요. : ");
		String userString = scan.next();
		
		String text = userString;
		System.out.println("해당 문자열의 길이는? : "+text.length());
		
		
		/*
		 * 문제 2.
		 * 문자열을 연결하는 함수는 무엇인가?
		 * ① split
		 * ② substring
		 * ③ concat
		 * ④ replace
		 */
		
		// 답변 : ② concat
		
		
		/*
		 * 문제 3.
		 * "010-1234-5678" 문자열이 주어질 때 "-" 기준으로 문자열을 분할하려먼
		 * 어떤 문자열 함수를 사용해야 하는가?
		 * ① split
		 * ② substring
		 * ③ concat
		 * ④ replace
		 */
		
		// 답변 : ① split
		
		
		/*
		 * 문제 4.
		 * String text = "Hello World!";
		 * 위 문자열을 모두 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		 */
		
		String code = "Hello World!";
		System.out.println(code.toUpperCase());
		
		
		/*
		 * 문제 5.
		 * 사용자로부터 두 개의 문자열을 입력받아
		 * 두 문자열이 같으면 "같습니다." 틀리면 "다릅니다."
		 * 를 출력하는 프로그램을 작성하세요.
		 */
		
		System.out.println("첫 번째 문자열을 입력하세요. : ");
		String userString2 = scan.next();
		System.out.println("두 번째 문자열을 입력하세요. : ");
		String userString3 = scan.next();
		
		String first = userString2;
		String secound = userString3;
		System.out.println("두 문자열을 비교한 결과는? : "+first.equals(secound)); // 두 문자가 동일한 지 비교
		/*
		 * ↓ 이렇게 써도 같은 값이 나오는데..
		 * 
		 * if(first == secound) {
		 * System.out.println("같습니다");
		 * }
		 * 
		 * (위 코드는 문자를 비교하는게 아닌, 메모리에 저장된 주소를 비교하는 것)
		 * 
		 * 
		 * 
		 * ↓ 이렇게 써야됨!
		 * 
		 * if(first.equals(secound)) {
		 * System.out.println("같습니다");
		 * }
		 * 
		 */
		
		
		/*
		 * 문제 6.
		 * 사용자로부터 문자열을 입력받아 그 문자열의
		 * 첫 번째와 마지막 문자를 출력하는 프로그램을 작성하세요.
		 */
		
		System.out.println("또! 문자열을 입력하세요. : ");
		String userString4 = scan.next();
		
		System.out.println("첫 번째 문자는? : "+userString4.substring(0, 1)); // 첫 번째 단어부터 ~ 두 번째 단어 전까지
		System.out.println("마지막 문자는? : "+userString4.substring(userString4.length() - 1, userString4.length())); // 전체 길이에서 -1 즉, 마지막 단어
		
		
		
		/*
		 * 문제 7.
		 * 사용자로부터 문자열과 정수 n을 입력받아,
		 * 해당 문자열의 앞에서 n개의 문자를 출력하는 프로그램을 작성하세요.
		 * 예) 입력받은 문자열 "아메리카노"
		 * 입력받은 정수 n이 3이라고 가정
		 * 해당 문자열의 앞에서 3개의 문자 "아메리" 가 출력
		 */
		
		System.out.print("또!또! 문자열을 입력하세요. : ");
		String userString5 = scan.next();
		System.out.print("출력하고자 하는 길이를 정수로 입력하세요. : ");
		int userString6 = scan.nextInt();
		
		String text2 = userString5;
		System.out.println(text2.substring(0, userString6));
		
		
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
		 * 문제 9.
		 * String email = "user@gmail.com";
		 * 위 문자열에서 split을 사용하여 gmail.com만 출력하세요.
		 */
		
		String email = "user@gmail.com";
		String[] result = email.split("@"); // 해당 문자를 @로 나눈다.
		System.out.println(result[1]);
		
		
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
		
		String[] strArr = {"there", "are", "no", "a", "ds"};
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i].replaceAll("ad", "")); // 제외시키는 방법을 도저히 모르겠어서 그냥 "" ← 이거로 대체시켜 버렸음..
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
		
		String[] 모음 = {"a", "e", "i", "o", "u"}; // 모음 배열화(?)
		
		for (int i = 0; i < 모음.length; i++) {
			my_string = my_string.replaceAll(모음[i], ""); // 그냥 모음세트를 전부 "" ← 이거로 대체, "nice to meet you" 에 그냥 대입시켜버림..ㅠ
		}
		System.out.println(my_string); // 첨에 syso를 for문 안에 넣었더니 5번을 반복지랄해서 바깥으로 뺌 ㅋ
		
		
		/*
		 * 문제 12.
		 * 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
		 * 문자열 numbers가 변수로 주어질 때, numbers를 정수로 바꿔 출력하세요.
		 * 
		 * String numbers = "onefourzerosixseven"; // 14067
		 * 
		 * 예) "onetwothreefourfivesixseveneightnine" 을 숫자로 바꾼 123456789를 출력합니다.
	     */
		
		String numbers = "onefourzerosixseven"; // 14067
		
		// [문자 숫자]와 [실제 숫자]를 나란히 배열([wordNumbers] 0번 인덱스에 : zero / [realNumbers] 0번 인덱스에 : 0)
		String[] wordNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] realNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		// 변환 결과를 저장할 공란(변수) 생성
		String result2 = "";
		
		
		while (numbers.length() > 0) {// 0이 될 때까지 계속 반복시켜!
            for (int i = 0; i < wordNumbers.length; i++) {
            	if (numbers.length() >= wordNumbers.length) { // 길이가 다르면
            		numbers.substring(0, wordNumbers.length); // 자르기
            		if (numbers.equals(wordNumbers.length)) { // 단어가 같으면
            			result2 = realNumbers[i]; // result2에 대입
            			break;
            			}
            		}
            	}
            }
		System.out.println("onefourzerosixseven를 숫자로 바꾸면? : "+Integer.parseInt(result2));
		
		
		
	}

}