package Java_Study_1219;

/*
 * 상속(다형성)
 */
class X {
	
	int money;
	
	public X() {
		
	}
	public X(int money) {
		this.money = money;
	}
	public void showMeTheMoney() {
		System.out.println("My money : "+this.money+"$");
	}
}
class B { // 만수르 B 클래스 등장
	public void showMeTheMoney() {
		System.out.println("My money : "+100000000+"$");
	}
}
// extends : 상속하다
// 아쉽게도 Java는 다중상속이 불가능합니다. (C++, Python은 다중상속을 지원합니다.)
class Y extends X { // Y클래스가 X클래스를 상속받다.
	// Y클래스는 X클래스의 필드변수와 메소드를 사용할 수 있다.
	int myMoney = 1000;
	
	// 부모클래스에서 기본생성자를 수정했다면, 자식클래스 생성자에서 부모클래스 생성자를 무조건 호출해야한다.
	public Y() {
		super(40000); // 위의 'public X(int money) {' 를 부른 것.
	}
	/*
	 * int를 리턴하는 getMyMoney 메소드
	 */
	public int getMyMoney() {
		return this.myMoney;
	}
	@Override // 부모클래스에 정의된 메소드 '재정의(오버라이딩)'
	public void showMeTheMoney() {
		System.out.println("My(Y) money : "+900000+"$");
	}
	public void showMessage() { // 리턴 값이 없는 void 메소드
		System.out.println("안녕하세요, Y입니다.");
	}
}

public class Java_Review_2 {

	public static void main(String[] args) {
		
		X x = new X(); // X클래스 호출(객체 생성 or 인스턴스화)
		x.showMeTheMoney();
		// X는 showMessage()가 없음(부모클래스는 자식클래스의 메소드와 필드변수를 사용할 수 없음)
		
		Y y = new Y(); // Y클래스 호출
		y.showMeTheMoney(); // X클래스에서 정의된 메소드 사용
		y.showMessage();
		
		/*
		 * 자식은 부모의 메소드의 필드변수를 사용할 수 있지만,
		 * 부모는 자식클래스의 메소드와 필드변수를 사용할 수 없다.
		 */
		
		int result = y.getMyMoney(); // 리턴타입이 있는 메소드 호출
		// result라는 변수에 getMyMoney 최종 값을 리턴 받음.
		System.out.println("Result : "+result);

	}

}
