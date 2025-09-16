package question4;

public class Main {
	// Main: 부모/자식 객체를 생성하고 오버라이드 동작을 확인한다
	public static void main(String[] args) {
		Enemy enemy = new Enemy("정찰병"); // 부모 타입 객체
		Orc orc = new Orc("그롬"); // 자식 타입 객체

		enemy.info(); // 부모 메서드 호출
		orc.info(); // 자식이 재정의한 메서드 호출
	}

}
