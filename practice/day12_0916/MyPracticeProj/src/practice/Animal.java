package practice;

public abstract class Animal implements Soundable {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("이름: " + name + " , 나이: " + age);
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
	
}
