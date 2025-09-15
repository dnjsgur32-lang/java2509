package kr.co.ext;

public class ExtClass {
	
	public ExtClass() {
		
//	오브젝트 new
//	Dog dog1 = new Dog();
//	Cat cat1 = new Cat();
	
	Dog dog = new Dog("멍멍이", 3, "골든리트리버");
	Cat cat = new Cat("야옹이", 2, true);
	
//	System.out.println(dog.name);
	System.out.println(dog.getName());
	System.out.println(dog.breeds);
	
	dog.makeSound();
	cat.makeSound();
	
	}
}
 