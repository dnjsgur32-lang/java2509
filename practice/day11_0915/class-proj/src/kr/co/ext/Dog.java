package kr.co.ext;

public class Dog extends Animal {
// 선언부
	String breeds = "골든리트리버";
	
	public Dog(String name, int age, String breeds) {
		//new Dog("멍멍이", 3, "골든리트리버");
		super(name, age);
		
//		구현부 : 값을 넣는 곳
		this.breeds = breeds;
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
		System.out.println("멍멍");
	}
	
	public void wagTail() {
		System.out.println("강아지가 꼬리를 흔듭니다.");

	}

//	public Dog() {
//		
//	}
	
}
