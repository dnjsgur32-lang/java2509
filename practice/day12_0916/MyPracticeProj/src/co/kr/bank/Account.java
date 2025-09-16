package co.kr.bank;

public abstract class Account implements Transactionable {
	String owner; //계좌주
	int balance; // 계좌 잔액
	
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	//공통 기능 : 계좌 정보 출력
	public void displayInfo() {
		System.out.println("예금주: " + owner + ", 잔액: " + balance + "원");
	}

	@Override
	public void doTransaction(int amount) {		
	}
	
	
}
