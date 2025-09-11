
public class Animal {
//	필드
	
	String name;
	int age;

//	생성자
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println(age + "살 동물 " + name + "가 소리를 냅니다!");
	}

}
