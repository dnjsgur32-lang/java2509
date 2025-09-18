package com.ljh.oop;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal("동물");
		Dog d = new Dog("바둑이");
		Cat c = new Cat("나비");
		
		Exten.run(a, d, c);
				
	}

}
