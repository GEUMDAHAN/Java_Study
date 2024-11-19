package Java_Study;

import java.util.Scanner;

// 자바 공부를 시작하겠습니다.(// = 주석)
public class 자바241112 {

	public static void main(String[] args) {
		// 여기에 코드를 작성할 예정
		// 문장 마지막에는 세미콜론을 작성
System.out.println("안녕하세요, 오늘 자바를 배웁니다.");
		//Ctrl+F11을 누르면 자바 실행됨
//System.out.println : 작성한 내용을 확인할 수 있는 기능

System.out.println("Hello World!");
//syso + Ctrl + Space + Enter (System.out.println 퀵 실행)
System.out.println("원스 휴먼 개 재밌습니다^^");

System.out.println("오늘 수업 끝나고 원스 휴먼 잠깐 들어가봐야지~");

System.out.println("운동도 해야하는데..");

System.out.println("...");

System.out.println("원스 휴먼 개꿀잼!");

System.out.println("현재 년도는 : " + 2024 + "입니다.");
//System.out.println : 출력문
//출력문에서 + 는 문자를 더해준다는 의미(문자와 문자를 합친다.)

//아래에 여러분들 키와 나이를 입력해주세요.
System.out.println("키 : " + 177 + " 입니다.");
System.out.println("나이 : " + 20 + " 입니다.");
//ln은 개행(줄바꿈)을 의미합니다.
//ln이 없으면 가로로 쭉- 출력됩니다.
System.out.print("안녕하세요!");
System.out.print("안녕하세요!");

//변수 : 어떤 값을 대입할 때 사용
//int는 숫자를 의미, string은 문자를 의미합니다.
int age = 20; //나이
String address = "대전 서구 둔산동"; //주소
String mbti = "INFP";
//age ~ mbti : 변수명(대문자 X, 소문자 O)

System.out.println("나이는 : " + age); //age에 대입한 값이 출력됨
System.out.println("주소는 : " + address); //adress에 대입한 값이 출력됨
System.out.println("MBTI는 : " + mbti); //mbti에 대입한 값이 출력됨


//입력받기
Scanner scan = new Scanner(System.in);
//입력하신 후에 Ctrl + Shift + O 를 눌러주세요.

System.out.print("이름을 입력해주세요 => ");
String n = scan.next();
System.out.println("입력하신 이름은 : "+n+" 입니다.");

System.out.println("MBTI를 입력해주세요 => ");
String m = scan.next();
System.out.println("MBTI는 " + m +" 입니다." );

System.out.println("나이를 입력해주세요 => ");
int a = scan.nextInt();
System.out.println("나이는 " + a + " 입니다.");

System.out.println("취미를 입력해주세요 => ");
String h = scan.next(); //문자 입력받기
System.out.println("취미는 " + h + " 입니다.");

System.out.println("키를 입력해주세요 => ");
int hei = scan.nextInt(); //숫자 입력받기
System.out.println("키는 " + hei + " 입니다.");

	}

}
