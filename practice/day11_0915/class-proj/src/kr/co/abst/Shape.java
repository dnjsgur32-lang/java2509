package kr.co.abst;

public abstract class Shape {
//추상 클래스 : 객체를 직접 생성할 수 없고,
//     자식 클래스가 반드시 구현해야 하는 추상 메서드를 포함할 수 있는 클래스.
	public Shape() {

	
	}
//추상 메서드 : 구현부 {} 가 없는 메서드 자식 클래스가
//	        오바리이딩을 해서 써야 함.
	abstract String getShapeType();
}
