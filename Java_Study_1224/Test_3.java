package Java_Study_1224;

public class Test_3 {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); // Bank 호출
		
		// 계좌 생성
		String 계좌번호1 = "123456";
		bank.createAccount(계좌번호1);
		
		String 계좌번호2 = "777777";
		bank.createAccount(계좌번호2);
		
		// 계좌 번호 777777 찾기
		BasicAccount basicAccount = bank.findAccount(계좌번호2);
		
		basicAccount.deposit(50000); // 찾은 계좌에 5만원 입금
		
		System.out.println("계좌번호 : "+basicAccount.getAccountNumber());
		System.out.println("잔액 : "+basicAccount.getBalance());
		
		
		/*
		 * 기습 문제 1.
		 * 계좌번호가 9999인 계좌번호3을 생성하고
		 * 계좌번호3에 10만원 입금
		 * 계좌번호3에 5만원 출금
		 * 계좌번호3에 최종 잔액 출력하기
		 */
		System.out.println("======================");
		bank.createAccount("9999"); // 계좌번호가 9999인 계좌번호3을 생성
		BasicAccount basicAccount2 = bank.findAccount("9999");
		
		basicAccount2.deposit(100000); // 10만원 입금
		basicAccount2.withdraw(50000); // 5만원 출금
		
		System.out.println("계좌번호 : "+basicAccount2.getAccountNumber());
		System.out.println("잔액 : "+basicAccount2.getBalance());
		
		/*
		 * 최종 순서
		 * Account → BasicAccount(입금, 출금, 잔액 확인, 계좌 확인)
		 * → Bank(계좌 찾기, 생성) → Main 함수로 출력해보기(20일 수업 BankingSystem 참고)
		 */

	}

}
