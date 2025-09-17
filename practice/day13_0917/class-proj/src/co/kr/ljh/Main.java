package co.kr.ljh;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "초코";
		d.eat(); //부모 기능
		d.bark(); //자식 기능
		
		Cat c = new Cat();
		c.name = "나비";
		c.eat(); //부모기능
		c.meow(); //자식기능
	}

}
