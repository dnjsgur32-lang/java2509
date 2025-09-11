package kr.co.ext;

public class Animal {
	
	protected String name;
	protected int age;
	
	public Animal() {
		
	}

	public Animal(String name, int age) {
			this.name = name;
			this.age = age;
	}
	
	public void sound() {
		System.out.println("울음 소리");
	}

	public void displayInfo() {
		System.out.println("Animal >>" + "이름: " + name + "\n나이: " + age);
	}
		
}
