package co.kr.vehicle;

public class Truck extends Vehicle {
	public Truck(String brand, int year) {
		super(brand, year);
	}

	@Override
	public void move() {
		System.out.println("트럭이 화물을 싣고 달립니다!");
	}
	
}
