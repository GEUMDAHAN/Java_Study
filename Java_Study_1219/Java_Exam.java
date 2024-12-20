package Java_Study_1219;

public class Java_Exam {

	public static void main(String[] args) {
		/*
		 * 문제 1.
		 * 자바에서 상속을 구현할 때 사용하는 키워드는?
		 * ① extends
		 * ② implement
		 * ③ inherit
		 * ④ super
		 */
		
		// 답변 : ① extends
		
		
		/*
		 * 문제 2.
		 * 자바에서 모든 클래스의 최상위 클래스는?
		 * ① Main
		 * ② Super
		 * ③ Object
		 * ④ Base
		 */
		
		// 답변 : ③ Object
		
		
		/*
		 * 문제 3.
		 * 상속의 주요 장점이 아닌 것은?
		 * ① 코드 재사용
		 * ② 다형성 구현
		 * ③ 다중 상속 지원
		 * ④ 계층 구조 형성
		 */
		
		// 답변 : ③ 다중 상속 지원
		
		
		/*
		 * 문제 4.
		 * 자식 클래스가 부모 클래스의 메소드를 재정의하는 것은 무엇이라고 하는가?
		 * ① 오버로딩
		 * ② 오버라이딩
		 * ③ 캐스팅
		 * ④ 추상화
		 */
		
		// 답변 : ② 오버라이딩
		
		
		/*
		 * 문제 5.
		 * 자바에서 클래스가 여러 클래스를 동시에 상속받는 것은 허용하는가?
		 * ① 허용한다
		 * ② 허용하지 않는다
		 * ③ 특정 조건에서만 허용한다
		 * ④ 커파일러 설정에 따라 다르다
		 */
		
		// 답변 : ② 허용하지 않는다
		
		
		/*
		 * 문제 6.
		 * 상속을 통해 얻을 수 없는 이점은?
		 * ① 코드의 재사용성
		 * ② 다형성의 구현
		 * ③ 캡슐화의 향상
		 * ④ 구조적 설계의 용이성
		 */
		
		// 답변 : ④ 구조적 설계의 용이성
		
		
		/*
		 * 문제 7.
		 * 상속 관계에서 자식 클래스의 객체를 생성할 때 가장 먼저 호출되는 생성자는?
		 * ① 자식 클래스의 생성자
		 * ② 부모 클래스의 생성자
		 * ③ Object 클래스의 생성자
		 * ④ 매개변수가 없는 기본 생성자
		 */
		
		
		// 답변 : ② 부모 클래스의 생성자
		
		
		/*
		 * 문제 8.
		 * 다음과 같은 Animal 클래스가 주어졌을 때, 이를 상속받는 Dog 클래스를 작성하세요.
		 * 
		 * class Animal {
		 * 		public void makeSound() {
		 * 			System.out.println("The animal makes a sound");
		 * 		}
		 * }
		 * 
		 * Dog 클래스는 makeSound() 메소드를 오버라이드하여 "The dog barks"를 출력해야 합니다.
		 */
		
		// 답변 : Quiz_8 클래스에서..
		
		
		/*
		 * 문제 9.
		 * class Vehicle {
		 * 		protected String brand = "Ford";
		 * 		public void honk() {
		 * 			System.out.println("Tuut, tuut!");
		 * 		}
		 * }
		 * 
		 * class Car extends Vehicle {
		 * 		private String modelName = "Mustang";
		 * 
		 * 		public Car() {
		 * 			System.out.println("Car constructor called");
		 * 		}
		 * 		
		 * 		@Override
		 * 		public void honk() {
		 * 			System.out.println("Beep, beep!");
		 * 		}
		 * 
		 * 		public void printInfo() {
		 * 			System.out.println(brand+" "+modelName);
		 * 		}
		 * }
		 * 
		 * public class Main {
		 * 		public static void main(String[] args) {
		 * 			Car myCar = new Car();
		 * 			myCar.honk();
		 * 			myCar.printInfo();
		 * 
		 * 			Vehicle myVehicle = new Car();
		 * 			myVehicle.honk();
		 * 		}
		 * }
		 * 
		 * 이 코드의 실행 결과는 무엇인가요?
		 */

		// 답변 : Quiz_9 클래스에서..
	}

}
