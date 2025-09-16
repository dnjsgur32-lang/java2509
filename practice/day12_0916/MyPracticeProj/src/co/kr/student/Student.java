package co.kr.student;

public abstract class Student implements Studyable {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("이름: " + name + ", 나이: " + age);
	}

	@Override
	public abstract void Study();
	
	
}
