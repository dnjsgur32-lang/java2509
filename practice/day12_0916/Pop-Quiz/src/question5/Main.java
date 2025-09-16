package question5;

//Main: 추상 클래스는 직접 생성 불가 → 자식으로 생성해 사용
public class Main {

	public static void main(String[] args) {
		Enemy g = new Goblin("스니크"); // 업캐스팅으로 다형성 활용
		g.taunt(); // 공통 동작 실행
		g.attack(); // 자식이 구현한 동작 실행
	}

}
