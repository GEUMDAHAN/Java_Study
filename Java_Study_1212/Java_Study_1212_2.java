package Java_Study_1212;

class Person {
	// 필드변수
	String name;
	int age;
	
	Person(String name, int age) { // 생성자 : 클래스가 생성될 때(new라는 키워드로 불러올 떄) 초기화를 위해 실행되는 특별한 '메소드'
		/*
		 * 생성자 특징
		 * ① 생성자 이름과 클래스 이름은 동일해야합니다.
		 * ② 생성자는 리턴타입이 없는 '메소드' 입니다.
		 * ③ 생성자는 파라미터 타입만 있고, 기본(default) 생성자는 아무것도 받지 않습니다.
		 * 
		 * 생성자 파라미터의 역할
		 * 받은 값을 필드변수에 대입
		 */
		this.name = name; // this.name은 필드변수 = 뒤 name은 생성자
		this.age = age;
		// this.x = 10; → 필드변수에 x라는 변수가 없으므로 해당 코드는 오류!
	}
	
	// void : 리턴타입이 없는 메소드 'celebrateBirthday' 생성
	public void celebrateBirthday(String name) {
		++age; // 메소드에서 필드변수 접근 가능
	}
}

public class Java_Study_1212_2 {

	public static void main(String[] args) {
		
		Person p = new Person("김철수", 20); // Person 클래스 불러오기
		p.name = "김철수";
		p.age = 20;
		System.out.println("이름 : "+p.name); // 필드변수 출력
		System.out.println("나이 : "+p.age);
		p.celebrateBirthday("김철수"); // 메소드 호출
		// 파라미터에 값이 있다면, 메소드를 호출할 때 값을 무조건 넣어줘야합니다.
		System.out.println("나이 : "+p.age);
		
		Person p2 = new Person("홍길동", 30); // 생성자로 필드변수 초기화 하기
		System.out.println("나이 : "+p2.name); // 필드변수 출력
		System.out.println("나이 : "+p2.age);


	}

}
