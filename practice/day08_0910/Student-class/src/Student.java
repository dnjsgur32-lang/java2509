
public class Student {

	public String name;
	public int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	public void study() {
		System.out.println(name + " 학생이 공부합니다.");
	}

	public void introduce() {
		System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
	}

}
