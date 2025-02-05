package Java_Study_0102;

import java.util.ArrayList;

class Book { // Book 클래스
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
}

public class Java_Review_2 {

	public static void main(String[] args) {
		
		// Book 객체를 저장할 ArrayList 생성
		ArrayList<Book> library = new ArrayList<>();
		
		Book b = new Book("자바의 정석", "남궁성"); // 방법. 1
		
		// 도서관에 책을 넣어볼게요
		library.add(b);
		library.add(new Book("데이터 구조와 알고리즘", "폰 노이만")); // 방법. 2
		library.add(new Book("2025 AI강의", "박태웅"));
		
		
		/*
		 * 기습 문제 1.
		 * for-each문으로 저장된 도서를 하나씩 출력해보세요.
		 */
		
		for (Book book : library) {
			System.out.println("제목 : "+book.getTitle()+", 저자 : "+book.getAuthor());
		}
		
		
		// ArrayList 크기 확인
		System.out.println("도서관에 있는 책의 수 : "+library.size());
		
		// 특정 인덱스의 책 정보 가져오기
		Book book2 = library.get(1); // 1번 index 요소 가져오기
		System.out.println("책 이름 : "+book2.getTitle());
		
		
		/*
		 * 기습 문제 2.
		 * 0번째 요소 삭제 후, 사이즈 출력해보세요.
		 */
		
		library.remove(b);
		System.out.println("(수정된)도서관에 있는 책의 수 : "+library.size());

	}

}
