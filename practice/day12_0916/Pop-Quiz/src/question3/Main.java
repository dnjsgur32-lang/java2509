package question3;

//Main: 몬스터 객체를 여러 개 만들고 동작을 실행한다
public class Main {

	public static void main(String[] args) {
		// new로 실체(객체) 생성
		Monster m1 = new Monster("오우거", 80);
		Monster m2 = new Monster("고블린", 40);
		Monster m3 = new Monster("트롤", 120);

		// 객체의 동작 실행 (메서드)
		m1.roar();
		m2.roar();
		m3.roar();
	}

}
