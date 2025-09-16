package co.kr.bank;

public class SavingAccount extends Account {
	public SavingAccount(String owner, int balance) {
		super(owner, balance);
	}

	@Override
	public void doTransaction(int amount) {
		balance += amount; //금액을 더해주는 방식
		System.out.println(owner + "의 적금 계좌: " + amount + "원 거래 완료,"
				+ " 현재 잔액 = " + balance + "원");
	}
	
	
}
