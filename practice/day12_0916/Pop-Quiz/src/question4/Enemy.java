package question4;

//Enemy: 모든 적의 공통 설계(부모 클래스)
public class Enemy {
	String name; // 필드: 적 이름

	public Enemy(String name) {
		this.name = name; // 생성자: 이름 초기화
	}

	public void info() {
		// 메서드: 부모 기본 정보 출력
		System.out.println("적: " + name);
	}
}
