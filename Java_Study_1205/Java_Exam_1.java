package Java_Study_1205;

import java.util.Random;
import java.util.Scanner;

public class Java_Exam_1 {

	public static void main(String[] args) {
		
		
		/*
		 * 문제 1.
		 * OO은 final 키워드를 사용합니다. 실행 중 값 변경이 불가능한 게 특징입니다.
		 * OO은 무엇일까요?
		 * 
		 * ① 변수
		 * ② 실수
		 * ③ 상수
		 * ④ 정수
		 */
		
		// 답변 : ③ 상수
		
		
		/*
		 * 문제 2.
		 * 문자형 변수 x를 선언하고 "10"을 할당 후,
		 * 정수형 변수 y를 선언하고 x의 값을 y에 대입하세요.
		 * (문자에서 정수형으로 '형변환' 해야합니다.
		 */
		
		String x = "10";
		int y = Integer.parseInt(x); // 문자 "10"을 숫자 10으로 변환
		
		
		/*
		 * 문제 3.
		 * 다음 중 잘못된 식별자(변수명)은?
		 * 
		 * ① monster3
		 * ② apple_13_pro
		 * ③ 3apple
		 * ④ AaaAAA
		 */
		
		// 답변 : ③ 3apple(변수명 앞에 숫자 X)
		
		
		/*
		 * 문제 4.
		 * 1부터 100까지의 숫자 중 짝수인지 홀수인지 판별하는 프로그램을 작성해주세요.
		 */
		
		int oddNumbers = 0;
		int evenNumbers = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // 짝수인지 확인
				evenNumbers = i;
				System.out.println("1부터 100까지의 숫자 중 짝수는 : "+evenNumbers);
			} else {
				oddNumbers = i;
				System.out.println("1부터 100까지의 숫자 중 홀수는 : "+oddNumbers);
			}
		}
		
		
		/*
		 * 문제 5.
		 * boolean 면허증소지 = true;
		 * boolean 운전가능 = !면허증소지;
		 * 최종 운전가능 값은 무엇일까요?
		 */
		
		// 답변 : false(논리연산자 NOT : 조건의 결과를 뒤집음)
		
		
		/*
		 * 문제 6.
		 * 1부터 100까지의 숫자 중 3의 배수의 합을 구하는 프로그램을 작성하세요.
		 */
		
		int multipleOf3 = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				multipleOf3 += i;
			}
		}
		System.out.println("1부터 100까지의 숫자 중 3의 배수의 합은? : "+multipleOf3);
		
		
		/*
		 * 문제 7.
		 * 길동이네 피자 가게는 피자를 일곱 조각으로 잘라 줍니다.
		 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상
		 * 먹기 위해 필요한 피자의 수를 출력하세요.
		 * 
		 * 예) 15명이 최소 한 조각 씩 먹기 위해서 최소 3판이 필요합니다.
		 * n이 15라고 가정하면 피자는 3판이 필요합니다.
		 */
		
		int n = 15; // 사람의 수
		final int PIZZASLICES = 7; // 피자 조각의 수(상수의 변수명은 대문자)
		
		int requiredPizzaSlices = n / PIZZASLICES; // 요구되는 총 피자조각을 구하려면 15명을 7조각으로 나눈다.
		
		if (n % PIZZASLICES != 0) { // 나머지가 있다면(즉, 한 판 더 필요하다면)
			++requiredPizzaSlices;	
		}
		System.out.println(n+"명이 최소 한 조각씩 먹기 위해 필요한 피자 판 수는 "+requiredPizzaSlices+"판입니다.");
		
		
		/*
		 * 문제 8.
		 * 사용자로부터 정수를 입력받아 팩토리얼을 계산하는 프로그램을 작성하세요.
		 * 예) 5! = 5 * 4 * 3 * 2 * 1
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("팩토리얼을 계산할 숫자를 입력하세요. : ");
		int num = scan.nextInt();
		
		int factorial = 1; // 팩토리얼을 저장할 변수(0은 안되니까 1로)
		
		for (int i = 2; i <= num; i++) { // 2부터 입력받은 수까지 반복
			factorial = factorial * i; // 팩토리얼 계산법
		}
		System.out.println(num+"! = "+factorial);
		
		
		/*
		 * 문제 9. ★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * 2부터 5까지의 구구단을 출력하는 프로그램을 작성하세요.
		 */
		
		int multiplicationTables = 2;
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <i ; j++) {
				System.out.println(+multiplicationTables+" X "+i+" = "+(multiplicationTables * i));
			}
		}
		
		
		/*
		 * 문제 10.
		 * 다음과 같은 패턴을 출력하는 프로그램을 작성하세요.
		 * 
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for (int i = 4; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 개행 용도
		}
		
		
		/*
		 * 문제 11.
		 * 사용자로부터 문자열을 입력받아
		 * 그 문자열의 길이를 출력하는 프로그램을 작성하세요.
		 * 단, 길이가 11 이상인 문자열은 "아이디는 10글자 이하로 작성해주세요." 라고 출력할 것.
		 */
		
		System.out.print("아이디를 입력하세요. : ");
		String userId = scan.next();
		
		String userIdString = userId;
		
		if (userIdString.length() >= 11) {
			System.out.println("아이디는 10글자 이하로 작성해주세요.");	
		} else {
			System.out.println("아이디의 길이는? : "+userIdString.length());	
		}
		
		
		/*
		 * 문제 12.
		 * 배열에 대한 설명 중 틀린 것은?
		 * ① 배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간이다.
		 * ② int[] array = new int[10]; 총 10개의 공간이 생성되었다.
		 * ③ 배열은 항상 0부터 시작한다.
		 * ④ 반복문을 이용하여 처리하기에 적합하지 않은 자료구조이다.
		 */
		
		// 답변 ④ (배열과 반복문은 친구!)
		
		
		/*
		 * 문제 13.
		 * 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		 * 배열에서 가장 큰 값을 작성하세요.
		 */
		
		Random random = new Random();
		
		int [] numbers = new int [10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(100)+1; // 1~100 범위를 임의 값으로 초기화
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
        int maximum = numbers[0]; // 첫 번째 배열을 최대 값으로 설정
        
        for (int i = 0; i < numbers.length; i++) { // 1~100까지 쫙 반복시키고
        	if (numbers[i] > maximum) { // 돌리다가 첫 번째 배열 값이 더 클 때
				maximum = numbers[i]; // maximum에 대입
			}
        }
        System.out.println("여기서 최대 값은? : "+maximum);
        
        
        /*
		 * 문제 14. ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * 크기가 10인 정수 배열을 선언하고 랜덤한 값(1~100)으로 초기화한 후,
		 * 배열의 모든 요소의 평균과 합산을 출력하는 프로그램을 작성하세요.
		 */
        
        int [] numbers2 = new int [10];
        
        for (int i = 0; i < numbers2.length; i++) {
			numbers2[i] = random.nextInt(100)+1; // 1~100 범위를 임의 값으로 초기화
			System.out.print(numbers[i]+" ");
        }
        System.out.println();
        
        int sum = 0;
        int avg = 0;
        
        for (int i = 0; i < numbers2.length; i++) {
        	sum =+ numbers2[i];
        	avg = sum / 10;
        }
        System.out.println("총 합은 "+sum+"이고, 평균은 "+avg+"입니다.");
        
        
        /*
		 * 문제 15.
		 * 문자열 "Java Programming"에서 'a'의 개수를 세는 코드를 작성하세요.
		 */
        
        String word = "Java Programming";
		String[] wordArray = word.split("");
		
		int count = 0;
		
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].equals("a")) { // a랑 비교해서 같으면
				++count;
				}
		}
		System.out.println("a의 개수는 : "+count);
		
		
		/*
		 * 문제 16.
		 * 아이스 아메리카노는 한 잔에 5,500원입니다.
		 * money가 변수로 주어질 때,
		 * 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 출력하세요.
		 * 
		 * int money = 15000;
		 * 예) 15000원이면 커피 2잔과 4000원이 남습니다.
		 */
		
		int money = 15000;
		int coffePrice = 5500; 
		
		int maximumCoffe = money / coffePrice;
		int change = money - coffePrice*maximumCoffe;
		
		System.out.println("최대로 마실 수 있는 잔 수는 "+maximumCoffe+"잔, "+"남는 돈은 "+change);
		
		
		/*
		 * 문제 17.
		 * 길동이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
		 * 길동이네 반 친구들의 키가 담긴 정수 배열 array와 길동이의 키 height가 변수로 주어질 때,
		 * 길동이보다 키 큰 사람 수를 출력하세요.
		 * 
		 * int[] array = {149, 180, 192, 170};
		 * int height = 167;
		 * 
		 * 예) 149, 180, 192, 170 중 길동이보다 키가 큰 사람은
		 * 180, 192, 170으로 세 명입니다.
		 */
		
		int[] array = {149, 180, 192, 170};
		int height = 167;
		
		int taller = 0;
		
		for (int i : array) {
			if (height < i) { // if로 키 큰 사람 체크하기
				++taller;
			}
		}
		System.out.println("길동이보다 키가 더 큰 사람은 "+taller+"명입니다.");
		
		
		/*
		 * 문제 18.
		 * 군 전략사 길동이는 전쟁 중 적군이 다음과 같은 암호체계를 사용한다는 것을 알아냈습니다.
		 * ① 암호환된 문자열 cipher를 주고받습니다.
		 * ② 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
		 * 
		 * 문자열 chiper와 정수 code가 매개변수로 주어질 때, 해독된 암호 문자열을 출력하세요.
		 * 
		 * String cipher = "dfjardstddetckdaccccdegk";
		 * int code = 4;
		 * 
		 * 예) "dfjardstddetckdaccccdegk" 의 4번째, 8번째, 12번째, 16번째, 20번째, 24번째 글자를 합친 "attack"을 출력합니다.
		 */
		
		/*String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		
		String[] cipherArray = {"d", "f", "j", "a", "r", "d", "s", "t", "d", "d", "e", "t", "c", "k", "d", "a", "c", "c", "c", "c", "d", "e", "g", "k"};
		
		String secret = ""; // 빈 문자열 생성
		
		for (int i = 0; i < cipherArray.length; i++) {
			if ((i + 1) % code == 0) { // 4의 배수일 때만(숫자 4 넣으니까 문자열에 정수 넣어서 안됨 → 변수명 code 넣으니까 되네?)
				secret = cipherArray[i]; // 왜 cipherArray[i] 값이 secret으로 제대로 안 들어가는 거지?(Why! 왜!)
			}
		}
		System.out.println("해독된 암호는? : "+secret); // 그냥 k가 나옴.. 모르겠어! 이유를..
		*/
		
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		
		String answer = ""; // 최종 결과
		
		for (int i = 0; i < cipher.length(); i++) { // 문자길이만큼 반복문 돌리기
			if ((i+1) % code == 0) { // code의 배수라면?(i가 0이면 의미 없으니 +1)
				answer += cipher.substring(i, i + 1); // substring으로 한 글자만 가져오기
			}
		}
		System.out.println("해독된 암호는? : "+answer);
		
		
		/*
		 * 문제 19.
		 * 전화번호 문자열 phone_number로 주어졌을 때, 전화번호 뒷 4자리를 제외한
		 * 나머지 숫자를 전부 *으로 가린 문자열을 출력하는 프로그램을 완성하세요.
		 * 
		 * String phone_number = "0171238888";
		 * 
		 * 예) 027778888은 *****8888
		 * 01033334444는 *******4444가 나와야합니다.
		 */
		
		// 첫 번째 방법(substring)
		String phone_number = "0171238888";
		
        int temp = phone_number.length() - 4; // 뒷 4자리를 제외한
        String star = "";
        for (int i = 0; i < temp; i++) {
        	star += "*";
        }
        String lastNumbers = phone_number.substring(temp); // 6번째 자리부터 모두 나오게끔
        System.out.println("lastNumbers : "+lastNumbers);
        phone_number = star + lastNumbers;
        System.out.println("phone_number : "+phone_number);
        
        // 두 번째 방법(split)
        String[] phone = phone_number.split(""); // split으로 한 글자 한 글자 배열에 담기
        String result2 = ""; // 결과
        for (int i = 0; i < phone.length; i++) { // 배열 길이만큼 반복
        	if (i < (phone_number.length() - 4)) {
        		result2 += "*";
        	} else {
        		result2 += phone[i];
        	}
        }
        System.out.println("result2 : "+result2);
        
        // 따로 만드는 방법 밖에 없나? 한 번에 같이 묶어서 할 순 없을까..(반복)
        String phone_number2 = "01033334444";
		
        int phone_number2Length = phone_number2.length(); 

        String frontNumbers2 = phone_number2.substring(0, phone_number2Length - 4);
        String lastFourNumbers2 = phone_number2.substring(phone_number2Length - 4);
        
        String secretNumbers2 = "*".repeat(lastFourNumbers2.length());

        System.out.println(frontNumbers2+secretNumbers2);
		
		
        /*
		 * 문제 20. [While문 이용하기]
		 * OO치킨은 치킨을 시켜먹으면 한 마리당 쿠폰 한 장을 발급합니다.
		 * 쿠폰을 10장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
		 * 시켜먹은 치킨의 수 chicken이 변수로 주어질 때,
		 * 받을 수 있는 최대 서비스 치킨의 수를 출력하세요.
		 * 
		 * int chicken = 100;
		 * 
		 * 예)
		 * ① 1081마리를 주문하면 쿠폰이 1081장 발급되므로 서비스 치킨 108마리를 주문할 수 있습니다. 그리고 쿠폰이 1장 남습니다.
		 * ② 108마리를 주문하면 쿠폰이 108장 발급되므로 서비스 치킨 10마리를 주문할 수 있습니다. 그리고 쿠폰이 8장 남습니다.
		 * ③ 10마리를 주문하면 쿠폰이 10장 발급되므로 서비스 치킨 1마리를 주문할 수 있습니다.
		 * ④ 1마리를 주문하면 쿠폰이 1장 발급됩니다.
		 * ⑤ 가지고 있는 쿠폰이 총 10장이므로 서비스 치킨 1마리를 추가로 주문할 수 있습니다.
		 * ⑥ 따라서 108 + 10 + 1 + 1 = 120을 출력합니다.
		 */
        
        int chicken = 100; // 1081마리 주문
        int chickenCount = 0; // 총 내가 받을 수 있는 치킨 수
        
        // 1. 반복을 하면서 쿠폰이 있는지? 없는 지를 체크해야합니다.
        // 2. 10번 반복할 지 5번 반복할 지 모름 → while문
        
        while (chicken >= 10) { // 쿠폰이 10장 이상일 때만 반복
        	int coupon = chicken % 10; // 나머지 값을 쿠폰에 대입
        	chickenCount += chicken / 10;
        	chicken = coupon + chicken / 10;
        }
        System.out.println("받을 수 있는 최대 서비스 치킨 수는? : "+chickenCount);
        
        
		/*
		 * 문제 21.
		 * 문자열 my_string이 변수로 주어집니다.
		 * my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 출력하세요.
		 * 
		 * String my_string = "people";
		 * 
		 * 예) "people"에서 중복된 문자 "p"와 "e"를 제거한 "peol"을 출력합니다.
		 */
		
		String my_string = "people"; // p와 e가 중복됨
		String[] strArray = my_string.split("");
		
		String result3 = ""; // 최종 결과 변수
		
		for (int i = 0; i < strArray.length; i++) {
			if (!result3.contains(strArray[i])); { // 포함이 안되어 있다면 넣어서 오히려
				result3 += strArray[i];
			}
		}
		System.out.println(result3);
		
		
		/*
		 * 문제 22.
		 * 개미 군단이 사냥을 나가려고 합니다.
		 * 개미군단은 사냥감의 체력에 딱 맞는 병력이 데리고 나가려는데
		 * 장군개미는 5의 공격력을, 병정개미는 3의 공격력을, 일개미는 1의 공격력을 가지고 있습니다.
		 * 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고가도 되지만,
		 * 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
		 * 사냥감의 체력 hp가 변수로 주어질 때,
		 * 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 출력하세요.
		 * 
		 * int hp = 24;
		 * 
		 * 예)
		 * ① hp가 24이므로 장군개미 네 마리, 병정개미 한 마리, 일개미 한 마리로 사냥할 수 있습니다. 따라서 6을 출력합니다.
		 * ② hp가 999이므로 장군개미 199마리, 병정개미 한 마리, 일개미 한 마리로 사냥할 수 있습니다. 따라서 201을 출력합니다.
		 */
		
		int hp = 24;
		
		int 장군개미 = 5;
		int 병정개미 = 3;
		int 일개미 = 1;
		
		int 남은체력 = 0;
		
		남은체력 = hp / 장군개미;
		int 남은체력2 = (hp % 장군개미) / 병정개미;
		int 남은체력3 = (남은체력 % 병정개미) / 일개미;
		
		int 최소병력 = 남은체력+남은체력2+남은체력3; // 저번에 증감연산자 사용하면 더 좋다고 했는데 여기서 어떻게 써야할 지 감이 안잡힘;
		
		System.out.println("요구되는 최소병력은 : "+최소병력+"명");
		
		
		// 그리드(탐욕) 알고리즘 : 매 선택에 있어서 가장 최선의 선택
		int hp2 = 24;
		int count2 = 0;
		
		count2 += hp2 / 5; // 장군개미
		hp2 %= 5;
		
		count2 += hp2 / 3; // 병정개미
		hp2 %= 3;
		
		count2 += hp2;
		System.out.println(count2);
	}
}
