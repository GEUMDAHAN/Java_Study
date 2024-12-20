package Java_Study_1217;

class 식당 {
	String 식당이름;
	String 음식타입; // 중식, 일식, 한식...
	/*
	 * 메소드(생성자) 이름은 동일하면 안되는데,
	 * 파라미터 타입만 다르면 메소드 이름을 중복해서 사용할 수 있음 → '오버로딩(Overloading)'
	 */
	public 식당() { // 디폴트 생성자
		
	}
	public 식당(String 식당이름, String 음식타입) {
		// this.식당이름 : 필드변수를 가르킴
		this.식당이름 = 식당이름;
		this.음식타입 = 음식타입;
	}
	
	// 출력용 메소드 만들어보기
	public void 식당이름출력하다() {
		//void : 리턴할 게 없음
		System.out.println("식당명 : "+this.식당이름);
		System.out.println("타입명 : "+this.음식타입);
	}
}

public class Java_Review_2 {

	public static void main(String[] args) {
		
		식당 a = new 식당(); // 기본 생성자 선택
		a.식당이름 = "스바라시봉명점";
		a.음식타입 = "일식";
		// System.out.println(a.식당이름);
		// System.out.println(a.음식타입);
		a.식당이름출력하다(); // 메소드를 이용해서 코드량 줄이기
		
		식당 b = new 식당("맛찬들", "한식"); // 파라미터가 있는 생성자 선택
		// System.out.println(b.식당이름);
		// System.out.println(b.음식타입);
		b.식당이름출력하다(); // 메소드를 이용해서 코드량 줄이기
		/*
		 * 메소드
		 * ① 코드량 줄이기 가능
		 * ② 코드 재사용성 증가
		 * ③ 코드 유지보수 & 협업 능률 증가
		 */

	}

}
