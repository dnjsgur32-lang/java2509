package co.kr.student;

public class MiddleStudent extends Student {
	public MiddleStudent (String name, int age) {
		super (name, age);
	}

	@Override
	public void Study() {
		System.out.println(name + "(중학생)이 교과서를 공부합니다!");
	
	}
	
	
}