package Java_Study_1212;

class 학생 {
	String 이름; // 필드변수(전역변수) : 초기화 생략 가능(= 0; 이런거)
	int 학년;
	
	/*
	 * 클래스 구조(객체지향 프로그램 언어(C++, Python, Java 등..)에 있는 공통 개념
	 * ① 필드변수
	 * ② 메소드 : 메소드는 특정 작업을 수행하는 코드의 집합
	 *  ㄴ 능력있는 개발자는 메소드를 여러 개 만들어 코드를 분리함
	 * ③ 생성자
	 */
	
	/*
	 * 메소드의 기본 구조
	 * public : 접근제어자
	 * int : 반환 데이터타입(리턴 값)
	 * add : 메소드 이름(보통 동사로 작성을 합니다.)
	 * (int a, int b) : 인자값 or 매개변수 or 파라미터(v)
	 *  ㄴ 파라미터(v) : 메소드가 작업을 수행하는데 필요한 데이터
	 * return : 반환 데이터타입에 맞는 반환 값(메소드의 결과를 반환)
	 */
	// s3.add(10, 20); → 대입됨
	public int add(int a, int b) {
		return a + b;
	}
	// s3.minus(30, 10); → 대입됨
	public int minus(int a, int b) {
		return a - b;
	}
	/*
	 * 기습 문제 1.
	 * 곱하는 메소드, 나누기 메소드를 만들어보세요.
	 */
	public int mul(int a, int b) {
		// 반환 데이터타입하고 리턴타입은 동일해야합니다.
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	// 반환 데이터타입(int, String, double, char, boolean 등... 총 9가지+1가지(void))
	public String 취미를소개하다() {
		String 취미 = "등산";
		return 취미; // 반환 데이터타입과 리턴타입은 항상 일치해야함.
	}
	public void 취미를소개하다2() {
		//void는 '리턴 없음'을 의미(return 안 씀)
		System.out.println("취미는 운동입니다.");
	}
}
// ↓클래스 파일 하나에 public은 한 번만 작성 가능(파일명과 동일해야만 public 붙일 수 있음)
public class Java_Study_1212_1 {

	public static void main(String[] args) {
		
		/*
		 * Java 메모리 : Heap이라는 영역에 저장(인스턴스 변수)
		 */
		학생 s1 = new 학생(); // new : 클래스(학생)을 불러오다 → 클래스를 인스턴트화(객체화)하다
		s1.이름 = "홍길동"; // 클래스를 new 불러오면 → 필드변수 접근(.)이 가능
		s1.학년 = 3;
		System.out.println("이름 : "+s1.이름+", 학년 : "+s1.학년);
		System.out.println(s1); // Heap에 저장된 위치(메모리 주소) 조회
		
		// 동일한 클래스 한 번 더 호출하기
		학생 s2 = new 학생();
		System.out.println(s2); // Heap에 저장된 위치(메모리 주소) 조회
		s2.이름 = "김길동";
		s2.학년 = 1;
		System.out.println("이름 : "+s2.이름+", 학년 : "+s2.학년);
		
		s1.학년 = 1; // 홍길동 학년 수정
		System.out.println("이름 : "+s1.이름+", 학년 : "+s1.학년);
		
		학생 s3 = new 학생();
		System.out.println(s3); // 새로운 heap 영역에 저장
		
		int result = s3.add(10, 20);
		System.out.println("결과 : "+result);
		
		int result2 = s3.minus(30, 10);
		System.out.println("결과2 : "+result2);
		
		int result3 = s3.mul(30, 10);
		System.out.println("결과3 : "+result3);
		
		int result4 = s3.div(30, 10);
		System.out.println("결과4 : "+result4);
		
		String 취미 = s3.취미를소개하다();
		System.out.println("취미는"+취미);
		s3.취미를소개하다2();

	}

}
