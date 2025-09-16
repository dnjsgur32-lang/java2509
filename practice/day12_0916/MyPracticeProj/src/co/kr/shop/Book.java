package co.kr.shop;

public class Book extends Product {

	public Book(String name, int price) {
		super(name, price);
	}

	@Override
	public void sell() {
		System.out.println("책 \"" + name + "\" 판매 완료!");
	}
}

