package kr.co.ext;

public class Exten {

	public Exten() {
//		상속 기능 구현

//		최상위 클래스 Animal
		/*
		 * Dog dog９ = new Dog(); Cat cat９ = new Cat();
		 */
		Dog dog = new Dog("똘이", 2, "골든리트리버");
		Cat cat = new Cat("나비", 3, "페르시안");

		/*
		 * dog.name = "나의 강아지"; cat.name = "나의 고양이";
		 * 
		 * System.out.println(dog.name); System.out.println(cat.name);
		 */
		
		System.out.println(dog.name + dog.age + dog.breeds);
		System.out.println(cat.name + cat.age + cat.breeds);
	
		
		dog.displayInfo();
		System.out.println("-----------");
		cat.displayInfo();
		
		System.out.println("-----------");
		dog.sound();
		cat.sound();
		
		
	}
}
