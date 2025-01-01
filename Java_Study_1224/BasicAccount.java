package Java_Study_1224; // 두 번째 순서 : 'BasicAccount' 클래스 만들기


public class BasicAccount implements Account { // 인터페이스를 '구현(implements)'한 기본 계좌 클래스
	
	/*
	 * 인터페이스를 구현한 클래스는 '재정의'를 무조건 해야합니다.(계약)
	 * 실무에서 extends보다 implements를 더 많이 사용함
	 */
	
	// 필드변수에는 접근지정자(public, private)를 사용할 수 있음
	private String accountNumber; // 계좌번호(필드변수)
	private double balance; // 잔액(필드변수)
	/*
	 * + 추가할 수 있는 정보들?
	 * ① 이름(소유주)
	 * ② 개설일
	 * ③ 은행 종류(농협, 신한..)
	 */
	
	public BasicAccount(String accountNumber) { // 생성자(초기화 함수)
		this.accountNumber = accountNumber;
		this.balance = 0;
		/*
		 * ① 생성자 이름과 클래스 이름은 동일해야함
		 * ② 생성자는 리턴타입이 없음
		 */
		
	}
	@Override
	public void deposit(double amount) { // 입금
		if (amount > 0) {
			this.balance += amount;
			System.out.println("입금 완료 : "+amount);
		} else {
			System.out.println("유효하지 않은 금액입니다.");
		}
	}

	@Override
	public boolean withdraw(double amount) { // 출금
		if (amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			System.out.println("출금 완료 : "+amount);
			return true;
		} else {
			System.out.println("출금 실패 : 잔액 부족 또는 유효하지 않은 금액입니다.");
			return false;
		}
	}

	@Override
	public double getBalance() { // 잔액 조회
		// 필드변수가 private이기 때문에 메소드로 필드변수를 호출할 수 있게 만든다.
		return this.balance;
	}

	@Override
	public String getAccountNumber() { // 계좌번호 조회
		// 필드변수가 private이기 때문에 메소드로 필드변수를 호출할 수 있게 만든다.
		return this.accountNumber;
	}
	

}
