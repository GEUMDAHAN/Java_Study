package Java_Study_1217;

import java.util.Scanner;

/*
 * 계산기 클래스는 더 이상 수정 불가능하다면?(내장클래스는 실제 수정 불가능)
 * 예)Scanner, Random 클래스 → 내장클래스(자바를 설치했을 때 이미 내장되어 있는 클래스들)
 */
class 계산기 {
	// 파라미터 값을 각 더해서 리턴하는 함수 sum
	public int sum(int x, int y) {
		return x + y;
	}
}
// 눈치 빠른 개발자는 '계산기 클래스'를 그대로 복사해서 하나 더 만들어요.
class 계산기2 {
	// 파라미터 값을 각 더해서 리턴하는 함수 sum
	public int sum(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
}
/*
 * ★extends : 상속
 * 상속을 이용해 '계산기' 클래스 기능을 물려받을 수 있음
 * '계산기3'(자식클래스 == subClass)는 '계산기'(부모클래스 == superClass)에 있는 필드변수와 메소드를 사용할 수 있다.
 */
class 계산기3 extends 계산기 {
	// 부모클래스에 있는 메소드 가져오기
	// ★@Override : 오버라이딩(부모클래스 메소드 '재정의')
	/*
	 * 오버로딩 : 메소드 '이름 중복 허용'(파라미터 타입을 다르게 지정)
	 * 오버라이딩 : 부모클래스에 정의된 메소드를 자식클래스에서 호출해서 '재정의'
	 */
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return super.sum(x, y);
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
}

public class Java_Study_1217_1 {

	public static void main(String[] args) {
		
		계산기 계산기1 = new 계산기();
		int result = 계산기1.sum(10, 10);
		System.out.println("결과 : "+result);
		
		Scanner scan = new Scanner(System.in); // Ctrl+Shift+o
		
		계산기3 계산기3 = new 계산기3();
		계산기3.sum(10, 20); // 자식클래스가 부모클래스에 있는 메소드 사용 가능
		}
	}
