
public class Car {
//	필드(속성)
	String model;
	int year;
	
//	생성자(초기화 시키는 도구)
	public Car(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
//	메소드 (실행)
	public void drive() {
		System.out.println(year + "년식 " + model + "가 달립니다!");
	}

	public void honk() {
		System.out.println("빵빵! 경적을 울립니다.");
	}

}
