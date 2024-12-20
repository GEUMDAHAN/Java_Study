package Java_Study_1220.Bank;

// Account 인터페이스를 구현한 기본 계좌 클래스입니다.
public class BasicAccount implements Account {
	
	//  잔액, 계좌번호 필드변수
	private String accountNumber; // private : 접근지정자 중 하나, 클래스 호출 시 '직접 접근 불가능'
	private double balance;
	
	public BasicAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	@Override
	public void deposit(double amount) { // amount : 입금할 금액
		if(amount > 0) { // 입금할 금액이 0원 이상이라면?
			balance += amount;
			System.out.println("입금 완료 : "+amount);
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}

	@Override
	public boolean withdraw(double amount) { // amount : 출금할 금액
		if (amount > 0 && balance >= amount) {
			// && : AND 연산자(모든 조건이 만족해야함)
			// balance >= amount : 내 잔액이 출금 금액보다 같거나 커야 출금 가능
			balance -= amount;
			System.out.println("출금 완료 : "+amount);
			return true;
		} else {
			System.out.println("잔액이 부족합니다.");
			return false;
		}
	}

	@Override
	public double getBalance() {
		return this.balance; // 잔액 리턴
	}

	@Override
	public String getAccountNumber() {
		return this.accountNumber; // 계좌번호 리턴
	}

}
