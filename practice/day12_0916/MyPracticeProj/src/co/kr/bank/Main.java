package co.kr.bank;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Account saving = new SavingAccount("김철수", 5000);
		Account checking = new CheckingAccount("이영희", 10000);
		
		//공통 메서드
		saving.displayInfo();
		checking.displayInfo();
		
		//각 계좌 기능 실행
		saving.doTransaction(2000); //입출금 기능
		checking.doTransaction(3000);
		
		//다형성 활용
		Transactionable[] accounts = { saving, checking };
		for (Transactionable acc : accounts) {
			acc.doTransaction(1000);
		}
	}

}
