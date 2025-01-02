package Java_Study_1217;

/*
 * 객체지향 개념
 * 클래스 : 필드변수(전역변수), 메소드, 생성자(리턴타입이 없는 메소드)
 */
class 자동차 {
	/*
	 * 필드변수
	 * ① default 초기값이 존재
	 * 예)String은 null 값이 자동으로 대입, int는 0값이 자동으로 대입)
	 * ② 모든 메소드에서 필드변수를 사용할 수 있음
	 * ③ 필드변수 → 실무에서는 속성(attribute)이라고 부름
	 */
	String 브랜드명; // 필드변수(전역변수)
	String 자동차타입;
	
	public 자동차() { // 기본(default)생성자
		/*
		 * 기본생성자 특징
		 * ① 메소드이름(자동차)이 클래스이름과 동일해야함
		 * ② 리턴타입이 없음
		 * ③ 필드변수 값을 초기화하기 위해 사용
		 */
		
		/*
		 * public : 접근지정자(*public, *private, protected, default)
		 * int : 리턴 데이터 타입
		 * getNumber : 메소드 이름(동사로 지어야 함)
		 * (int x, int y) : 파라미터 or 인자 or 인수
		 */
	}
		public int getNumber(int x, int y) {
			int result = x + y;
			return result; // 리턴을 선언했으면 리턴 데이터타입에 맞는 값을 return 해야함
	}
		/*
		 * 기습 문제 1.
		 * 구매한 옷의 가격 int price가 파라미터로 주어졌을 때
		 * 지불해야할 금액을 return하도록 getMoney 함수(메소드) 로직을 완성하세요.
		 * (price(금액)가 50만원 이상이면 20% 할인, 30만원 이상이면 10% 할인, 10만원 이상이면 5% 할인)
		 */
		public int getMoney(int price) {
			if (price >= 500000) {
				price *= 0.8;
			} else if (price >= 300000) {
				price *= 0.9;
			} else if (price >= 100000) {
				price *= 0.95;
			}
			return price;
		}
		
		
		/*
		 * 기습 문제 2.
		 * 정수를 담고 있는 배열 arr가 파라미터로 주어졌을 때,
		 * arr의 평균 값을 return하는 함수 getAvg를 완성해보세요.
		 * ① 메소드 만들어보기
		 * ② 로직 구현해보기
		 */
		public double getAvg(int[] arr) {
			double avg = 0; // 메소드 안에 있는 변수(지역변수 → 초기화를 해줘야 함)
			double sum = 0;
			for (int i : arr) { // for-Each문
				sum += i;
			}
			avg = sum / arr.length; // 평균 값 구하기
			return avg;
		}
		
		
		/*
		 * 기습 문제 2.
		 * 정수를 담고 있는 배열 arr가 파라미터로 주어졌을 때,
		 * 배열 값 중 원소가 짝수면 해당 원소를 2로 나누고 다시 해당 원소에 대입
		 * 최종 배열 arr를 return하는 함수 getArr를 완성해보세요. 
		 */
		public int[] getArr(int[] arr) { // 배열도 리턴할 수 있음
			for (int i = 0; i < arr.length; i++) {
				int index = arr[i]; // 배열 원소값 index에 대입
				if (index % 2 == 0) { // 해당 원소가 짝수라면?
					arr[i] = index / 2; // 2로 나누고 다시 원소에 대입
				}
			}
			return arr;
		}
		
		
		/*
		 * 기습 문제 3.
		 * 정수를 담고 있는 배열 arr가 파라미터로 주어졌을 때,
		 * 배열 arr에 총 합을 return하는 함수 getArrSum을 완성해보세요.
		 */
		public int getArrSum(int[] arr) {
			int sum = 0; // 총 합 변수 선언
			for (int i : arr) {
				sum += i;
			}
			return sum;
		}
}

public class Java_Review_1 {

	public static void main(String[] args) {
		
		자동차 car1 = new 자동차();
		// new : 클래스를 호출(인스턴스화)
		// 자동차() :  default 생성자
		
		int 리턴값 = car1.getNumber(10, 20);
		System.out.println("리턴 결과 : "+리턴값);
		int 최종값 = car1.getMoney(340000);
		System.out.println("결과 : "+최종값);
		int[] array = {80, 90, 100, 100};
		double 평균값 = car1.getAvg(array); // 배열 파라미터에 넘겨주기
		System.out.println("배열 평균 값 : "+평균값);
	}

}