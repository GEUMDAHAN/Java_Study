package Java_Study_1220;
/*
 * 클래스 생성 시 자동으로 생기는 것들
 * ① Object : 모든 Java의 클래스는 Object를 상속받고 있음
 * ② 기본(default) 생성자
 */
class B extends Object { // ① Object
	
	int x; // 필드변수(전역변수) : 모든 메소드에서 접근 가능
	
	public B() { // ② default 생성자
		/*
		 * 생성자 특징
		 * ① 리턴타입이 없음
		 * ② 메소드 이름과 클래스 이름이 동일
		 */
	}
	/*
	 *  오버로딩 : 메소드 이름은 동일하나 파라미터 값이 다를 때
	 *   ㄴ메소드 이름 짓기 힘들어서 만든 거 ㅋ
	 */
	public B(int x) { // 파라미터 값이 존재한 생성자
		this.x = x; // this를 이용해서 파라미터 값을 필드변수 'x'에 대입
	}
	
	public void showMessage() {
		System.out.println("안녕하세요, 저는 B클래스 입니다.");
	}
}
// extends : 상속
// implements : 구현하다(A클래스는 C를 구현하다)
class A extends B implements C { // Java는 다중상속을 지원 X(interface를 이용)
	/*
	 * A클래스는 '자식클래스', B클래스는 '부모클래스'
	 * A클래스는 B클래스에 선언된 메소드와 필드변수를 사용할 수 있지만.
	 * 접근지정가가 public 혹은 protected로 되어있어야함.
	 */
	@Override
	public void showMessage() { // 부모클래스 메소드 '재정의'(오버라이딩)
		System.out.println("저는 A클래스 입니다.");
	}

@Override
public void showMessage2() {
	// 인터페이스에 정의된 메소드를 '강제'로 구현해야하는 특징을 가지고 있음(계약 관계)
	System.out.println("인터페이스 메소드 재정의 하기");
	}
}

interface C { // 정의서
	// 인터페이스는 '메소드 선언'만 가능(구현 불가능)
	public void showMessage2();
}

public class Java_Review {

	public static void main(String[] args) {
		
		A a = new A(); // A클래스 호출('A'클래스 객체 생성)
		// A클래스는 부모의 필드변수와 메소드를 사용할 수 있음.
		a.showMessage();
		a.x = 10;
		a.showMessage2();

	}

}
