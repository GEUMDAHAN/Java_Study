package Java_Study_1226;

class Book_ {
	
	String title; // 전역변수(필드변수)
	int price; // 전역변수(필드변수)
	
	public Book_ (String title, int price) { // 파라미터에 있는 title과 price도 지역변수
		this.title = title;
		this.price = price;
	}
	
	public void showBook() {
		String author = "작자미상"; // 지역변수 showBook 메소드 안에서만 사용 가능
		System.out.println("title : "+title); // 메소드 안에서 전역변수 접근 가능
		System.out.println("price : "+price);
	}
	
	public void showAuthor() {
		String author = "작자미상";
		int price = 100; // 지역변수 price
		System.out.println("author : "+author); // author를 불러내려면 메소드 안에 author가 있어야 함.
		System.out.println("title : "+title); // 전역변수는 어디든 사용 가능(단, 클래스 안에서)
		System.out.println("price : "+price); // 지역변수 price 호출
		System.out.println("price : "+this.price); // 전역변수(필드변수) price 호출
	}
	
}

public class Java_Review {

	public static void main(String[] args) {
		
		// 자바는 클래스(객체)도 '데이터 타입' 이다.
		Book_[] bookList = new Book_[2]; // Book 타입을 저장하는 배열
		
		// 배열에다 데이터를 넣는 두 가지의 방법
		// ① 변수 선언 후,
		Book_ book1 = new Book_("자바의 정석", 2000);
		bookList[0] = book1; // 0번 인덱스에 book1 대입
		// ② 다이렉트로
		bookList[1] = new Book_("파이썬의 정석", 1000);
		
		// ① 향상된 for문
		int priceSum = 0;
		for (Book_ b : bookList) {
			b.showBook();
			/*
			 * 기습 문제 1.
			 * 책 제목이 '자바의 정석' 인 책의 정보를 출력하기
			 * 
			 * 기습 문제 2.
			 * bookList에 저장된 책의 총 price는 얼마인지 구하기
			 */
			if (b.title.equals("자바의 정석")) {
				b.showBook();
			}
			if ("자바의 정석".equals(b.title)) {
				b.showBook();
			}
			priceSum += b.price;
		}
		System.out.println("총 합 : "+priceSum);
		
		// ② 일반 for문
		for (int i = 0; i < 2; i++) {
			bookList[i].showBook();
		}

		
	}

}
