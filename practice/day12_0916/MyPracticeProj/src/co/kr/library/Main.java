package co.kr.library;

public class Main {

	public static void main(String[] args) {
		LibraryItem b1 = new Book("자바의 정석");
		LibraryItem m1 = new Magazine("과학 월간지");
		
		// 부모 클래스 메서드
		b1.displayInfo();
		m1.displayInfo();
		
		// 인터페이스 메서드
		b1.borrow();
		m1.borrow();
		
		// 다형성 활용
		Borrowable[] items = { b1, m1 };
		for (Borrowable i : items) {
			i.borrow();
		}
	}
}
