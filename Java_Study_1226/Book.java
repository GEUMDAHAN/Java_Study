package Java_Study_1226; // ③ Book에 관련된 정보들만 작성합니다.

public class Book {
	
	private String title; // 제목
	private String author; // 저자
	private String isbn; // 도서 고유 번호
	
	// 생성자로 전역변수(필드변수) 초기화
	public Book (String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	// getter 함수 생성
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public String toString() { // 도서 출력
		return "제목 : "+title+", 저자 : "+author+", ISBN : "+isbn;
	}


}
