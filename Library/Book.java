package Library;

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
}
