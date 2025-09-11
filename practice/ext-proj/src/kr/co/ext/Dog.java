package kr.co.ext;

public class Dog extends Animal {

 String breeds;

	//	String name;
//	기본초기화(부모 기본 초기화)
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}
	
	@Override
		public void sound() {
		super.sound();
		System.out.println(name + "가 멍멍 멍멍");
		}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Dog: " + this.breeds);
	}

	

	
}
