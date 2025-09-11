package Com.ex.st;

public class Student6 {
//	클래스 내에서 공통적으로 사용되는 값을 저장.
	String name;
	int age = 20;
	String studentId;

//---------------	클래스가 오브젝트로 처음 생성 될 때, 어떻게 생설 될 것인가~
//	기본생성자_커스터마이징
	public Student6() {
		System.out.println(name + age + studentId);
		System.out.println("기본_학생이 생성 되었습니다.");
	}
	
//	매개변수가 있는 생성자(필수 입력)
	public Student6(String argName, String argStudentId) {
		this.name = argName;
		this.studentId = argStudentId;
		
//		System.out.println(studentId + "-" + name + " 학생이 생성 되었습니다.");
		System.out.println("^^" + this.studentId + "-" + this.name + " 학생이 생성 되었습니다.");
	}
	
	public Student6(String argName, int argAge, String argStudentId) {
		this.name = argName;
		this.age = argAge;
		this.studentId = argStudentId;
		
		System.out.println(studentId + "-" + name + " 학생이 생성 되었습니다." + "-" + age);
		System.out.println(this.studentId + "-" + this.name + " 학생이 생성 되었습니다." + "-" + this.age);
	}

	//--------------- 클래스를 통한 오브젝트를 생성했을때, 액션
	
	public void study() {
		System.out.println("^^" + this.name + "님이 공부를 합니다.");
		
	}

	public void introduce() {
		System.out.println("^^" + this.name + " 학생을 소개합니다.");
		
	}
}


	











