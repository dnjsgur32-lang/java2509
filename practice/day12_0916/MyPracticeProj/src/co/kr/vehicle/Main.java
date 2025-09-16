package co.kr.vehicle;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car = new Car("현대", 2023);
		Vehicle truck = new Truck("볼보", 2021);
		
		car.displayInfo();
		car.move();
		
		truck.displayInfo();
		truck.move();
		
	}

}
