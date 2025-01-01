package Java_Study_1224; // 첫 번째 순서 : 인터페이스 만들기

// interface OR class 명명규칙 '대문자로 시작'(모든 언어의 규칙)
public interface Account { // 계좌의 기본 기능을 정의(선언)합니다.
	/*
	 * 인터페이스 특징
	 * ① 구현 불가능(선언만 가능)
	 * ② public만 작성 가능
	 */
	public void deposit(double amount); // 입금
	public boolean withdraw(double amount); // 출금
	public double getBalance(); // 잔액 조회
	String getAccountNumber(); // 계좌번호 조회
	/*
	 *  void, boolean... : 메소드 리턴타입
	 *  deposit, withdraw... : 메소드 명
	 *  () : 파라미터
	 */

}
