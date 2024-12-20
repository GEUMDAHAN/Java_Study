package Java_Study_1212;

class Book {
	String 제목; // 필드변수(전역변수) : 초기화 생략 가능(= 0; 이런거)
	String 저자;
}

public class Java_Quiz_14 {

	public static void main(String[] args) {
		
		Book b = new Book();
		b.제목 = "2025AI강의";
		b.저자 = "박태웅";

	}

}
