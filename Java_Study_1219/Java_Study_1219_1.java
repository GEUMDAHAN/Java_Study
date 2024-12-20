package Java_Study_1219;

interface CC {
	// 인터페이스는 클래스와 다르게 생성자가 없음
	/*
	 * public CC() { → 오류 발생!
	 */
	
	/*
	 * 인터페이스
	 * ① 메소드 선언만 가능(구현 X)
	 * ② 접근지정자는 'public'만 가능
	 */
	public void z(); // 메소드 z 선언
	
}

class AA {
	public void 메세지보여주다() {
		System.out.println("안녕하세요.");
	}
}
/*
 * 자바는 다중 상속이 불가능
 * ㄴ그래서 다중 상속이 가능하도록 '특별한 기능'이 존재
 * implements를 실무에서 100% 사용합니다.
 */
class BB extends AA implements CC{

	@Override
	public void z() { // '강제'로 재정의 해야함.(무조건 내 메소드를 가져다 써)
		
	} // BB클래스는 AA클래스를 상속받았습니다.(BB클래스에서 AA클래스에 정의된 메소드를 사용 혹은 재사용 가능)
	/*
	 * implements : 구현하다
	 * '클래스 BB는 인터페이스 CC를 구현하다' 라는 뜻
	 * 
	 * 인터페이스를 상속받으면(구현하면) 인터페이스 CC에 있는 메소드를 반드시 '재정의' 해야합니다.
	 * 즉, 인터페이스를 구현한 클래스는 '강제'로 구현해야합니다.
	 */
	
	/*
	 * 정리(팩트 체크)
	 * ① 자바는 다중상속을 지원하지 않는다.
	 * ② 인터페이스라는 방법으로 다중상속을 구현한다.
	 * ③ 인터페이스에 정의된 메소드를 강제로 재정의 해야한다.
	 * ④ 클래스로 상속받으면 재정의를 자유롭게 정할 수 있다.(해도 되고, 안해도 되고)
	 * 
	 * 상속 이점
	 * ① 코드 재사용 가능
	 * ② 다형성 구현
	 * ③ 계층구조 형성 
	 */
	
}

public class Java_Study_1219_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
