package co.kr.student;

public class HighStudent extends Student {
	

	public HighStudent(String name, int age) {
		super (name, age);
	}

	@Override
	public void Study() {
		System.out.println(name + "(고등학생)이 시험 공부를 합니다!");
		
	}
	
	
}
