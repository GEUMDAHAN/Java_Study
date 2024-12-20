package Java_Study_1219;

/*
 * 객체지향 언어(Java, C++, C#, Python...)의 특징
 */
class A { // 클래스 'A'
	/*
	 * ① 필드변수
	 * ② 기본(default) 생성자
	 * ③ 메소드
	 */
	int x; // 필드변수(전역변수) : '클래스 안에 작성'된 모든 메소드에서 필드변수를 사용할 수 있음
	public A() { // 기본생성자
		/*
		 * ① 생성자 이름이 클래스 이름과 동일
		 * ② 리턴타입이 X
		 */
	}
	public A(int x) { // 파라미터 값이 존재하는 생성자(오버로딩 : 파라미터 값만 다르게 하면 기본생성자와 같은 이름 쓸 수 있음)
		this.x = x; // 파라미터로 받은 값을 필드변수 'x'에 대입
	}
	/*
	 * 리턴타입이 int인 메소드 'getNum'
	 * 파라미터로 int x와 int y를 받습니다.
	 * 리턴은 int형으로 해줍니다.
	 */
	public int getNum(int x, int y) {
		return x + y;
	}
	/*
	 * 리턴타입이 배열인 메소드 'getArr'
	 * 파라미터로 String[]을 받습니다.
	 * 리턴은 '문자형 배열'로 해줍니다.
	 */
	public String[] getArr(String[] array) {
		return array;
	}
}

public class Java_Review_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
