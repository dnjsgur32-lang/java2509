package question4;

// Orc: Enemy를 상속받아 정보 표시를 재정의(오버라이드)
public class Orc extends Enemy {
	public Orc(String name) {
		super(name); // 부모 생성자 호출로 필드 초기화
	}

	@Override
	public void info() {
		// 메서드 재정의: 자식 고유의 출력 형식 적용
		System.out.println("오크 전사: " + name);
	}
}
