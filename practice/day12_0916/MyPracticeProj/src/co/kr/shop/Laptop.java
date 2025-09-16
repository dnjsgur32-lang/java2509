package co.kr.shop;

public class Laptop extends Product {

	public Laptop(String name, int price) {
		super(name, price);
	}

	@Override
	public void sell() {
		System.out.println("노트북 \"" + name + "\" 판매 완료!");
	}
	
}
