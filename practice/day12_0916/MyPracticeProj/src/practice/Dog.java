package practice;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age); // 부모를 호출
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍!");
	}

}
