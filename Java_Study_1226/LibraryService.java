package Java_Study_1226; // ① 인터페이스를 가장 먼저 구현합니다.
/*
 * 인터페이스는 '기능 선언' 만 가능합니다.
 * 인터페이스 명명규칙 : 뒤에 'Service' 를 붙임
 */
public interface LibraryService {
	
	void addBook(Book book); // 도서 추가
	void searchBook(String keyword); // 도서 검색
	
}
