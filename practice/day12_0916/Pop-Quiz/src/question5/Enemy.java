package question5;

//Enemy(추상): 공통 구현 + 반드시 구현해야 하는 추상 동작 포함
public abstract class Enemy {
	String name; // 필드: 적 이름
	

	public Enemy(String name) {
		this.name = name; // 생성자: 이름 초기화
	}
	
	public void taunt() {
		// 구체 메서드: 공통으로 제공되는 동작
		System.out.println(name + " 이(가) 으르렁거린다!");
	}
	
	public abstract void attack(); // 추상 메서드: 자식이 반드시 구현

}
