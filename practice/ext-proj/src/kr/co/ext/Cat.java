package kr.co.ext;

public class Cat extends Animal {

 String breeds;


	//	String name;
//	기본초기화(부모 기본 초기화)
	public Cat(String name, int age) {
		super(name, age);
	}

	public Cat(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}
	
	@Override
		public void sound() {
			super.sound();
			System.out.println(name + "가 야옹야옹");
		}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Cat: " + this.breeds);
	}


}
