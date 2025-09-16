package co.kr.shop;

public class Phone extends Product {
	
	

	public Phone(String name, int price) {
		super(name, price);
	}

	@Override
	public void sell() {
		System.out.println("휴대폰 \"" + name + "\" 판매 완료!");
	}

}
